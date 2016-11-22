// $ANTLR null E:\\LO17\\antlr\\tal_sql\\tal_sql.g 2016-06-17 11:39:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E:\\LO17\\antlr\\tal_sql\\tal_sql.g"; }

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:2:7: ( '-' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:2:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:3:7: ( '/' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:3:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:3:8: ( 'vouloir' | 'quel' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='v') ) {
				alt1=1;
			}
			else if ( (LA1_0=='q') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:3:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:3:22: 'quel'
					{
					match("quel"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SELECTCOUNT"
	public final void mSELECTCOUNT() throws RecognitionException {
		try {
			int _type = SELECTCOUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:6:13: ( 'nombre' | 'combien' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='n') ) {
				alt2=1;
			}
			else if ( (LA2_0=='c') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:6:15: 'nombre'
					{
					match("nombre"); 

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:6:26: 'combien'
					{
					match("combien"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECTCOUNT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:9:9: ( 'article' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:9:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "EMAIL"
	public final void mEMAIL() throws RecognitionException {
		try {
			int _type = EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:12:7: ( 'email' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:12:9: 'email'
			{
			match("email"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMAIL"

	// $ANTLR start "TEXTE"
	public final void mTEXTE() throws RecognitionException {
		try {
			int _type = TEXTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:15:7: ( 'texte' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:15:9: 'texte'
			{
			match("texte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXTE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:18:7: ( 'titre' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:18:9: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:21:10: ( 'rubrique' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:21:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "EN"
	public final void mEN() throws RecognitionException {
		try {
			int _type = EN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:24:4: ( 'en' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:24:6: 'en'
			{
			match("en"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EN"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:27:8: ( 'numero' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:27:10: 'numero'
			{
			match("numero"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "FICHIER"
	public final void mFICHIER() throws RecognitionException {
		try {
			int _type = FICHIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:30:9: ( 'fichier' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:30:11: 'fichier'
			{
			match("fichier"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FICHIER"

	// $ANTLR start "ENTRE"
	public final void mENTRE() throws RecognitionException {
		try {
			int _type = ENTRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:33:7: ( 'entre' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:33:9: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTRE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:36:6: ( 'plus' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:36:8: 'plus'
			{
			match("plus"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MOINS"
	public final void mMOINS() throws RecognitionException {
		try {
			int _type = MOINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:39:7: ( 'moins' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:39:9: 'moins'
			{
			match("moins"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOINS"

	// $ANTLR start "AFTER"
	public final void mAFTER() throws RecognitionException {
		try {
			int _type = AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:42:7: ( 'depuis' | 'apres' | 'partir' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 'd':
				{
				alt3=1;
				}
				break;
			case 'a':
				{
				alt3=2;
				}
				break;
			case 'p':
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:42:9: 'depuis'
					{
					match("depuis"); 

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:42:20: 'apres'
					{
					match("apres"); 

					}
					break;
				case 3 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:42:30: 'partir'
					{
					match("partir"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AFTER"

	// $ANTLR start "BEFORE"
	public final void mBEFORE() throws RecognitionException {
		try {
			int _type = BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:45:8: ( 'avant' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:45:10: 'avant'
			{
			match("avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEFORE"

	// $ANTLR start "ET"
	public final void mET() throws RecognitionException {
		try {
			int _type = ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:48:4: ( 'et' | 'mais' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='e') ) {
				alt4=1;
			}
			else if ( (LA4_0=='m') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:48:6: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:48:13: 'mais'
					{
					match("mais"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ET"

	// $ANTLR start "OU"
	public final void mOU() throws RecognitionException {
		try {
			int _type = OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:51:4: ( 'ou' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:51:6: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:54:7: ( '.' | '?' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "OBJET"
	public final void mOBJET() throws RecognitionException {
		try {
			int _type = OBJET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:57:7: ( 'image' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:57:9: 'image'
			{
			match("image"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBJET"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:60:5: ( 'contenir' | 'parler' | 'appraitre' | 'publier' | 'dater' | 'sur' )
			int alt5=6;
			switch ( input.LA(1) ) {
			case 'c':
				{
				alt5=1;
				}
				break;
			case 'p':
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2=='a') ) {
					alt5=2;
				}
				else if ( (LA5_2=='u') ) {
					alt5=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				alt5=3;
				}
				break;
			case 'd':
				{
				alt5=5;
				}
				break;
			case 's':
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:60:7: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:60:20: 'parler'
					{
					match("parler"); 

					}
					break;
				case 3 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:60:31: 'appraitre'
					{
					match("appraitre"); 

					}
					break;
				case 4 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:60:45: 'publier'
					{
					match("publier"); 

					}
					break;
				case 5 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:60:57: 'dater'
					{
					match("dater"); 

					}
					break;
				case 6 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:60:67: 'sur'
					{
					match("sur"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "PAS"
	public final void mPAS() throws RecognitionException {
		try {
			int _type = PAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:63:5: ( 'pas' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:63:6: 'pas'
			{
			match("pas"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAS"

	// $ANTLR start "WrittenBy"
	public final void mWrittenBy() throws RecognitionException {
		try {
			int _type = WrittenBy;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:66:11: ( 'ecrir par' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:66:13: 'ecrir par'
			{
			match("ecrir par"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WrittenBy"

	// $ANTLR start "MOTS"
	public final void mMOTS() throws RecognitionException {
		try {
			int _type = MOTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:69:6: ( 'mot' )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:69:8: 'mot'
			{
			match("mot"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOTS"

	// $ANTLR start "NUMBERLETTER"
	public final void mNUMBERLETTER() throws RecognitionException {
		try {
			int _type = NUMBERLETTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:14: ( 'une' | 'un' | 'deux' | 'trois' | 'quatre' | 'cinq' | 'six' | 'sept' | 'huit' | 'neuf' )
			int alt6=10;
			switch ( input.LA(1) ) {
			case 'u':
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='n') ) {
					int LA6_9 = input.LA(3);
					if ( (LA6_9=='e') ) {
						alt6=1;
					}

					else {
						alt6=2;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				alt6=3;
				}
				break;
			case 't':
				{
				alt6=4;
				}
				break;
			case 'q':
				{
				alt6=5;
				}
				break;
			case 'c':
				{
				alt6=6;
				}
				break;
			case 's':
				{
				int LA6_6 = input.LA(2);
				if ( (LA6_6=='i') ) {
					alt6=7;
				}
				else if ( (LA6_6=='e') ) {
					alt6=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'h':
				{
				alt6=9;
				}
				break;
			case 'n':
				{
				alt6=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:16: 'une'
					{
					match("une"); 

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:24: 'un'
					{
					match("un"); 

					}
					break;
				case 3 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:31: 'deux'
					{
					match("deux"); 

					}
					break;
				case 4 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:40: 'trois'
					{
					match("trois"); 

					}
					break;
				case 5 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:50: 'quatre'
					{
					match("quatre"); 

					}
					break;
				case 6 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:61: 'cinq'
					{
					match("cinq"); 

					}
					break;
				case 7 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:70: 'six'
					{
					match("six"); 

					}
					break;
				case 8 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:78: 'sept'
					{
					match("sept"); 

					}
					break;
				case 9 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:87: 'huit'
					{
					match("huit"); 

					}
					break;
				case 10 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:72:96: 'neuf'
					{
					match("neuf"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBERLETTER"

	// $ANTLR start "MONTHLetter"
	public final void mMONTHLetter() throws RecognitionException {
		try {
			int _type = MONTHLetter;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:13: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' )
			int alt7=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='a') ) {
					alt7=1;
				}
				else if ( (LA7_1=='u') ) {
					int LA7_10 = input.LA(3);
					if ( (LA7_10=='i') ) {
						int LA7_14 = input.LA(4);
						if ( (LA7_14=='n') ) {
							alt7=6;
						}
						else if ( (LA7_14=='l') ) {
							alt7=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt7=2;
				}
				break;
			case 'm':
				{
				int LA7_3 = input.LA(2);
				if ( (LA7_3=='a') ) {
					int LA7_11 = input.LA(3);
					if ( (LA7_11=='r') ) {
						alt7=3;
					}
					else if ( (LA7_11=='i') ) {
						alt7=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA7_4 = input.LA(2);
				if ( (LA7_4=='v') ) {
					alt7=4;
				}
				else if ( (LA7_4=='o') ) {
					alt7=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt7=9;
				}
				break;
			case 'o':
				{
				alt7=10;
				}
				break;
			case 'n':
				{
				alt7=11;
				}
				break;
			case 'd':
				{
				alt7=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:15: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:27: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:39: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:48: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:58: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:66: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:74: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:86: 'aout'
					{
					match("aout"); 

					}
					break;
				case 9 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:95: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:109: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:121: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:75:134: 'decembre'
					{
					match("decembre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONTHLetter"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'quel' | 'du' | 'de' | 'le' | 'la' | 'les' | 'tous' | 'dont' | 'etre' ) | '\\n' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\t'||LA9_0=='\r'||LA9_0==' '||(LA9_0 >= 'd' && LA9_0 <= 'e')||LA9_0=='j'||LA9_0=='l'||LA9_0=='q'||LA9_0=='t') ) {
				alt9=1;
			}
			else if ( (LA9_0=='\n') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'quel' | 'du' | 'de' | 'le' | 'la' | 'les' | 'tous' | 'dont' | 'etre' )
					{
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'quel' | 'du' | 'de' | 'le' | 'la' | 'les' | 'tous' | 'dont' | 'etre' )
					int alt8=14;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt8=1;
						}
						break;
					case '\t':
						{
						alt8=2;
						}
						break;
					case '\r':
						{
						alt8=3;
						}
						break;
					case 'j':
						{
						alt8=4;
						}
						break;
					case 'q':
						{
						int LA8_5 = input.LA(2);
						if ( (LA8_5=='u') ) {
							int LA8_10 = input.LA(3);
							if ( (LA8_10=='i') ) {
								alt8=5;
							}
							else if ( (LA8_10=='e') ) {
								alt8=6;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 8, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 8, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'd':
						{
						switch ( input.LA(2) ) {
						case 'u':
							{
							alt8=7;
							}
							break;
						case 'e':
							{
							alt8=8;
							}
							break;
						case 'o':
							{
							alt8=13;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 8, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 'l':
						{
						int LA8_7 = input.LA(2);
						if ( (LA8_7=='e') ) {
							int LA8_14 = input.LA(3);
							if ( (LA8_14=='s') ) {
								alt8=11;
							}

							else {
								alt8=9;
							}

						}
						else if ( (LA8_7=='a') ) {
							alt8=10;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 8, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 't':
						{
						alt8=12;
						}
						break;
					case 'e':
						{
						alt8=14;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:42: 'quel'
							{
							match("quel"); 

							}
							break;
						case 7 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:51: 'du'
							{
							match("du"); 

							}
							break;
						case 8 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:58: 'de'
							{
							match("de"); 

							}
							break;
						case 9 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:65: 'le'
							{
							match("le"); 

							}
							break;
						case 10 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:72: 'la'
							{
							match("la"); 

							}
							break;
						case 11 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:79: 'les'
							{
							match("les"); 

							}
							break;
						case 12 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:87: 'tous'
							{
							match("tous"); 

							}
							break;
						case 13 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:96: 'dont'
							{
							match("dont"); 

							}
							break;
						case 14 :
							// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:105: 'etre'
							{
							match("etre"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:78:125: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:81:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:81:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:81:30: ( 'a' .. 'z' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:85:6: ( ( '0' .. '9' )+ )
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:85:8: ( '0' .. '9' )+
			{
			// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:85:8: ( '0' .. '9' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:8: ( T__32 | T__33 | SELECT | SELECTCOUNT | ARTICLE | EMAIL | TEXTE | TITRE | RUBRIQUE | EN | NUMERO | FICHIER | ENTRE | PLUS | MOINS | AFTER | BEFORE | ET | OU | POINT | OBJET | MOT | PAS | WrittenBy | MOTS | NUMBERLETTER | MONTHLetter | WS | VAR | NUM )
		int alt12=30;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:10: T__32
				{
				mT__32(); 

				}
				break;
			case 2 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:16: T__33
				{
				mT__33(); 

				}
				break;
			case 3 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:22: SELECT
				{
				mSELECT(); 

				}
				break;
			case 4 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:29: SELECTCOUNT
				{
				mSELECTCOUNT(); 

				}
				break;
			case 5 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:41: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 6 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:49: EMAIL
				{
				mEMAIL(); 

				}
				break;
			case 7 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:55: TEXTE
				{
				mTEXTE(); 

				}
				break;
			case 8 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:61: TITRE
				{
				mTITRE(); 

				}
				break;
			case 9 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:67: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 10 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:76: EN
				{
				mEN(); 

				}
				break;
			case 11 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:79: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 12 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:86: FICHIER
				{
				mFICHIER(); 

				}
				break;
			case 13 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:94: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 14 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:100: PLUS
				{
				mPLUS(); 

				}
				break;
			case 15 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:105: MOINS
				{
				mMOINS(); 

				}
				break;
			case 16 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:111: AFTER
				{
				mAFTER(); 

				}
				break;
			case 17 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:117: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 18 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:124: ET
				{
				mET(); 

				}
				break;
			case 19 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:127: OU
				{
				mOU(); 

				}
				break;
			case 20 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:130: POINT
				{
				mPOINT(); 

				}
				break;
			case 21 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:136: OBJET
				{
				mOBJET(); 

				}
				break;
			case 22 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:142: MOT
				{
				mMOT(); 

				}
				break;
			case 23 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:146: PAS
				{
				mPAS(); 

				}
				break;
			case 24 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:150: WrittenBy
				{
				mWrittenBy(); 

				}
				break;
			case 25 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:160: MOTS
				{
				mMOTS(); 

				}
				break;
			case 26 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:165: NUMBERLETTER
				{
				mNUMBERLETTER(); 

				}
				break;
			case 27 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:178: MONTHLetter
				{
				mMONTHLetter(); 

				}
				break;
			case 28 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:190: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:193: VAR
				{
				mVAR(); 

				}
				break;
			case 30 :
				// E:\\LO17\\antlr\\tal_sql\\tal_sql.g:1:197: NUM
				{
				mNUM(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\32\uffff\14\30\1\131\1\133\15\30\1\26\1\30\1\26\1\30\1\161\5\30\1\170"+
		"\3\30\3\26\3\30\1\26\17\30\1\uffff\1\30\1\uffff\12\30\1\u009b\2\30\1\u009e"+
		"\1\u00a0\6\30\1\uffff\2\30\1\u00a9\1\170\1\30\1\170\1\uffff\3\30\1\26"+
		"\1\30\1\u00b0\4\30\1\170\2\30\1\170\5\30\1\u00a0\2\30\1\26\4\30\1\26\3"+
		"\30\1\u00c5\2\30\1\uffff\2\30\1\uffff\1\133\1\uffff\1\u00a0\1\30\1\170"+
		"\2\30\1\26\2\30\1\uffff\2\170\1\30\1\u00a0\2\30\1\uffff\7\30\1\u00da\1"+
		"\30\1\u00dc\1\u00a0\1\u00dd\1\u00de\1\30\1\u00e0\1\u00e1\1\170\3\30\1"+
		"\uffff\3\30\1\u00e8\2\30\1\u00a9\1\30\1\u00ec\4\30\1\170\1\u00f1\1\30"+
		"\1\u00f3\3\30\1\uffff\1\30\6\uffff\3\30\1\u00da\1\u00a9\1\30\1\uffff\1"+
		"\u00da\2\30\1\uffff\3\30\1\u00b0\1\uffff\1\30\1\uffff\1\u00f1\1\30\1\u0103"+
		"\2\30\1\u0106\1\u00a0\1\u00a9\1\30\1\u00a0\1\30\3\u00a0\1\u00a9\1\uffff"+
		"\1\30\1\u010a\1\uffff\1\u00a0\1\30\1\u00a9\1\uffff\1\u00a0";
	static final String DFA12_eofS =
		"\u010c\uffff";
	static final String DFA12_minS =
		"\1\11\2\uffff\15\141\1\uffff\5\141\1\uffff\1\141\2\uffff\1\165\1\141\2"+
		"\155\1\165\1\155\1\156\1\164\1\160\1\141\1\165\3\141\1\162\1\170\1\164"+
		"\1\157\1\165\1\142\1\143\1\166\1\165\1\162\1\142\2\151\1\141\1\164\1\141"+
		"\1\156\1\141\1\164\1\141\1\162\1\170\1\160\1\141\1\151\1\156\1\151\3\141"+
		"\2\154\1\164\1\141\1\142\2\145\1\146\1\142\1\164\1\161\1\151\1\145\1\162"+
		"\1\156\1\151\1\164\1\151\1\162\1\uffff\1\145\1\uffff\1\151\1\164\1\162"+
		"\1\151\1\163\1\162\1\150\1\162\1\163\1\154\1\141\1\154\1\156\2\141\1\163"+
		"\1\165\1\170\2\145\1\164\1\uffff\1\157\1\147\2\141\1\164\1\141\1\uffff"+
		"\1\164\1\166\1\154\1\141\1\157\1\141\2\162\1\155\1\162\1\141\1\151\1\145"+
		"\1\141\1\143\1\163\1\141\1\164\1\154\1\141\1\154\1\145\1\141\1\162\2\145"+
		"\1\163\1\141\3\151\1\141\1\151\1\145\1\uffff\1\151\1\163\1\uffff\1\141"+
		"\1\uffff\1\141\1\151\1\141\1\155\1\162\1\141\1\142\1\145\1\uffff\2\141"+
		"\1\151\1\141\1\154\1\151\1\uffff\2\145\1\142\1\157\1\145\1\156\1\154\1"+
		"\141\1\151\4\141\1\40\3\141\1\161\2\145\1\uffff\2\162\1\145\1\141\1\163"+
		"\1\142\1\141\1\162\1\141\1\155\2\145\1\162\2\141\1\162\1\141\1\156\1\151"+
		"\1\145\1\uffff\1\164\6\uffff\1\165\2\162\2\141\1\162\1\uffff\1\141\1\162"+
		"\1\145\1\uffff\1\142\1\162\1\164\1\141\1\uffff\1\145\1\uffff\1\141\1\162"+
		"\1\141\1\162\1\145\3\141\1\145\1\141\1\162\4\141\1\uffff\1\145\1\141\1"+
		"\uffff\1\141\1\145\1\141\1\uffff\1\141";
	static final String DFA12_maxS =
		"\1\172\2\uffff\15\172\1\uffff\5\172\1\uffff\1\172\2\uffff\1\165\1\151"+
		"\1\166\1\155\1\165\2\156\1\164\2\162\1\165\1\141\2\172\1\162\1\170\1\164"+
		"\1\157\1\165\1\142\1\143\1\166\1\165\1\163\1\142\1\164\1\162\1\172\1\164"+
		"\1\172\1\156\1\172\1\164\1\141\1\162\1\170\1\160\1\172\1\151\1\156\1\151"+
		"\3\172\2\154\1\164\1\172\1\142\2\145\1\146\1\142\1\164\1\161\1\151\1\145"+
		"\1\162\1\156\1\151\1\164\1\151\1\162\1\uffff\1\145\1\uffff\1\151\1\164"+
		"\1\162\1\151\1\163\1\162\1\150\1\162\1\163\1\164\1\172\1\154\1\156\2\172"+
		"\1\163\1\165\1\170\2\145\1\164\1\uffff\1\157\1\147\2\172\1\164\1\172\1"+
		"\uffff\1\164\1\166\1\156\1\172\1\157\1\172\2\162\1\155\1\162\1\172\1\151"+
		"\1\145\1\172\1\143\1\163\1\141\1\164\1\154\1\172\1\154\1\145\1\172\1\162"+
		"\2\145\1\163\1\172\3\151\1\172\1\151\1\145\1\uffff\1\151\1\163\1\uffff"+
		"\1\172\1\uffff\1\172\1\151\1\172\1\155\1\162\1\172\1\142\1\145\1\uffff"+
		"\2\172\1\151\1\172\1\154\1\151\1\uffff\2\145\1\142\1\157\1\145\1\156\1"+
		"\154\1\172\1\151\4\172\1\40\3\172\1\161\2\145\1\uffff\2\162\1\145\1\172"+
		"\1\163\1\142\1\172\1\162\1\172\1\155\2\145\1\162\2\172\1\162\1\172\1\156"+
		"\1\151\1\145\1\uffff\1\164\6\uffff\1\165\2\162\2\172\1\162\1\uffff\1\172"+
		"\1\162\1\145\1\uffff\1\142\1\162\1\164\1\172\1\uffff\1\145\1\uffff\1\172"+
		"\1\162\1\172\1\162\1\145\3\172\1\145\1\172\1\162\4\172\1\uffff\1\145\1"+
		"\172\1\uffff\1\172\1\145\1\172\1\uffff\1\172";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\1\2\15\uffff\1\24\5\uffff\1\34\1\uffff\1\35\1\36\77\uffff"+
		"\1\12\1\uffff\1\22\25\uffff\1\23\6\uffff\1\32\42\uffff\1\27\2\uffff\1"+
		"\31\1\uffff\1\33\10\uffff\1\26\6\uffff\1\3\24\uffff\1\16\24\uffff\1\20"+
		"\1\uffff\1\21\1\6\1\15\1\30\1\7\1\10\6\uffff\1\17\3\uffff\1\25\4\uffff"+
		"\1\4\1\uffff\1\13\17\uffff\1\5\2\uffff\1\14\3\uffff\1\11\1\uffff";
	static final String DFA12_specialS =
		"\u010c\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\14\uffff\1\1\1\20\1\2\12\31\5\uffff"+
			"\1\20\1\uffff\32\30\6\uffff\1\7\1\30\1\6\1\16\1\10\1\13\1\30\1\24\1\21"+
			"\1\25\1\30\1\27\1\15\1\5\1\17\1\14\1\4\1\12\1\22\1\11\1\23\1\3\4\30",
			"",
			"",
			"\16\30\1\32\13\30",
			"\24\30\1\33\5\30",
			"\4\30\1\36\11\30\1\34\5\30\1\35\5\30",
			"\10\30\1\40\5\30\1\37\13\30",
			"\16\30\1\44\1\42\1\30\1\41\3\30\1\43\4\30",
			"\2\30\1\50\11\30\1\45\1\46\5\30\1\47\6\30",
			"\4\30\1\51\3\30\1\52\5\30\1\54\2\30\1\53\10\30",
			"\24\30\1\55\5\30",
			"\4\30\1\57\3\30\1\56\21\30",
			"\1\61\12\30\1\60\10\30\1\62\5\30",
			"\1\64\15\30\1\63\13\30",
			"\1\66\3\30\1\65\11\30\1\70\5\30\1\67\5\30",
			"\2\30\1\72\21\30\1\71\5\30",
			"",
			"\14\30\1\73\15\30",
			"\4\30\1\76\3\30\1\75\13\30\1\74\5\30",
			"\15\30\1\77\14\30",
			"\24\30\1\100\5\30",
			"\1\101\3\30\1\103\17\30\1\102\5\30",
			"",
			"\1\105\3\30\1\104\25\30",
			"",
			"",
			"\1\106",
			"\1\110\3\uffff\1\107\3\uffff\1\111",
			"\1\112\10\uffff\1\113",
			"\1\114",
			"\1\115",
			"\1\116\1\117",
			"\1\120",
			"\1\121",
			"\1\123\1\uffff\1\122",
			"\1\124\20\uffff\1\125",
			"\1\126",
			"\1\127",
			"\23\30\1\130\6\30",
			"\21\30\1\132\10\30",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145\1\146",
			"\1\147",
			"\1\150\12\uffff\1\151",
			"\1\152\10\uffff\1\153",
			"\2\30\1\156\14\30\1\154\4\30\1\155\5\30",
			"\1\157",
			"\32\30",
			"\1\160",
			"\32\30",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\4\30\1\167\25\30",
			"\1\171",
			"\1\172",
			"\1\173",
			"\32\30",
			"\22\30\1\174\7\30",
			"\32\30",
			"\1\175",
			"\1\176",
			"\1\177",
			"\32\30",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"",
			"\1\u008f",
			"",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u009a\7\uffff\1\u0099",
			"\32\30",
			"\1\u009c",
			"\1\u009d",
			"\32\30",
			"\22\30\1\u009f\7\30",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"",
			"\1\u00a7",
			"\1\u00a8",
			"\32\30",
			"\32\30",
			"\1\u00aa",
			"\32\30",
			"",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ae\1\uffff\1\u00ad",
			"\32\30",
			"\1\u00af",
			"\32\30",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\32\30",
			"\1\u00b5",
			"\1\u00b6",
			"\32\30",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\32\30",
			"\1\u00bc",
			"\1\u00bd",
			"\32\30",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\32\30",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\32\30",
			"\1\u00c6",
			"\1\u00c7",
			"",
			"\1\u00c8",
			"\1\u00c9",
			"",
			"\32\30",
			"",
			"\32\30",
			"\1\u00ca",
			"\32\30",
			"\1\u00cb",
			"\1\u00cc",
			"\32\30",
			"\1\u00cd",
			"\1\u00ce",
			"",
			"\4\30\1\u00cf\25\30",
			"\32\30",
			"\1\u00d0",
			"\32\30",
			"\1\u00d1",
			"\1\u00d2",
			"",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\32\30",
			"\1\u00db",
			"\32\30",
			"\32\30",
			"\32\30",
			"\32\30",
			"\1\u00df",
			"\32\30",
			"\32\30",
			"\32\30",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\32\30",
			"\1\u00e9",
			"\1\u00ea",
			"\32\30",
			"\1\u00eb",
			"\32\30",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\32\30",
			"\32\30",
			"\1\u00f2",
			"\32\30",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"",
			"\1\u00f7",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\32\30",
			"\32\30",
			"\1\u00fb",
			"",
			"\32\30",
			"\1\u00fc",
			"\1\u00fd",
			"",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\32\30",
			"",
			"\1\u0101",
			"",
			"\32\30",
			"\1\u0102",
			"\32\30",
			"\1\u0104",
			"\1\u0105",
			"\32\30",
			"\32\30",
			"\32\30",
			"\1\u0107",
			"\32\30",
			"\1\u0108",
			"\32\30",
			"\32\30",
			"\32\30",
			"\32\30",
			"",
			"\1\u0109",
			"\32\30",
			"",
			"\32\30",
			"\1\u010b",
			"\32\30",
			"",
			"\32\30"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__32 | T__33 | SELECT | SELECTCOUNT | ARTICLE | EMAIL | TEXTE | TITRE | RUBRIQUE | EN | NUMERO | FICHIER | ENTRE | PLUS | MOINS | AFTER | BEFORE | ET | OU | POINT | OBJET | MOT | PAS | WrittenBy | MOTS | NUMBERLETTER | MONTHLetter | WS | VAR | NUM );";
		}
	}

}
