package homework;

public class Naloga19 {

	public static void main(String[] args) {
		
		int[] tabela = new int[155];
		int[] drugaTabela = new int[17];

		tabela = napolniTabelo(tabela.length, 200);
		drugaTabela = napolniTabelo(drugaTabela.length, 10);
		
		izpisiTabelo(tabela);
		izpisiTabelo(drugaTabela);
		izpisiTabelo(tabela);
	}
	
	public static int[] napolniTabelo(int velikostTabele, int razpon) {
		int[] tab = new int[velikostTabele];
		
		for(int i = 0; i < tab.length; i ++) {
			tab[i] = (int) (Math.random() * razpon);
		}
		
		return tab;		
	}	
	public static void izpisiTabelo(int[] tab) {		
		int zadnja = tab[tab.length - 1];
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] != zadnja) {
				System.out.print(tab[i]+", ");
			}
			else {
				System.out.println(zadnja);
			}
		}
		System.out.println("");
	}

}


