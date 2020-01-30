
public class MyMath {

	//Wichtig
	/*
	 * Statische Members (Felder und Methoden können im HauptProgramm 
	 * oder in anderen Klassen ohne Erzeugung einer Instanz verwendet werden
	 * es muss nur der Klassenname und durch Punkt getrennt der Membername angegeben
	 * werden
	 * 
	 * 
	 * 
	 * 
	 */
	
	//	statische Members (Methoden,Felder)
	public static final double MyPi= 3.1415;
	// würde man so nicht machen
	public final double MyPi_NonStatic= 3.1415;
	
	//statische Methode
	public static double DegreeToRadiant(double degree)
	{
		return degree * 2 * Math.PI/360;
	}
	public static double RadiantToDegree(double radiant)
	{
		return radiant * 360 / (2*Math.PI);
	}
}
