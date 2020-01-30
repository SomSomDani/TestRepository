
public class MyMath {

	//Wichtig
	/*
	 * Statische Members (Felder und Methoden können im HauptProgramm 
	 * oder in anderen Klassen ohne Erzeugung einer Instanz verwendet werden
	 * es muss nur der Klassenname und durch Punkt getrennt der Membername angegeben
	 * werden
	 * 
	 * statische Members werden nur ein einziges Mal erzeugt 
	 * 		werden im Hauptprogramm z.B. 10 Instanzen einer Klasse mit statischen
	 * 		Feldern erzeugt, existiert dieses Feld nur ein einziges Mal für alle
	 * 		Instanzen
	 * normale Members (Felder) werden pro Instanz erzeugt;bei 10 Instanzen 
	 * 		existiert dieses Feld(z.B. Firstname) 10 mal im Speicher
	 * 
	 * 
	 */
	
	//	statische Members (Methoden,Felder)
	public static final double MyPi= 3.1415;
	// würde man so nicht machen
	public final double MyPi_NonStatic= 3.1415;
	
	public double wert= 10;
	
	//statische Methode
	public static double DegreeToRadiant(double degree)
	{
		// Wichtig: in einer statischen Methode darf man nur auf statische
		// Members (Felder,Methoden) zugreifen
		// z.B. wert darf in dieser Methode nicht verwendet werden, da sie statisch
		// ist aber wert ist nicht statisch
		
		return degree * 2 * Math.PI/360;
	}
	public static double RadiantToDegree(double radiant)
	{
		return radiant * 360 / (2*Math.PI);
	}
	
	// nicht statische Methode
	public double NonStatic() {
		// Wichtig: in einer nichtstatische Methode dürfen normale
		// und statische Members verwendet werden
		return wert * MyPi * RadiantToDegree(wert);
	}
	
}
