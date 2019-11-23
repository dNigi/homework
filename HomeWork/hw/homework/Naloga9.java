package homework;

public class Naloga9 {

	public static void main(String[] args)  {

		int steviloVrstic = Integer.parseInt(args[0]);

		if(steviloVrstic > 3 &&  steviloVrstic < 15) {

			for(int i = steviloVrstic; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				
				System.out.println("");

			}

		}

	}

}
