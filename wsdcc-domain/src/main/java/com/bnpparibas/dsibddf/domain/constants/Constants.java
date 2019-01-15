/**
 * 
 */
package com.bnpparibas.dsibddf.domain.constants;

/**
 * Contient les constantes de l'application
 *
 */
public final class Constants {
	
    /** ========================================
     *  Constructeur prive
     *  ========================================
     */
    private Constants() {

        //
    }

    public static final  String REF_DCC_NON_ELEGB = "0000000000000000000000000000000000000000000000000000000000000000";

    public static final  String NUMBER_ATTEMPTS = "NUMBER_ATTEMPTS";

    public static final  String SESSION_VIREMENT_DTO = "VIREMENTDTO";

    /**
     * Comment for <code>SESSION_AUTOMATE</code> Permet d'identifier les donnees liees a l'Automate dans le HashMap <b>sessionValues </b>
     */
    public static final  String SESSION_AUTOMATE = "AUTOMATE";

    public static final  String SESSION_RETRAIT = "RETRAIT";

    /**
     * Comment for <code>SESSION_PORTEUR</code> Permet d'identifier les donnees liees au Porteur dans le HashMap <b>sessionValues </b>
     */
    public static final  String SESSION_PORTEUR = "PORTEUR";

    /**
     * Comment for <code>SESSION_ETAT_COURANT</code> Permet d'identifier les donnees liees à l'état du Système dans le HashMap <b>sessionValues </b>
     */
    public static final  String SESSION_ETAT_COURANT = "ETAT_COURANT";

    /**
     * Comment for <code>SESSION_TIME_OUT</code> Permet d'identifier le nombre des TimeOut Client dans le HashMap <b>sessionValues </b>
     */
    public static final  String SESSION_TIME_OUT = "TIME_OUT";

    /**
     * Message d'acces à la methode dopost de la servlet EligibiliteAjaxServlet
     */
    public static final  String ELIGIBILITE_AJAX_SERVLET_DO_POST = "[EligibiliteAjaxServlet]doPost()";

    public static final  String NB_ESSAIE_AJAX_SERVLET_DO_POST = "[NbEssaiAjaxServlet]doPost()";

    /**
     * Message d'acces à la methode dopost de la servlet ControleEnrchissementAjaxServlet
     */
    public static final  String CONTROLE_ENRECHI_AJAX_SERVLET_DO_POST = "[ControleEnrchissementAjaxServlet]doPost()";

    /**
     * Message d'acces à la methode dopost de la servlet EnregistrementAjaxServlet
     */
    public static final  String ENREGISTREMENT_AJAX_SERVLET_DO_POST = "[EnregistrementAjaxServlet]doPost()";

    /**
     * Message d'acces à la methode dopost de la servlet FinTransactionAjaxServlet
     */
    public static final  String FIN_TRANSACTION_AJAX_SERVLET_DO_POST = "[FinTransactionAjaxServlet]doPost()";

    /**
     * 
     */
    public static final  String DATA = "\n</data>";


    /**
     * 
     */
    public static final  String CODE_RETOUR2 = "\n</CODE_RETOUR>";

    /**
     * 
     */
    public static final  String STR = "]]>";

    /**
     * 
     */
    public static final  String STR_END = "\" />";

    /**
     * 
     */
    public static final  String AND = "&";

    /**
     * 
     */
    public static final  String OK = "OK";

    /**
     * 
     */
    public static final  String CDATA = "\n<![CDATA[";

    /**
     * 
     */
    public static final  String CODE_RETOUR = "\n<CODE_RETOUR>";

    /**
     * 
     */
    public static final  String RESPONSE = "\n<response>";
    /**
     * 
     */
    public static final  String XML_VERSION_1_0_ENCODING_ISO_8859_1 = "\n<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>";

    /**
     * Service Virement
     */
    public static final String M_SERVICE_DCC = "DCC";

    /**
     * SubService Virement
     */
    public static final String M_SUBSERVICE_DCC_ELIGIBILITE = "GET_DCC_ELIGIBILITE";

    public static final String M_SUBSERVICE_DCC_CHOIX_RET = "CHOIX_RET";

    /**
     * SUBSERVICE_JOURNALISATION
     */
    public static final String SUBSERVICE_JOURNALISATION = "JOURNALISATION";

    /** idSession. **/
    public static final String ID_SESSION = "idSession";

    /**
     * VIDE
     */
    public static final String VIDE = "";

    /**
     * SERVICE
     */
    public static final String SERVICE = "service";

