package homework;
import java.util.Scanner;
import java.util.Arrays;

public class Naloga17 {

	public static void main(String[] args) {
		
//		V programu definiraj tabelo String[][] naključne velikosti med 1 in 5 (Math.random()).
//      Program naj uporabnika vpraša naj vnese niz za vsako celico tabele.
//		Program naj nato tabelo izpiše.
		
		Scanner sc = new Scanner(System.in);
		
		int rdm1 = (int) (Math.random()*5+1);		
		int rdm2 = (int) (Math.random()*5+1);
		String vnos = "";
		
		String[][] tabela = new String[rdm1][rdm2];
		
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela[i].length; j++) {
				
				System.out.print("vpisi stevilko: ");
				vnos = sc.nextLine();
				
				vnos += tabela[i][j];			
				
			}
			System.out.println("\nDrugiArray\n");
		}
		
		for(int i = 0; i < tabela.length; i++) {
			
			for(int j = 0; j < tabela[i].length; j++) {
				
				System.out.println(tabela[i][j]);
			}
		}
		


	}

}
