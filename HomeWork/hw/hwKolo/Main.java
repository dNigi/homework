package hwKolo;

public class Main {

	public static void main(String[] args) {	

		int steviloPrestav = 5;
		
		CestnoKolo c1 = new CestnoKolo("rdece", 70, steviloPrestav);

		System.out.println();
		c1.izpisiVseLasnosti();
		
		for (int i = 0; i < steviloPrestav; i++) {			
			for (int j = 0; j < 3; j++) {
				c1.pospesi();				
			}	
			c1.prestavaGor();
			System.out.println("Prestava: "+ c1.getPrestava());
			System.out.println(" "+c1.hitrost);
		}
		
		System.out.println();
		c1.izpisiVseLasnosti();



	}

}