    /**
     * SUBSERVICE
     */
    public static final String SUBSERVICE = "subservice";

    /**
     * CONTEXT
     */

    public static final String REQUEST = "request";
    
    public static final String CONTEXT = "context";

    public static final String EXCHANGE = "exchange";

    public static final String ATMID = "atmid";

    /**
     * CHAINE_SERVICE
     */
    public static final  String CHAINE_SERVICE = "Service : ";

    /**
     * CHAINE_SERVICE
     */
    public static final String CHAINE_ID_SESSION = "idSession : ";

    /**
     * CHAINE_SUBSERVICE
     */
    public static final String CHAINE_SUBSERVICE = "Subservice : ";

    /**
     * CHAINE_CONTEXT
     */
    public static final String CHAINE_CONTEXT = "Context : ";

    /**
     * ENCODAGE_ISO_8859_1
     */
    public static final String ENCODAGE_ISO_8859_1 = "ISO-8859-1";

    /**
     * CHAINE_TRUE
     */
    public static final String CHAINE_TRUE = "true";
    /**
     * CHAINE_CARTE
     */
    public static final String CHAINE_CARTE = "CARTE : ";

    /**
     * CARTE
     */
    public static final String CARTE = "CARTE";

    /**
     * CHAINE_NO_TERMINAL
     */
    public static final String CHAINE_NO_TERMINAL = "NO TERMINAL : ";

    /**
     * NO_TERMINAL
     */
    public static final String NO_TERMINAL = "NO TERMINAL";

    /**
     * CHAINE_MONTANT
     */
    public static final String CHAINE_MONTANT = "MONTANT : ";
    
    /**
     * MONTANT
     */
    public static final String MONTANT = "MONTANT";

    /**
     * CHAINE_PUISSANCE_MONTANT
     */
    public static final String CHAINE_PUISSANCE_MONTANT = "PUISSANCE MONTANT : ";
    
    /**
     * PUISSANCE_MONTANT
     */
    public static final String PUISSANCE_MONTANT = "PUISSANCE MONTANT";

    /**
     * CHAINE_DATE
     */
    public static final String CHAINE_DATE = "DATE : ";
    
    /**
     * DATE
     */
    public static final String DATE = "DATE";

    
    /**
     * CHAINE_HEURE
     */
    public static final String CHAINE_HEURE = "HEURE : ";
    
    /**
     * HEURE
     */
    public static final String HEURE = "HEURE";

    /**
     * CHAINE_COULEURS
     */
    public static final String CHAINE_COULEURS = "Couleurs : ";

    /**
     * COULEURS
     */
    public static final String COULEURS = "Couleurs";

    /**
     * CHAINE_LARGEUR_ECRAN
     */
    public static final String CHAINE_LARGEUR_ECRAN = "Largeur écran : ";

    /**
     * LARGEUR_ECRAN
     */
    public static final String LARGEUR_ECRAN = "Largeur écran";

    /**
     * CHAINE_HAUTEUR_ECRAN
     */
    public static final String CHAINE_HAUTEUR_ECRAN = "Hauteur écran : ";

    /**
     * LARGEUR_ECRAN
     */
    public static final String HAUTEUR_ECRAN = "Hauteur écran";
    /**
     * CHAINE_fr_FR
     */
    public static final String CHAINE_FR_FR = "fr_FR";
    /**
     * CHAINE_LANGUE
     */
    public static final String CHAINE_LANGUE = "LANGUE : ";
    /**
     * CHAINE_LANGUE
     */
    public static final String LANGUE = "LANGUE";
    /**
     * CHAINE_FOURNISSEUR
     */
    public static final String CHAINE_FOURNISSEUR = "Fournisseur : ";
    /**
     * FOURNISSEUR
     */
    public static final String FOURNISSEUR = "Fournisseur";
    /**
     * CHAINE_GAMME
     */
    public static final String CHAINE_GAMME = "Gamme : ";
    /**
     * GAMME
     */
    public static final String GAMME = "Gamme";
    /**
     * CHAINE_MODELE
     */
    public static final String CHAINE_MODELE = "Modèle : ";

    /**
     * MODELE
     */
    public static final String MODELE = "Modèle";
    /**
     * CHAINE_MODELE
     */
    public static final String CHAINE_ETAT_A4 = "ETAT A4 : ";

    /**
     * ETAT_A4
     */
    public static final String ETAT_A4 = "ETAT A4";

    /**
     * CHAINE_ETAT_TICKET
     */
    public static final String CHAINE_ETAT_TICKET = "ETAT TICKET : ";

