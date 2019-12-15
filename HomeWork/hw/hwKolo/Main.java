package hwKolo;

public class Main {

	public static void main(String[] args) {
		
		CestnoKolo c1 = new CestnoKolo("rdece", 70, 3);

		System.out.println();
		c1.izpisiVseLasnosti();
		
		c1.accelSim();
		
		System.out.println();	
		c1.izpisiVseLasnosti();



	}

}
