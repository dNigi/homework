package hwTest;

public class Naloga19 {

	public static void main(String[] args) {

		int[] tabela = new int[5];
		int[] drugaTabela = new int[5];

		tabela = napolniTabelo(tabela.length, 22);
		drugaTabela = napolniTabelo(drugaTabela.length, 32);

		izpisiTabelo(tabela);
		System.out.println("");
		izpisiTabelo(drugaTabela);

	}

	public static int[] napolniTabelo(int velikostTabele, int razpon) {
		int[] tab = new int[velikostTabele];

		for(int i = 0; i < tab.length; i ++) {
			tab[i] = (int) (Math.random() * razpon+1);
		}

		return tab;		
	}	
	public static void izpisiTabelo(int[] tab) {

		//Counter steje stevilo integerjev znotraj arraya, tab.length-1 dobi dolzino
		//(counter = 4, int.length-1 = 4  ---> ne izpisi vejice
		int counter = 0;	
		for (int i = 0; i < tab.length; i++) {

			counter++;
			if(counter <= tab.length-1) {
				System.out.print(tab[i] + ", ");				
			}
			else {
				System.out.println(tab[i]);
			}
		}

		//Preverjanje z obicnim forom:
		System.out.println("\tdebug for:");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+" ");			
		}
		System.out.println();


	}

}


