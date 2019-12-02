package homework;

public class Naloga9 {

	public static void main(String[] args)  {

		int steviloVrstic = (int) (Math.random()*15+3);

		for(int i = steviloVrstic; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("");

		}


		for(int i = 0; i < steviloVrstic; i ++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}	

	}

}