    /**
     * ETAT_TICKET
     */
    public static final String ETAT_TICKET = "ETAT TICKET";

    /**
     * AUTOSELECTION
     */
    public static final String AUTOSELECTION = "AUTOSELECTION";

    /**
     * CHAINE_AUTOSELECTION
     */
    public static final String CHAINE_AUTOSELECTION = "AUTOSELECTION : ";

    /**
     * TYPE_ATM
     */
    public static final String TYPE_ATM = "TYPE ATM";

    /**
     * CHAINE_TYPE_ATM
     */
    public static final String CHAINE_TYPE_ATM = "TYPE ATM : ";

    /**
     * CHAINE_VIREMENT_SERVLET
     */
    public static final String CHAINE_VIREMENT_SERVLET = "/VirementServlet?";

    /**
     * EGALE
     */
    public static final String EGALE = "=";

    /**
     * PARAM_ACTION
     */
    public static final String PARAM_ACTION = "action";

    /**
     * l'action ACTION_APPEL_ELIGIBILITE
     */
    public static final  String ACTION_APPEL_ELIGIBILITE = "appelEligibilite";

    /**
     * l'action suivant
     */
    public static final  String ACTION_SUIV = "suiv";

    /**
     * l'action precedent
     */
    public static final  String ACTION_PREC = "prec";

    /**
     * l'action OK
     */
    public static final  String ACTION_OK = "ok";

    /**
     * Erreur Technique
     */
    public static final  String ERREUR_TECH = "erreur_tech";

    /**
     * l'action ACTION_EDT_OK
     */
    public static final  String ACTION_EDT_OK = "edtok";

    /**
     * l'action ACTION_EDT_KO
     */
    public static final  String ACTION_EDT_KO = "edtko";

    /**
     * l'action ANNULATION
     */
    public static final  String ACTION_ANNULATION = "annuler";

    /**
     * l'action KO
     */
    public static final  String ACTION_KO = "ko";

    /**
     * l'action TimeOut
     */
    public static final  String ACTION_TIMEOUT = "timeOut";

    /**
     * l'action TimeOut Appel
     */
    public static final  String ACTION_TIMEOUT_APPEL = "timeOut_Appel";

    /**
     * l'action TimeOut Appel Composant Goal
     */
    public static final  String ACTION_TIMEOUT_APPEL_GOAL = "timeOut_Appel_Goal";

    /**
     * l'action Aide
     */
    public static final  String ACTION_AIDE = "aide";

    /**
     * l'action Aide
     */
    public static final  String ACTION_RETOUR_MENU = "retourMenu";

    /**
     * l'action Modifier
     */
    public static final  String ACTION_MODIFIER = "modifier";

    /**
     * l'action Annulation Clavier
     */
    public static final  String ACTION_ANNULATION_CLAVIER = "annulationClavier";

    /**
     * 
     */
    public static final  String VIR_APPEL_CXT_EVENT = "";

    /**
     * Appel Eligibilité event
     */
    public static final  String APPEL_ELG_EVENT = "VirementBusinessController-appelerEligibilite";

    /**
     * Appel Contrôle et Enrichissement event
     */
    public static final  String APPEL_CRT_EVENT = "VirementBusinessController-appelControleEnrichissement";

    /**
     * Appel Enregistrement event
     */
    public static final  String APPEL_ENR_EVENT = "VirementBusinessController-appelerEnregistrement";

    /**
     * Appel Test Broker
     */
    public static final  String APPEL_TEST_BROKER = "test-Broker";

    /**
     * Chaine URL Impression
     */
    public static final  String CHAINE_URL_IMPRESSION = "/jsp/impression/";

    /**
     * Chaine URL Journalisation
     */
    public static final  String CHAINE_URL_JOURNAL = "/jsp/journalisation/";

    /**
     * Chaine Nom Jsp Impression
     */
    public static final  String CHAINE_NOM_JSP_IMPRESSION = "nomJspImpression";
    /**
     * Chaine Param Id Session
     */
    public static final  String CHAINE_PARAM_ID_SESSION = "idSession";

    /**
     * 
     */
    public static final  String PROCONSULT = "Proconsult";

    /**
     * 
     */
    public static final  String OUI = "OUI";

    /**
     * 
     */
    public static final  String NON = "NON";

    /**
     * 
     */
    public static final  String PERSONNALISATION = "PERSONNALISATION";

    /**
     * 
     */
    public static final  String URL_VIP = "urlVip";

    /**
     * 
     */
    public static final  String VIR_JOURNALISATION_KO_JSP = "vir_journalisation_ko.jsp";

