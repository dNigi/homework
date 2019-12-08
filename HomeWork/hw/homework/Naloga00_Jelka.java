package homework;

public class Naloga00_Jelka {

	public static void main(String[] args) {

		System.out.println("   *   ");
		System.out.println("  ***  ");
		System.out.println(" ***** ");
		System.out.println("*******");
		System.out.println("  ***  ");
		System.out.println("  ***  ");

		System.out.println("\n");

		int steviloVrstic = 5;
		
		//kroshnja
		for (int i = 0; i <= steviloVrstic; i++) {			
			
			for(int j = steviloVrstic; j >= i; j--) {
				System.out.print(" ");
			}
			
			//Stevilo * prvi iteration:1  -> i se veca, vsak print ima eno zvezdico vec -> end condition 
			for(int z = 1; z < i; z++) {				
				System.out.print("*");
			}
			
		
			
			System.out.println("");
			
		}
		
		//Deblo
		
		int deblo = 3;		
		
		for(int i = 0; i < deblo-1;i++) {
			
			for (int j = 0; j < deblo; j++) {
				System.out.print(" ");//ZAMIK
			}
						
			for (int j = 0; j <= 2; j++) {

				System.out.print("*");			
			}
			System.out.println("");
		}


	}


}
