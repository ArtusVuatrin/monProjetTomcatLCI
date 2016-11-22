// $ANTLR null E:\\LO17\\antlr\\tal_sql\\tal_sql.g 2016-06-17 11:39:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ARTICLE", "BEFORE", 
		"EMAIL", "EN", "ENTRE", "ET", "FICHIER", "MOINS", "MONTHLetter", "MOT", 
		"MOTS", "NUM", "NUMBERLETTER", "NUMERO", "OBJET", "OU", "PAS", "PLUS", 
		"POINT", "RUBRIQUE", "SELECT", "SELECTCOUNT", "TEXTE", "TITRE", "VAR", 
		"WS", "WrittenBy", "'-'", "'/'"
	};
	public static final int EOF=-1;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int AFTER=4;
	public static final int ARTICLE=5;
	public static final int BEFORE=6;
	public static final int EMAIL=7;
	public static final int EN=8;
	public static final int ENTRE=9;
	public static final int ET=10;
	public static final int FICHIER=11;
	public static final int MOINS=12;
	public static final int MONTHLetter=13;
	public static final int MOT=14;
	public static final int MOTS=15;
	public static final int NUM=16;
	public static final int NUMBERLETTER=17;
	public static final int NUMERO=18;
	public static final int OBJET=19;
	public static final int OU=20;
	public static final int PAS=21;
	public static final int PLUS=22;
	public static final int POINT=23;
	public static final int RUBRIQUE=24;
	public static final int SELECT=25;
	public static final int SELECTCOUNT=26;
	public static final int TEXTE=27;
	public static final int TITRE=28;
	public static final int VAR=29;
	public static final int WS=30;
	public static final int WrittenBy=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\LO17\\antlr\\tal_sql\\tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:89:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:90:26: (r= requete POINT )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:91:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes497);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes499); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:99:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT | SELECTCOUNT ) ( ARTICLE | EMAIL | TITRE | TEXTE | NUMERO | RUBRIQUE )+ (ps= whereAfter[mot, table, col, count, select] )? ( ( ET | OU ) ps= whereAfter[mot, table, col, count, select] )* ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre, ps1_arbre, ps2_arbre; ArrayList<String> col = new ArrayList<String>(); String mot = "", select = "", table = ""; boolean count=false, whereAfterIn = false;
		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:100:182: ( ( SELECT | SELECTCOUNT ) ( ARTICLE | EMAIL | TITRE | TEXTE | NUMERO | RUBRIQUE )+ (ps= whereAfter[mot, table, col, count, select] )? ( ( ET | OU ) ps= whereAfter[mot, table, col, count, select] )* )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:101:3: ( SELECT | SELECTCOUNT ) ( ARTICLE | EMAIL | TITRE | TEXTE | NUMERO | RUBRIQUE )+ (ps= whereAfter[mot, table, col, count, select] )? ( ( ET | OU ) ps= whereAfter[mot, table, col, count, select] )*
			{
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:101:3: ( SELECT | SELECTCOUNT )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			else if ( (LA1_0==SELECTCOUNT) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:101:4: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete531); 

								select = "select distinct";
								req_arbre.ajouteFils(new Arbre("",select));
								
					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:105:5: SELECTCOUNT
					{
					match(input,SELECTCOUNT,FOLLOW_SELECTCOUNT_in_requete541); 

								req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*) AS count FROM ("));
								select = "select distinct";
								req_arbre.ajouteFils(new Arbre("",select));
								count = true;
							
					}
					break;

			}

			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:111:3: ( ARTICLE | EMAIL | TITRE | TEXTE | NUMERO | RUBRIQUE )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=7;
				switch ( input.LA(1) ) {
				case RUBRIQUE:
					{
					alt2=6;
					}
					break;
				case ARTICLE:
					{
					alt2=1;
					}
					break;
				case EMAIL:
					{
					alt2=2;
					}
					break;
				case TITRE:
					{
					alt2=3;
					}
					break;
				case TEXTE:
					{
					alt2=4;
					}
					break;
				case NUMERO:
					{
					alt2=5;
					}
					break;
				}
				switch (alt2) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:111:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete549); 

								
									table = "titretext";
									if(!col.contains("fichier")){
										col.add("fichier");
									}
									mot = "mot";
								
					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:120:6: EMAIL
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_requete561); 

									table = "email";
									if(!col.contains("email")){
										col.add("email");
									}
									mot = "email";
								
					}
					break;
				case 3 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:128:6: TITRE
					{
					match(input,TITRE,FOLLOW_TITRE_in_requete573); 

								 	table = "titre";
									mot = "mot";
							 	
					}
					break;
				case 4 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:133:6: TEXTE
					{
					match(input,TEXTE,FOLLOW_TEXTE_in_requete586); 

									table = "texte";
									mot = "mot";
								
					}
					break;
				case 5 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:138:6: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_requete598); 

									table = "titretext";
									if(!col.contains("numero")){
										col.add("numero");
									}
									mot = "mot";
								
					}
					break;
				case 6 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:146:6: RUBRIQUE
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete610); 

									if(!col.contains("rubrique")){
										col.add("rubrique");
									}
									mot = "mot";
								
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}


							for (int i = 0; i < col.size(); i++) {
								req_arbre.ajouteFils(new Arbre(""," " + col.get(i)));
								if(i != col.size()-1)
									req_arbre.ajouteFils(new Arbre("", ","));
							}
							req_arbre.ajouteFils(new Arbre(""," from "));
						
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:163:5: (ps= whereAfter[mot, table, col, count, select] )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MOT||LA3_0==RUBRIQUE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:163:6: ps= whereAfter[mot, table, col, count, select]
					{
					pushFollow(FOLLOW_whereAfter_in_requete639);
					ps=whereAfter(mot, table, col, count, select);
					state._fsp--;


										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
										whereAfterIn = true; 
										
									
					}
					break;

			}

			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:172:4: ( ( ET | OU ) ps= whereAfter[mot, table, col, count, select] )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ET||LA5_0==OU) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:172:5: ( ET | OU ) ps= whereAfter[mot, table, col, count, select]
					{
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:172:5: ( ET | OU )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ET) ) {
						alt4=1;
					}
					else if ( (LA4_0==OU) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:172:6: ET
							{
							match(input,ET,FOLLOW_ET_in_requete664); 

												req_arbre.ajouteFils(new Arbre(""," INTERSECT "));
											
							}
							break;
						case 2 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:177:4: OU
							{
							match(input,OU,FOLLOW_OU_in_requete680); 

												req_arbre.ajouteFils(new Arbre(""," UNION "));
											
							}
							break;

					}


										req_arbre.ajouteFils(new Arbre("",select));
										for (int i = 0; i < col.size(); i++) {
										req_arbre.ajouteFils(new Arbre(""," " + col.get(i)));
										if(i != col.size()-1)
											req_arbre.ajouteFils(new Arbre("", ","));
										}
										req_arbre.ajouteFils(new Arbre(""," from "));
									
					pushFollow(FOLLOW_whereAfter_in_requete707);
					ps=whereAfter(mot, table, col, count, select);
					state._fsp--;


										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
										whereAfterIn = true; 
									
					}
					break;

				default :
					break loop5;
				}
			}


							if(count) {
								req_arbre.ajouteFils(new Arbre("",")I"));
							}
							if(!whereAfterIn) {
								req_arbre.ajouteFils(new Arbre("",table));
							}
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "whereAfter"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:207:1: whereAfter[String mot, String table, ArrayList<String> col, boolean count, String select] returns [Arbre where_arbre = new Arbre(\"\")] : ( RUBRIQUE | MOT ) ( PAS )? ( ( PLUS | MOINS )? ps1= paramNumber objet= MOTS |ps2= paramsDate[neg, col, select, \"date\"] |ps= paramsmot[mot ,neg, col, select, table] ) ;
	public final Arbre whereAfter(String mot, String table, ArrayList<String> col, boolean count, String select) throws RecognitionException {
		Arbre where_arbre =  new Arbre("");


		Token objet=null;
		Arbre ps1 =null;
		Arbre ps2 =null;
		Arbre ps =null;

		Arbre ps_arbre, ps1_arbre, ps2_arbre; String neg = "", sign = "=";
		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:208:78: ( ( RUBRIQUE | MOT ) ( PAS )? ( ( PLUS | MOINS )? ps1= paramNumber objet= MOTS |ps2= paramsDate[neg, col, select, \"date\"] |ps= paramsmot[mot ,neg, col, select, table] ) )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:209:3: ( RUBRIQUE | MOT ) ( PAS )? ( ( PLUS | MOINS )? ps1= paramNumber objet= MOTS |ps2= paramsDate[neg, col, select, \"date\"] |ps= paramsmot[mot ,neg, col, select, table] )
			{
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:209:3: ( RUBRIQUE | MOT )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RUBRIQUE) ) {
				alt6=1;
			}
			else if ( (LA6_0==MOT) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:209:4: RUBRIQUE
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_whereAfter751); 

									table = "RUBRIQUE";
									mot = "rubrique";
								
					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:214:5: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_whereAfter762); 
					}
					break;

			}

			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:216:3: ( PAS )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PAS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:216:4: PAS
					{
					match(input,PAS,FOLLOW_PAS_in_whereAfter771); 

									neg = "!";
								
					}
					break;

			}

			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:221:3: ( ( PLUS | MOINS )? ps1= paramNumber objet= MOTS |ps2= paramsDate[neg, col, select, \"date\"] |ps= paramsmot[mot ,neg, col, select, table] )
			int alt9=3;
			switch ( input.LA(1) ) {
			case MOINS:
			case NUMBERLETTER:
			case PLUS:
				{
				alt9=1;
				}
				break;
			case NUM:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==MOTS) ) {
					alt9=1;
				}
				else if ( (LA9_2==ET||LA9_2==MONTHLetter||LA9_2==NUM||LA9_2==OU||LA9_2==POINT||(LA9_2 >= 32 && LA9_2 <= 33)) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AFTER:
			case BEFORE:
			case EN:
			case ENTRE:
			case ET:
			case MONTHLetter:
			case OU:
			case POINT:
				{
				alt9=2;
				}
				break;
			case VAR:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:221:5: ( PLUS | MOINS )? ps1= paramNumber objet= MOTS
					{
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:221:5: ( PLUS | MOINS )?
					int alt8=3;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==PLUS) ) {
						alt8=1;
					}
					else if ( (LA8_0==MOINS) ) {
						alt8=2;
					}
					switch (alt8) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:221:6: PLUS
							{
							match(input,PLUS,FOLLOW_PLUS_in_whereAfter789); 

												sign = ">=";
												
											
							}
							break;
						case 2 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:226:6: MOINS
							{
							match(input,MOINS,FOLLOW_MOINS_in_whereAfter803); 

												sign = "<=";
											
							}
							break;

					}

					pushFollow(FOLLOW_paramNumber_in_whereAfter819);
					ps1=paramNumber();
					state._fsp--;

					objet=(Token)match(input,MOTS,FOLLOW_MOTS_in_whereAfter830); 

									 	where_arbre.ajouteFils(new Arbre(""," " + table));
								 		where_arbre.ajouteFils(new Arbre("","GROUP BY "+ col.get(0)));
										where_arbre.ajouteFils(new Arbre("","HAVING COUNT("+objet.getText()+")"+sign));
										ps1_arbre = ps1;
										where_arbre.ajouteFils(ps1_arbre);
								 	
					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:241:3: ps2= paramsDate[neg, col, select, \"date\"]
					{
					pushFollow(FOLLOW_paramsDate_in_whereAfter849);
					ps2=paramsDate(neg, col, select, "date");
					state._fsp--;


									where_arbre.ajouteFils(new Arbre(""," date "));
									where_arbre.ajouteFils(new Arbre("","where"));
									ps2_arbre = ps2;
									where_arbre.ajouteFils(ps2_arbre);
								
					}
					break;
				case 3 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:249:3: ps= paramsmot[mot ,neg, col, select, table]
					{
					pushFollow(FOLLOW_paramsmot_in_whereAfter867);
					ps=paramsmot(mot, neg, col, select, table);
					state._fsp--;


									where_arbre.ajouteFils(new Arbre(""," " + table+" "));
									where_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									where_arbre.ajouteFils(ps_arbre);
								
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return where_arbre;
	}
	// $ANTLR end "whereAfter"



	// $ANTLR start "paramsDate"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:260:1: paramsDate[String neg, ArrayList<String> col, String select, String table] returns [Arbre les_pars_arbre = new Arbre(\"\")] : ( BEFORE | AFTER )? ( ENTRE )? ( EN )? par1= paramDate[sign, neg, moisAnnee] ( ( OU | ET ) ( PAS )? par2= paramDate[sign, neg, moisAnnee] )* ;
	public final Arbre paramsDate(String neg, ArrayList<String> col, String select, String table) throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre; String sign = "= "; int flag = 0; boolean moisAnnee = false;
		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:261:101: ( ( BEFORE | AFTER )? ( ENTRE )? ( EN )? par1= paramDate[sign, neg, moisAnnee] ( ( OU | ET ) ( PAS )? par2= paramDate[sign, neg, moisAnnee] )* )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:262:3: ( BEFORE | AFTER )? ( ENTRE )? ( EN )? par1= paramDate[sign, neg, moisAnnee] ( ( OU | ET ) ( PAS )? par2= paramDate[sign, neg, moisAnnee] )*
			{
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:262:3: ( BEFORE | AFTER )?
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BEFORE) ) {
				alt10=1;
			}
			else if ( (LA10_0==AFTER) ) {
				alt10=2;
			}
			switch (alt10) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:262:4: BEFORE
					{
					match(input,BEFORE,FOLLOW_BEFORE_in_paramsDate904); 

									sign = "<";
									moisAnnee = true;
								
					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:267:5: AFTER
					{
					match(input,AFTER,FOLLOW_AFTER_in_paramsDate916); 

									sign = ">";
									moisAnnee = true;
								
					}
					break;

			}

			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:272:3: ( ENTRE )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ENTRE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:272:4: ENTRE
					{
					match(input,ENTRE,FOLLOW_ENTRE_in_paramsDate928); 

									sign = ">=";
									flag = 1;
									moisAnnee = true;
								
					}
					break;

			}

			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:278:3: ( EN )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==EN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:278:4: EN
					{
					match(input,EN,FOLLOW_EN_in_paramsDate940); 

									moisAnnee = true;
								
					}
					break;

			}


						les_pars_arbre.ajouteFils(new Arbre(""," ( "));
					
			pushFollow(FOLLOW_paramDate_in_paramsDate959);
			par1=paramDate(sign, neg, moisAnnee);
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
							sign = "=";
						

						les_pars_arbre.ajouteFils(new Arbre(""," ) "));
					
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:294:3: ( ( OU | ET ) ( PAS )? par2= paramDate[sign, neg, moisAnnee] )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==ET) ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1==ET||LA15_1==MONTHLetter||LA15_1==NUM||(LA15_1 >= OU && LA15_1 <= PAS)||LA15_1==POINT) ) {
						alt15=1;
					}

				}
				else if ( (LA15_0==OU) ) {
					int LA15_2 = input.LA(2);
					if ( (LA15_2==ET||LA15_2==MONTHLetter||LA15_2==NUM||(LA15_2 >= OU && LA15_2 <= PAS)||LA15_2==POINT) ) {
						alt15=1;
					}

				}

				switch (alt15) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:295:4: ( OU | ET ) ( PAS )? par2= paramDate[sign, neg, moisAnnee]
					{

									sign = "=";
								
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:298:3: ( OU | ET )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==OU) ) {
						alt13=1;
					}
					else if ( (LA13_0==ET) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:298:4: OU
							{
							match(input,OU,FOLLOW_OU_in_paramsDate983); 

											les_pars_arbre.ajouteFils(new Arbre(""," OR "));
										
							}
							break;
						case 2 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:302:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramsDate996); 

										 	les_pars_arbre.ajouteFils(new Arbre(""," AND "));
										
							}
							break;

					}


									if (flag == 1)
										sign = "<=";
								
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:312:3: ( PAS )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==PAS) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:312:4: PAS
							{
							match(input,PAS,FOLLOW_PAS_in_paramsDate1019); 

											neg = "!";
										
							}
							break;

					}


								les_pars_arbre.ajouteFils(new Arbre(""," ( "));
							
					pushFollow(FOLLOW_paramDate_in_paramsDate1042);
					par2=paramDate(sign, neg, moisAnnee);
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(par2_arbre);
									flag = 0;
								

								les_pars_arbre.ajouteFils(new Arbre(""," ) "));
							
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsDate"



	// $ANTLR start "paramsmot"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:333:1: paramsmot[String mot, String neg, ArrayList<String> col, String select, String table] returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= parammot[neg, mot] ( ( ET | OU ) ( PAS )? par2= parammot[neg, mot] )* ;
	public final Arbre paramsmot(String mot, String neg, ArrayList<String> col, String select, String table) throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:334:40: (par1= parammot[neg, mot] ( ( ET | OU ) ( PAS )? par2= parammot[neg, mot] )* )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:335:3: par1= parammot[neg, mot] ( ( ET | OU ) ( PAS )? par2= parammot[neg, mot] )*
			{
			pushFollow(FOLLOW_parammot_in_paramsmot1091);
			par1=parammot(neg, mot);
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:342:3: ( ( ET | OU ) ( PAS )? par2= parammot[neg, mot] )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ET) ) {
					int LA18_1 = input.LA(2);
					if ( (LA18_1==PAS||LA18_1==VAR) ) {
						alt18=1;
					}

				}
				else if ( (LA18_0==OU) ) {
					int LA18_2 = input.LA(2);
					if ( (LA18_2==PAS||LA18_2==VAR) ) {
						alt18=1;
					}

				}

				switch (alt18) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:342:4: ( ET | OU ) ( PAS )? par2= parammot[neg, mot]
					{
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:342:4: ( ET | OU )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ET) ) {
						alt16=1;
					}
					else if ( (LA16_0==OU) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:342:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramsmot1111); 

											 	les_pars_arbre.ajouteFils(new Arbre(""," INTERSECT "));
											 	les_pars_arbre.ajouteFils(new Arbre("",select));
												for (int i = 0; i < col.size(); i++) {
												les_pars_arbre.ajouteFils(new Arbre(""," " + col.get(i)));
												if(i != col.size()-1)
													les_pars_arbre.ajouteFils(new Arbre("", ","));
												}
												les_pars_arbre.ajouteFils(new Arbre(""," from "));
												//table.remove(mot);
											 	//table.add(mot);
												les_pars_arbre.ajouteFils(new Arbre(""," " + table+" "));
												les_pars_arbre.ajouteFils(new Arbre("","where"));
											
							}
							break;
						case 2 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:357:6: OU
							{
							match(input,OU,FOLLOW_OU_in_paramsmot1126); 

											 	les_pars_arbre.ajouteFils(new Arbre(""," OR "));
											
							}
							break;

					}

					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:362:3: ( PAS )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==PAS) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:362:4: PAS
							{
							match(input,PAS,FOLLOW_PAS_in_paramsmot1142); 

											neg = "!";
										
							}
							break;

					}

					pushFollow(FOLLOW_parammot_in_paramsmot1161);
					par2=parammot(neg, mot);
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsmot"



	// $ANTLR start "parammot"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:378:1: parammot[String neg, String mot] returns [Arbre _arbre = new Arbre(\"\")] : (a= VAR )+ ;
	public final Arbre parammot(String neg, String mot) throws RecognitionException {
		Arbre _arbre =  new Arbre("");


		Token a=null;

		ArrayList<String> piece = new ArrayList<String>(); String key = "'";
		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:379:79: ( (a= VAR )+ )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:380:2: (a= VAR )+
			{

					_arbre.ajouteFils(new Arbre(mot+neg+"=", "")); 
				
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:383:2: (a= VAR )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==VAR) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:383:3: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_parammot1214); 
					 
								if (mot.equals("rubrique")) {
								    	piece.add(a.getText().toString().substring(0,1).toUpperCase()+a.getText().toString().substring(1));
								} else {
									piece.add(a.getText().toString());
								}
							
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}


					for (int i = 0; i < piece.size(); i++) {
						key = key + piece.get(i);
						if(i != piece.size()-1) {
							key = key + " ";
						}
					}
					_arbre.ajouteFils(new Arbre("", key+"'"));
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return _arbre;
	}
	// $ANTLR end "parammot"



	// $ANTLR start "paramNumber"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:403:1: paramNumber returns [Arbre _arbre = new Arbre(\"\")] : (a= NUM |b= NUMBERLETTER ) ;
	public final Arbre paramNumber() throws RecognitionException {
		Arbre _arbre =  new Arbre("");


		Token a=null;
		Token b=null;

		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:403:52: ( (a= NUM |b= NUMBERLETTER ) )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:404:2: (a= NUM |b= NUMBERLETTER )
			{
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:404:2: (a= NUM |b= NUMBERLETTER )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==NUM) ) {
				alt20=1;
			}
			else if ( (LA20_0==NUMBERLETTER) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:404:3: a= NUM
					{
					a=(Token)match(input,NUM,FOLLOW_NUM_in_paramNumber1244); 
					 _arbre.ajouteFils(new Arbre("", a.getText()));
					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:408:2: b= NUMBERLETTER
					{
					b=(Token)match(input,NUMBERLETTER,FOLLOW_NUMBERLETTER_in_paramNumber1259); 

								switch (b.getText().toString()) { 
								    case "une":   _arbre.ajouteFils(new Arbre("", "1"));
						                    	     break;
							            case "un":  _arbre.ajouteFils(new Arbre("", "1"));
							                     break;
							            case "deux" :  _arbre.ajouteFils(new Arbre("", "2"));
							                     break;
							            case "trois" :   _arbre.ajouteFils(new Arbre("", "3"));
							                     break;
							            case "quatre":   	_arbre.ajouteFils(new Arbre("", "4"));
							                     break;
							            case "cinq":  _arbre.ajouteFils(new Arbre("", "5"));
							                     break;
							            case "six":  _arbre.ajouteFils(new Arbre("", "6"));
							                     break;
							            case "sept":  _arbre.ajouteFils(new Arbre("", "7"));
							                     break;
							            case "huit":  _arbre.ajouteFils(new Arbre("", "8"));
							                     break;
							            case "neuf":  _arbre.ajouteFils(new Arbre("", "9"));
							                     break;
							            default: _arbre.ajouteFils(new Arbre("", "10"));
							                     break;
							        }
							
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return _arbre;
	}
	// $ANTLR end "paramNumber"



	// $ANTLR start "paramDate"
	// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:438:1: paramDate[String sign, String neg, boolean moisAnnee] returns [Arbre _arbre = new Arbre(\"\")] : ( (a= NUM )? (b= MONTHLetter )? (c= NUM )? |a= NUM ( '-' | '/' ) b= NUM ( '-' | '/' ) c= NUM ) ;
	public final Arbre paramDate(String sign, String neg, boolean moisAnnee) throws RecognitionException {
		Arbre _arbre =  new Arbre("");


		Token a=null;
		Token b=null;
		Token c=null;

		String mois = "";
		try {
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:439:28: ( ( (a= NUM )? (b= MONTHLetter )? (c= NUM )? |a= NUM ( '-' | '/' ) b= NUM ( '-' | '/' ) c= NUM ) )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:440:2: ( (a= NUM )? (b= MONTHLetter )? (c= NUM )? |a= NUM ( '-' | '/' ) b= NUM ( '-' | '/' ) c= NUM )
			{
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:440:2: ( (a= NUM )? (b= MONTHLetter )? (c= NUM )? |a= NUM ( '-' | '/' ) b= NUM ( '-' | '/' ) c= NUM )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==NUM) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==ET||LA24_1==MONTHLetter||LA24_1==NUM||LA24_1==OU||LA24_1==POINT) ) {
					alt24=1;
				}
				else if ( ((LA24_1 >= 32 && LA24_1 <= 33)) ) {
					alt24=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA24_0==ET||LA24_0==MONTHLetter||LA24_0==OU||LA24_0==POINT) ) {
				alt24=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:441:3: (a= NUM )? (b= MONTHLetter )? (c= NUM )?
					{
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:441:3: (a= NUM )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==NUM) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:441:4: a= NUM
							{
							a=(Token)match(input,NUM,FOLLOW_NUM_in_paramDate1300); 
							 
											if(moisAnnee) {
												_arbre.ajouteFils(new Arbre("date.annee"+ neg + sign , "'"+a.getText()+"'"));
											}
											else {
												_arbre.ajouteFils(new Arbre("date.jour"+ neg + sign , "'"+a.getText()+"'"));
												_arbre.ajouteFils(new Arbre("", "AND"));
											}				
										
							}
							break;

					}

					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:452:3: (b= MONTHLetter )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==MONTHLetter) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:452:4: b= MONTHLetter
							{
							b=(Token)match(input,MONTHLetter,FOLLOW_MONTHLetter_in_paramDate1320); 

											switch (b.getText().toString()) { 
											    case "janvier":   mois = "01";
									                    	     break;
										            case "fevrier":   mois = "02";
										                     break;
										            case "mars" :     mois = "03";
										                     break;
										            case "avril" :    mois = "04";
										                     break;
										            case "mai":       mois = "05";
										                     break;
										            case "juin":      mois = "06";
										                     break;
										            case "juillet":   mois = "07";
										                     break;
										            case "aout":      mois = "08";
										                     break;
										            case "septembre": mois = "09";
										                     break;
										            case "octobre":   mois = "10";
										                     break;
										            case "novembre":  mois = "11";
										                     break;
										            case "decembre":  mois = "12";
										                     break;
										            default: _arbre.ajouteFils(new Arbre("", "1"));
										                     break;
										        }
											_arbre.ajouteFils(new Arbre("date.mois"+ neg + sign, "'"+mois+"'"));
											
										
							}
							break;

					}

					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:486:3: (c= NUM )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==NUM) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:486:4: c= NUM
							{
							c=(Token)match(input,NUM,FOLLOW_NUM_in_paramDate1340); 

											_arbre.ajouteFils(new Arbre("", "AND"));
											_arbre.ajouteFils(new Arbre("date.annee"+ neg + sign, "'"+c.getText()+"'"));
										
							}
							break;

					}

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:495:3: a= NUM ( '-' | '/' ) b= NUM ( '-' | '/' ) c= NUM
					{
					a=(Token)match(input,NUM,FOLLOW_NUM_in_paramDate1368); 
					 
									_arbre.ajouteFils(new Arbre("date.jour"+ neg + sign, "'"+a.getText()+"'"));
									_arbre.ajouteFils(new Arbre("", "AND"));
								
					if ( (input.LA(1) >= 32 && input.LA(1) <= 33) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					b=(Token)match(input,NUM,FOLLOW_NUM_in_paramDate1389); 

									_arbre.ajouteFils(new Arbre("date.mois"+ neg + sign, "'"+b.getText()+"'"));
									_arbre.ajouteFils(new Arbre("", "AND"));
								
					if ( (input.LA(1) >= 32 && input.LA(1) <= 33) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					c=(Token)match(input,NUM,FOLLOW_NUM_in_paramDate1410); 

									_arbre.ajouteFils(new Arbre("date.annee"+ neg + sign, "'"+c.getText()+"'"));
								
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return _arbre;
	}
	// $ANTLR end "paramDate"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes497 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete531 = new BitSet(new long[]{0x00000000190400A0L});
	public static final BitSet FOLLOW_SELECTCOUNT_in_requete541 = new BitSet(new long[]{0x00000000190400A0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete549 = new BitSet(new long[]{0x00000000191444A2L});
	public static final BitSet FOLLOW_EMAIL_in_requete561 = new BitSet(new long[]{0x00000000191444A2L});
	public static final BitSet FOLLOW_TITRE_in_requete573 = new BitSet(new long[]{0x00000000191444A2L});
	public static final BitSet FOLLOW_TEXTE_in_requete586 = new BitSet(new long[]{0x00000000191444A2L});
	public static final BitSet FOLLOW_NUMERO_in_requete598 = new BitSet(new long[]{0x00000000191444A2L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete610 = new BitSet(new long[]{0x00000000191444A2L});
	public static final BitSet FOLLOW_whereAfter_in_requete639 = new BitSet(new long[]{0x0000000000100402L});
	public static final BitSet FOLLOW_ET_in_requete664 = new BitSet(new long[]{0x0000000001004000L});
	public static final BitSet FOLLOW_OU_in_requete680 = new BitSet(new long[]{0x0000000001004000L});
	public static final BitSet FOLLOW_whereAfter_in_requete707 = new BitSet(new long[]{0x0000000000100402L});
	public static final BitSet FOLLOW_RUBRIQUE_in_whereAfter751 = new BitSet(new long[]{0x0000000020733750L});
	public static final BitSet FOLLOW_MOT_in_whereAfter762 = new BitSet(new long[]{0x0000000020733750L});
	public static final BitSet FOLLOW_PAS_in_whereAfter771 = new BitSet(new long[]{0x0000000020533750L});
	public static final BitSet FOLLOW_PLUS_in_whereAfter789 = new BitSet(new long[]{0x0000000000030000L});
	public static final BitSet FOLLOW_MOINS_in_whereAfter803 = new BitSet(new long[]{0x0000000000030000L});
	public static final BitSet FOLLOW_paramNumber_in_whereAfter819 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOTS_in_whereAfter830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramsDate_in_whereAfter849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramsmot_in_whereAfter867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEFORE_in_paramsDate904 = new BitSet(new long[]{0x0000000000112700L});
	public static final BitSet FOLLOW_AFTER_in_paramsDate916 = new BitSet(new long[]{0x0000000000112700L});
	public static final BitSet FOLLOW_ENTRE_in_paramsDate928 = new BitSet(new long[]{0x0000000000112500L});
	public static final BitSet FOLLOW_EN_in_paramsDate940 = new BitSet(new long[]{0x0000000000112400L});
	public static final BitSet FOLLOW_paramDate_in_paramsDate959 = new BitSet(new long[]{0x0000000000100402L});
	public static final BitSet FOLLOW_OU_in_paramsDate983 = new BitSet(new long[]{0x0000000000312400L});
	public static final BitSet FOLLOW_ET_in_paramsDate996 = new BitSet(new long[]{0x0000000000312400L});
	public static final BitSet FOLLOW_PAS_in_paramsDate1019 = new BitSet(new long[]{0x0000000000112400L});
	public static final BitSet FOLLOW_paramDate_in_paramsDate1042 = new BitSet(new long[]{0x0000000000100402L});
	public static final BitSet FOLLOW_parammot_in_paramsmot1091 = new BitSet(new long[]{0x0000000000100402L});
	public static final BitSet FOLLOW_ET_in_paramsmot1111 = new BitSet(new long[]{0x0000000020200000L});
	public static final BitSet FOLLOW_OU_in_paramsmot1126 = new BitSet(new long[]{0x0000000020200000L});
	public static final BitSet FOLLOW_PAS_in_paramsmot1142 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_parammot_in_paramsmot1161 = new BitSet(new long[]{0x0000000000100402L});
	public static final BitSet FOLLOW_VAR_in_parammot1214 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_NUM_in_paramNumber1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBERLETTER_in_paramNumber1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_paramDate1300 = new BitSet(new long[]{0x0000000000012002L});
	public static final BitSet FOLLOW_MONTHLetter_in_paramDate1320 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_NUM_in_paramDate1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_paramDate1368 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_set_in_paramDate1377 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NUM_in_paramDate1389 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_set_in_paramDate1398 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NUM_in_paramDate1410 = new BitSet(new long[]{0x0000000000000002L});
}