    /**
     * 
     */
    public static final  String CHAINE_NUM_TICKET = "NumTicket";

    /**
     * 
     */
    public static final  String ENVIRONEMENT_EXECUTION_DEV = "environement.execution.dev";

    /**
     * 
     */
    public static final  String ENVIRONEMENT_EXECUTION_QUALIF = "environement.execution.qualif";

    /**
     * 
     */
    public static final  String MONTANT_MIN_VIREMENT = "montant_minimum_vir";

    /**
     * 
     */
    public static final  String JSP_ID_SESSION = ".jsp?idSession=";

    /**
     * 
     */
    public static final  String CHAINE_DEUX_POINTS = ":";

    /**
     * 
     */
    public static final  String CHAINE_ID_SESSION_EGAL = "?idSession=";

    /**
     * 
     */
    public static final  String VIR_JOURNALISATION_OK_JSP = "vir_journalisation_ok.jsp";

    /**
     * 
     */
    public static final  String SUPPRESSION_DE_LA_SESSION = "Suppression de la Session :";

    /**
     * 
     */
    public static final  String DEMANDE_IMPRESSION_URLSTR = "Demande Impression urlstr : ";

    /**
     * 
     */
    public static final  String AND_NUM_TICKET = "&NumTicket=";

    /**
     * 
     */
    public static final  String CONTENT_LENGTH = "Content-Length";

    /**
     * 
     */
    public static final  String EXPIRES = "Expires";

    /**
     * 
     */
    public static final  String CACHE_CONTROL = "Cache-control";

    /**
     * 
     */
    public static final  String NO_CACHE_NO_STORE_PRIVATE_MUST_REVALIDATE = "no-cache, no-store, private, must-revalidate";

    /**
     * 
     */
    public static final  String PRAGMA = "Pragma";

    /**
     * 
     */
    public static final  String NO_CACHE = "no-cache";

    /**
     * 
     */
    public static final  String CONNECTION = "Connection";

    /**
     * 
     */
    public static final  String KEEP_ALIVE = "Keep-Alive";

    /**
     * 
     */
    public static final  String TEXT_XML_CHARSET_ISO_8859_1 = "text/xml; charset=ISO-8859-1";

    /**
     * 
     */
    public static final  String DEUX_POINTS_DEUX_SLACHS = "://";

    public static final  int TAILLE_REFERENCE_DCC = 64;

    public static final  int TAILLE_REVENU_ACQUEREUR = 12;

    public static final  int TAILLE_MARGE_DCC = 5;

    public static final  int TAILLE_LIGNE = 40;
    
    public static final  String FORMAT_DATE_FR           =  "dd/MM/yyyy";
    
    public static final  String FORMAT_DATE_EN           =  "dd/MM/yy";
    
    public static final  String FORMAT_DATE_DE           =  "dd/MM/yyyy";
    
    public static final  String FORMAT_DATE_IT           =  "dd/MM/yy";
    
    public static final  String FORMAT_DATE_HHMM         =  "HHmm";
    
    public static final  String FORMAT_DATE_YYYYMMDD     =  "yyyyMMdd";
    
    /**
     * Bit du service CIBC dans MeoGAB
     */
    
    public static final  int BIT_DCC              = 28;
    
    public static final  String MASTERCARTE      =  "MC";
    
    public static final  String VISA             =  "VC";
    
    public static final String CSS_LABEL        = "speLabel";

    
    /* ==============================================
     * Variables statiques du service CIBC
     * ============================================== 
     */ 
    
    /**
     * Identification organisme acquéreur
     */
    public static final  String ACQID            = "6501";
    
    /**
     * Code pays de l'organisme acquéreur
     */
    public static final  String ACQCO            = "250";
    
    /**
     * Code de catégorie GAB DCC
     */
    public static final  String ATMCAT           = "14";
    
    /**
     * Correspond au Type d’opération
     */
    public static final  String TYPEENR          = "34";
    
    /**
     * Code Pays
     */
    
    public static final  String CODEPAYS         = "FR";
    
    public static final  String TRANCUR          = "978";
        
    /**
     * Chaines char
     */

    public static final String ENCODAGE_XML_UTF8 = "text/xml;charset=UTF-8";

    public static final  String COULEURS_32      = "32";
    
    public static final  String CHAR_VIDE        = "";
    
    public static final  String CHAR_POINT       = ".";
    
    public static final  String CHAINEZERO       = "0";
    
    public static final  String CHAINE_LANGUE_EN = "en_EN";
    
    public static final  String CHAINE_LANGUE_FR = "fr_FR";
    
