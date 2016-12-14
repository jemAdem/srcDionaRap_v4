 

import java.awt.Color;
import java.util.HashMap;

public class Settings {
	public static int ZEILEN_ANZAHL = 10;	
	public static int SPALTEN_ANZAHL = 10;
	public static int LABEL_DIMENSION = 50 ; // in pixel, quadratisch
	public static int BUTTONS_GROESSE = 80; // Set die Gr�sse of JButtons in pixels im Navigationsfenster
	public static int ENTFERNUNG_ZUM_SPIELBRETT = 20; // Die Entfernung zwichen Navigationsfenster und Spielbrett in pixels bei X Acshe
	public static Color BRETT_COLOR1 = Color.white;
	public static Color BRETT_COLOR2= Color.black;
	public static String THEME="alien";
	
	public static int GEGNER_ANZAHL = 3;
	public static int HINDERNIS_ANZAHL = 4;	
	public static int MUNITION_ANZAHL = 3;	
	
	public static int TOOLBAR_PANEL_ANZAHL=5;
	public static int TOOLBAR_HEIGHT=50;
	
	public static final String oStartWT = "OpponentStartWaitTime"; //= 3000 > 5 Sekunden am Anfang Schlaf
	public static final String sWaitT = "ShotWaitTime"; //=500  ein Schuss ben�tigt eine halbe Sekunde
	public static final String oWaitT = "OpponentWaitTime"; //=2000 Gegner warten vor jedem Zug 2 Sekunden

	public static final String rOppWT = "RandomOpponentWaitTime"; //=false   keine zuf�llige Wartezeit
	public static final String aColWObs = "AvoidCollisionWithObstacles"; // = true;
	public static final String aColWOpp = "AvoidCollisionWithOpponent"; //=false;

	public static final String aAlgSA = "AlgorithmAStarActive"; //= true;
	public static final String mTime = "MinimumTime"; //=800 > 0,8 Sekunden
	public static final String sGetsOT = "ShotGetsOwnThread"; //=true nicht unbegrenzte Anzahl Sch�sse
	public static final String dOppWT = "DynamicOpponentWaitTime"; //=false    immer gleichlang warten

	public static final String zeilenA = "ZeilenAnzahl";
	public static final String spaltenA = "SpaltenAnzahl";
	public static final String gegnerA = "GegnerAnzahl";
	public static final String hindernisA = "HindernisAnzahl";
	
	public HashMap<String, String> einstellungen = new HashMap<>();
	private int level=1;

	Settings() {
		initMapMTKonfig(level);
	}


	private void initMapMTKonfig(int level) {
		switch (level) {
		case 1:
			einstellungen.put(aAlgSA, "true");
			einstellungen.put(aColWObs, "true");
			einstellungen.put(aColWOpp, "false");
			einstellungen.put(mTime, "800");
			einstellungen.put(sGetsOT, "true");
			
			einstellungen.put(oStartWT, "3000");
			einstellungen.put(oWaitT, "2000");
			einstellungen.put(sWaitT, "500");
			einstellungen.put(rOppWT, "false");
			einstellungen.put(dOppWT, "false");
			
			einstellungen.put(spaltenA, "10");
			einstellungen.put(zeilenA, "10");
			einstellungen.put(gegnerA, "3");
			einstellungen.put(hindernisA, "4");
			break;
		case 2:
			einstellungen.put(aAlgSA, "true");
			einstellungen.put(aColWObs, "true");
			einstellungen.put(aColWOpp, "true");
			einstellungen.put(mTime, "800");
			einstellungen.put(sGetsOT, "true");
			einstellungen.put(oStartWT, "2000");
			einstellungen.put(oWaitT, "1500");
			einstellungen.put(sWaitT, "500");
			einstellungen.put(rOppWT, "false");
			einstellungen.put(dOppWT, "true");
			
			einstellungen.put(spaltenA, "15");
			einstellungen.put(zeilenA, "15");
			einstellungen.put(gegnerA, "6");
			einstellungen.put(hindernisA, "8");
			break;
		case 3:
			einstellungen.put(aAlgSA, "true");
			einstellungen.put(aColWObs, "true");
			einstellungen.put(aColWOpp, "true");
			einstellungen.put(mTime, "800");
			einstellungen.put(sGetsOT, "true");
			einstellungen.put(oStartWT, "1000");
			einstellungen.put(oWaitT, "1000");
			einstellungen.put(sWaitT, "500");
			einstellungen.put(rOppWT, "true");
			einstellungen.put(dOppWT, "true");
			
			einstellungen.put(spaltenA, "20");
			einstellungen.put(zeilenA, "20");
			einstellungen.put(gegnerA, "10");
			einstellungen.put(hindernisA, "12");
			break;
		}

	}
	
	public  HashMap<String, String> getEinstellungen() {
		return einstellungen;
	}
	
	public void setEinstellungen(HashMap<String, String> einstellungen) {
		this.einstellungen = einstellungen;
	}


	public int getLevel() {
		return level;
	}
	
	
	public void setLevel(int level) {
		this.level = level;
	}
	
}