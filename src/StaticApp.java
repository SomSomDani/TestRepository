
public class StaticApp {
	
	public static void main (String[] args)
	{
		// verwenden der statischen Konstante MyPi
		System.out.printf("MyPi = %.2f\n",MyMath.MyPi);
		// verwenden der nicht statischen Konstante MyPi_Nonstatic
		MyMath myM = new MyMath();
		System.out.printf("MyPi_NonStatic = %.2f\n",myM.MyPi_NonStatic);
		
		// die nichtstatische Methode muss über die Instanzvariable
		// myM aufgerufen werden
		System.out.println(myM.NonStatic());
	
	}

}
