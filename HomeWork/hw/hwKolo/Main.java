package hwKolo;

public class Main {

	public static void main(String[] args) {	

		CestnoKolo c1 = new CestnoKolo("rdece", 70, 15);

		c1.izpisiVseLasnosti();

		int count1 = 0;
		int count2 = 0;

		//Pospesek
		for (int i = 0; i < 5; i++) {		
			if(i % 3 == 0) {
				c1.prestavaGor();
			}			
			c1.pospesi();
		}

		System.out.println();
		c1.izpisiVseLasnosti();


		//Bremzanje
		for (int i = 0; i < 5; i++) {
			if(i % 3 == 0) {
				c1.prestavaDol();
			}

			c1.zaviraj();
		}

		System.out.println();
		c1.izpisiVseLasnosti();




	}

}
