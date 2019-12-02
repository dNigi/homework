package homework;


import java.util.Arrays;
public class Naloga16 {

	public static void main(String[] args) throws InterruptedException {

		//Program naj sešteje in izpiše vrednost posameznih vrstic tabele.
		//Program naj sešteje in izpiše vrednost posameznih stolpcev tabele.

		int steviloVrstic = 3;
		int steviloStoplov = 3;
		int vrednostVsehStevil = 0;

		int vrednostVrstic = 0;
		int vrednostStoplov = 0;


		int[][] userTable = new int[steviloVrstic][steviloStoplov];

		//<H:  Napolni in izpisi tabelo  :H>\\		
		for(int i = 0; i < userTable.length; i++) {

			for(int j = 0; j < userTable[i].length; j++) {

				userTable[i][j] = (int) (Math.random()*1+1);
				vrednostVsehStevil += userTable[i][j];
				System.out.print(userTable[i][j]+"\t");						
			}			
			System.out.println(" ");
		}		

		System.out.print("Vrednost vseh stevil: " + vrednostVsehStevil);		

		//		String vrednost = Integer.toString(vrednostVsehStevil);//		
		//		char[] charVrednost = vrednost.toCharArray();
		//		for (char c : charVrednost) {
		//			System.out.print(c);
		//		}		 
		System.out.println("\n\n");
		
		int[] tempRows = new int[userTable.length];
		
		for(int i = 0; i < userTable.length; i++) {
			
			for(int j = 0; j < userTable[i].length; j++) {
				
				tempRows[i] = userTable[j][i];
			}
			
			
		}
		System.out.println(Arrays.toString(tempRows));
		
		


		

		


		


	}

}
