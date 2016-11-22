package correcteurOrthographique;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Lexique {
	
	static String className;
	String fichierLemme = "/home/artus/workspace/monProjetTomcatLCI/lemme.txt";	
	String fichierGrammaire = "/home/artus/workspace/monProjetTomcatLCI/lemme-test.txt";
	public static final String UNDEFINED_LEMMA = "UNDEFINED";
			
	Map<String, String> dictionary, grammaire;
	Integer threshold_length = 2, //minimum de lettres pour etre traité
			threshold_prefix = 80;//%age de prefixe à avoir en commun
	float threshold_levenshtein = 15; //%age d'erreur max avec levenshtein
	
	static {
        className = "Lexique";
    }
	
	public Lexique() {
		dictionary = new HashMap<String, String>();
		File file = new File(fichierLemme);
		BufferedReader reader = null;
		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(text);
				String word = st.nextToken();
				String lemma = UNDEFINED_LEMMA;
				if(st.hasMoreElements()){
					lemma = st.nextToken();
				}
		    	dictionary.put(word, lemma);
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    }catch (IOException e) {
		    }
		}
		grammaire = new HashMap<String, String>();
		File gramm = new File(fichierGrammaire);
		try {
		    reader = new BufferedReader(new FileReader(gramm));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(text);
				String word = st.nextToken();
				String lemma = UNDEFINED_LEMMA;
				if(st.hasMoreElements()){
					lemma = st.nextToken();
				}
				grammaire.put(word, lemma);
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    }catch (IOException e) {
		    }
		}
    }
	
	public String getLemma(String word, boolean on_dictionary){
		if(on_dictionary)
			return dictionary.get(word);
		else
			return grammaire.get(word);
	}
	

	
	public double levenshtein(String mot1, String mot2){
		int i = 0,j=0, len1 = mot1.length(), len2 = mot2.length();
		double[][] Dist = new double[len1+1][len2+1];
		
		for (i = 0; i<=len1; i++){
			Dist[i][0] = i;
		}
		for (j = 0; j<=len2; j++){
			Dist[0][j] = j;
		}
			
		for(i = 1; i<=len1; i++){
			for(j = 1; j<=len2; j++){
				double kd = keyboardDistance(mot1.charAt(i-1),mot2.charAt(j-1));
				double d1 = Dist[i][j-1] + 1, 
						d2 = Dist[i-1][j] + 1;
				double d3 = Dist[i-1][j-1] + kd;
				Dist[i][j] = Math.min(Math.min(d1, d2), d3);
				if(kd == 1 && i == j){
					try{
						int index = mot2.indexOf(mot1.charAt(i-1));
						if(index != -1 && mot1.charAt(index) == mot2.charAt(i-1)){
							Dist[i][j] -= 0.5;
						}
					}catch(Exception e){
					}
				}
			}
		}
		return Dist[len1][len2];
	}
	
	public ArrayList<String> findLemma(String word, boolean on_dictionary, PrintWriter out){
		ArrayList<String> matchLemmas = new ArrayList<String>();
		Map<String, String> local_lexique;
		if(on_dictionary){
			local_lexique = dictionary;
		}else{
			local_lexique = grammaire;
		}
		
		word = word.toLowerCase();
		String result = this.getLemma(word, on_dictionary);
		
		if(result != null){
			matchLemmas.add(result);
			return matchLemmas;
		}
			
		
		if(word.length() <= threshold_length){
			matchLemmas.add(word);
			return matchLemmas;
		}
		
		float thresholdPrefix = threshold_prefix;
		for (Map.Entry<String, String> entry : local_lexique.entrySet()) {
			String lemma = entry.getValue(), compared = entry.getKey();
			
			
			if(compared.length() <= threshold_length)
				continue;
			
			if(!word.substring(0, threshold_length).equals(compared.substring(0, threshold_length)))
				continue;
				
			Float proximity = (float) 0;
			Integer i = 1;
			while(i < Math.min(compared.length(), word.length()) && 
				compared.charAt(i) == word.charAt(i)){
					proximity = ((float) i*100)/Math.max(compared.length(), word.length());
					i++;
				}
			
			i--;
			if(proximity > thresholdPrefix && !matchLemmas.contains(lemma)){
				matchLemmas.clear();
				matchLemmas.add(lemma);
				thresholdPrefix = proximity;
			}
		}
		
		if( !matchLemmas.isEmpty() ){
			return matchLemmas;
		}

		Float threshold_levenshtein_local = threshold_levenshtein;
		for (Map.Entry<String, String> entry : local_lexique.entrySet()) {
			String lemma = entry.getValue(), compared = entry.getKey();
			
			Float proximity = (float) levenshtein(compared, word)/Math.max(word.length(), compared.length())*100;

			if(proximity <= threshold_levenshtein_local){
				matchLemmas.clear();
				matchLemmas.add(lemma);
				threshold_levenshtein_local = proximity;
			}
			
		}
		
		return matchLemmas;
			
	}
	
	// key board mapping 
    private static final Map<Character, String> charSiblings;
    private static final double SCORE_MIS_HIT = 0.5;
    
    static {
        charSiblings = new HashMap<Character, String>();
        charSiblings.put('a', "zsq");
        charSiblings.put('z', "aqsde");
        charSiblings.put('e', "zsdfr");
        charSiblings.put('r', "edfgt");
        charSiblings.put('t', "rfghy");
        charSiblings.put('y', "tghju");
        charSiblings.put('u', "yhjki");
        charSiblings.put('i', "ujklo");
        charSiblings.put('o', "iklmp");
        charSiblings.put('p', "olm");
        charSiblings.put('q', "azedcxw");
        charSiblings.put('s', "qwxcdeza");
        charSiblings.put('d', "wsxcvfre");
        charSiblings.put('f', "edcvbgtr");
        charSiblings.put('g', "rfvbnhyt");
        charSiblings.put('h', "ytgbnju");
        charSiblings.put('j', "nhyuik");
        charSiblings.put('k', "juiol");
        charSiblings.put('l', "kiopm");
        charSiblings.put('m', "pol");
        charSiblings.put('w', "qsx");
        charSiblings.put('x', "wqsdc");
        charSiblings.put('c', "xsdfv");
        charSiblings.put('v', "cdfgb");
        charSiblings.put('b', "vfghn");
        charSiblings.put('n', "bghj");
    }
    
    private double keyboardDistance(char c1, char c2) {
        if (c1 == c2) {
            return 0;
        }
        String s = charSiblings.get(c1);
        if (s != null && s.indexOf(c2) > -1) {
            return SCORE_MIS_HIT;
        }
        return 1;
    }
}