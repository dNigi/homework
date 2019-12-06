package homework;

public class Naloga19 {

	public static void main(String[] args) {
		int[] tabela = new int[155];
		int[] drugaTabela = new int[17];
		
		/*
		for(int i = 0; i < tabela.length; i ++) {
			tabela[i] = (int) (Math.random() * 200);
		}
		for(int i = 0; i < drugaTabela.length; i ++) {
			drugaTabela[i] = (int) (Math.random() * 200);
		}
		*/
		
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
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + ", ");
		}
		System.out.println("");
	}

}


