import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import correcteurOrthographique.Lexique;

import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

public class LanceRequete extends HttpServlet {
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='/monProjetTomcatLCI/css/response.css'/>");
        out.println("<link rel='stylesheet' href='/monProjetTomcatLCI/css/index.css'/>");
        out.println("<title>Lance requete!</title>");
        out.println("</head>");
        out.println("<body class='corpsReponse'>");
        out.println("<h1>Résultats :</h1>");

	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
      //  url = "jdbc:postgresql://tuxa/dblo17";
	// dans certaines configurations locales il faut d�finir l'url par :
	 url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	// ---- configure END

	Lexique dico = new Lexique();
	String requete;
    requete = request.getParameter("requete").toLowerCase();
	Boolean direct_request, only_request;
	direct_request = (request.getParameter("direct") != null);
	only_request = (request.getParameter("only_request") != null);
    String arbre = new String();
    String lemmedSentence = "";
    System.out.println(request);
    if(requete.equals("")){
    	out.println("<div class='advice warning'> Veuillez entrer une requete non nulle</div>");
    	return;
    }
    if(!only_request){
		if(!direct_request){
			lemmedSentence = lemmatisePhrase(requete, dico, true, out);
			if(!lemmedSentence.trim().replace(".", "").replace("?", "").equals(new String(requete).replace(".", "").replace("?", "").trim())){
				out.println("<div class='advice warning'><b>Vouliez vous dire :</b> '"+lemmedSentence+"' ?");
				out.println("<form action='LanceRequete' method='get' target='right'>"
								+ "<input type=hidden value='"+lemmedSentence+"' name='requete'>"
								+ "<input type=submit class='reponseButton' name='sentence' value='Oui'>"
							+ "</form></div>");
			}
			lemmedSentence = lemmatisePhrase(requete, dico,false,  out);
			out.println("<div class='advice info' ><b>Texte lemmatisé :</b> "+lemmedSentence+"</div>");
		}else{
		    lemmedSentence = lemmatisePhrase(requete, dico,false, out);
			out.println("<div class='advice info'> <b>Texte corrigé et lemmatisé: </b>"+lemmedSentence+"</div>");
		}
    }
	    try{
	    	if(!only_request){
				tal_sqlLexer lexer = new tal_sqlLexer(
						new ANTLRReaderStream(
								new StringReader(
										lemmedSentence
								)
						)
				);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				tal_sqlParser parser = new tal_sqlParser(tokens);
				arbre = parser.listerequetes();
	    	}else{
	    		arbre = requete;
	    	}
				
	 	} catch(RecognitionException e) { e.printStackTrace(); }
	    catch(IOException e) { e.printStackTrace(); }
    finally{
			if(arbre.replace(" ", "").equals(""))
				out.println("<div class='advice error' >La phrase n'est pas reconnue par la grammaire</div>");
			else{
				out.println("<div class='advice info' ><b>Requete : </b>" + arbre+"</div>");
				if (arbre != null) {
					// INSTALL/load the Driver (Vendor specific Code)
					try {
						Class.forName("org.postgresql.Driver");
						} catch(java.lang.ClassNotFoundException e) {
				    		System.err.print("ClassNotFoundException: ");
				    		System.err.println(e.getMessage());
						}
					try {
						Connection con;
						Statement stmt;
						// Establish Connection to the database at URL with usename and password
						con = DriverManager.getConnection(url, username, password);
						executeRequest(con, arbre, out);
						out.println("</body>");
						out.println("</html>");
						// Close resources
						con.close();
					}
					// print out decent erreur messages
					catch(SQLException ex) {
						System.err.println("==> SQLException: ");
						out.println("<div class='advice error'>La requete SQL n'a pas fonctionné, vérifier la syntaxe.</div>");
						while (ex != null) {
							System.out.println("Message:   " + ex.getMessage ());
							System.out.println("SQLState:  " + ex.getSQLState ());
							System.out.println("ErrorCode: " + ex.getErrorCode ());
							ex = ex.getNextException();
							System.out.println("");
				    			}
						}
			        	}
			}
    }
	
	}
    
	static public String lemmatisePhrase(String s, Lexique dico, boolean on_dictionary, PrintWriter out){
		   s.toLowerCase();
	       s = s.replace("'"," ").replace(".", "").replace("?", "");
	       String lemmedSentence = new String("");
	 	   String[] words = new String[50];
	 	   StringTokenizer st = new StringTokenizer(s);
	 	   Integer no_word = 0;
	 	   while( st.hasMoreElements() ){
	 	   		words[no_word] = st.nextToken();
	 	   	    ArrayList<String> foundLemmas = dico.findLemma(words[no_word],on_dictionary, out);
	 	   	    if( foundLemmas != null ){
	 	   	    		lemmedSentence += " "+(foundLemmas.isEmpty() ? 
	 	   	    			words[no_word] :
	 	   	    			foundLemmas.get(0) != Lexique.UNDEFINED_LEMMA ?
	 	   	    				foundLemmas.get(0) :
	 	   	    				"");
	 	   	    }
	 	   		no_word++;
	 	  }
	 	  lemmedSentence += ".";
	 	  return lemmedSentence.toLowerCase();
	}
	
	static public void executeRequest(Connection con, String requete, PrintWriter out) throws SQLException {
		Statement stmt;
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		// Send the query and bind to the result set
		ResultSet rs = stmt.executeQuery(requete);
		ResultSetMetaData rsmd = rs.getMetaData();
		int nbCols = rsmd.getColumnCount();
		if(!rs.next()){
			out.println("<div class='advice warning'>Aucun résultat</div>");
		}else{
			out.print("<br/><table>");
			for(int i=1; i<= nbCols; i++){
				out.print("<th>");
	 			String column_name = rsmd.getColumnLabel(i) ;
				out.print(column_name);
				out.print("</th>");
			}
			rs.beforeFirst();
			while (rs.next()) {
				out.print("<tr>");
	
				for(int i=1; i<= nbCols; i++){
		 			String result = rs.getString( rsmd.getColumnLabel(i) );
					out.print("<td>");
					if(rsmd.getColumnLabel(i).equals("fichier"))
						out.print("<a href='/monProjetTomcatLCI/BULLETINS/"+result+"'>"+result+"</a>");
					else if(rsmd.getColumnLabel(i).equals("email"))
							out.print("<a href='mailto:"+result+"'>"+result+"</a>");
					else
						out.print(result);
					out.print("</td>");
				}
				out.print("</tr>");
			}
			// Close resource
			stmt.close();
			out.print("</table>");
		}
	}
}