    public static final  String CHAINE_LANGUE_IT = "it_IT";
    
    public static final  String CHAINE_LANGUE_ES = "es_ES";
    
    public static final  String CHAINE_LANGUE_DE = "de_DE";
    
    public static final  String CODE_RETOUR_OK   = "00";
    
    public static final  String NIVEAU_LOG_DEBUG = "DEBUG";
    
    public static final  String NIVEAU_LOG_ERROR = "ERROR";
    
    public static final  String SEPARATEUR       = " : ";
    /** ==============================================
     * Longeurs des paramètres d'export stats
     * ============================================== 
     */ 
    // Partie commune
    public static final  int LONGEUR_TYPEENR 		= 2 ;
    public static final  int LONGEUR_IDATM 		= 8 ;
    public static final  int LONGEUR_PROTOCOLE 		= 2 ;
    public static final  int LONGEUR_CODESIEGE 		= 5 ;
    public static final  int LONGEUR_SOUSTYPEPROTOCOLE 	= 1 ;
    public static final  int LONGEUR_STATIONID 		= 2 ;
    public static final  int LONGEUR_N_OPERATION_GAB 	= 6 ;
    public static final  int LONGEUR_EMETTEUR_CARTE 	= 5 ;
    public static final  int LONGEUR_CODEENSEIGNECARTE 	= 3 ;
    public static final  int LONGEUR_DATE 		= 8 ;
    public static final  int LONGEUR_HEURE 		= 4 ;
    public static final  int LONGEUR_RESULTAT_INTERNE 	= 8 ;
    public static final  int LONGEUR_PAN 		= 19;
    public static final  int LONGEUR_CODESERVICE 	= 3 ;
    public static final  int LONGEUR_SIEGEPORTEUR 	= 5 ;
    
    //Partie spécifique
    public static final  int LONGEUR_RPID 		= 64;
    public static final  int LONGEUR_TRANSAMT 		= 12;
    public static final  int LONGEUR_BILLAMT 		= 12;
    public static final  int LONGEUR_POS 		= 4 ;
    public static final  int LONGEUR_MONTANT_CONVERTI 	= 12;
    public static final  int LONGEUR_POSITIONDECIMALE 	= 1 ;
    public static final  int LONGEUR_TAUXCONVERSION 	= 8 ;
    public static final  int LONGEUR_DEVISEETRANGERE 	= 3 ;
    public static final  int LONGEUR_MARGEDCC 		= 8 ;
    public static final  int LONGEUR_TAUXCHANGE 		= 20;
    public static final  int LONGEUR_REVENUAQU 		= 12;
    public static final  int LONGEUR_RESEAUAPPART 	= 4 ;
    
    /** ========================================
     * Longeurs des paramètres CIBC
     * ========================================
     */ 
    public static final  int LONGEUR_LO 			= 22 ;
    public static final  int LONGEUR_CI 			= 13 ;
    public static final  int LONGEUR_CO 			= 2 ;
    
    /** ========================================
     * Autres Longeurs
     *  ========================================
     */ 
    public static final  int LONGEUR_BOUTON 		= 3 ;
    
    /** ========================================
     * Fichiers properties
     *  ========================================
     */ 
    
    public static final  String DCCPROPERTIES   = "Swa_Properties_dcc.main.properties";
    
    /** ========================================
     * GAGN
     *  ========================================
     */ 
    public static final  String BIN_GA = "GA";
    
    public static final  String BIN_GN = "GN";
    
    public static final  String BIN_GAGN = "GAGN";
    
    public static final  String BIN_AUTRE = "NO";
    
    /** ========================================
     * Mode Bouchon
     *  ========================================
     */ 
    public static final  String  RCVID ="9500";
    public static final  String  RC ="00";
    public static final  String  BILLAMT ="120.89";
    public static final  String  BILLRATE ="1.2088974";
    public static final  String  BILLCUR ="756";
    public static final  String  BILLCURA = "CHF";
    public static final  String  RPID ="9a086c82f8cc46c69bf12765db86a53f";
    public static final  String  RFLAG ="1";
    public static final  String  R = "0.827200";
    public static final  int     POS = 2;
    public static final  String  EXP = "2017-10-13T05:02:10Z" ;
    public static final  String  MUP = "3.49" ;
    public static final  String  SRC = "Alternate Solutions";
    public static final  String  REV = "2.19" ;
    public static final  int     LONGEUR_TIME = 8 ;
    public static final  int     LONGEUR_CDATE = 10 ;
    public static final  int     LONGEUR_EXP=20;


}
