package homework;

public class Naloga9 {

	public static void main(String[] args)  {

		//int steviloVrstic = Integer.parseInt(args[0]);
		int steviloVrstic = 10;

		if(steviloVrstic > 3 &&  steviloVrstic < 15) {

			for(int i = steviloVrstic; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				
				System.out.println("");

			}
			
			
			for(int z = 0; z < steviloVrstic; z ++) {
				for(int g = 0; g < z; g++) {
					System.out.print("*");
				}
				System.out.println("");
					
			}
			

		}

	}

}
