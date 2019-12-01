package homework;

public class Naloga16 {

	public static void main(String[] args) {
		
//Program naj sešteje in izpiše vrednost posameznih vrstic tabele.
//Program naj sešteje in izpiše vrednost posameznih stolpcev tabele.
		
		
		int vnos1 = 3;
		int vnos2 = 3;
		
		int[][] userTable = new int[vnos1][vnos2];
		
		
		//::> NAPOLNI TABLELO / IZPISI TABELO
		for (int i = 0; i < userTable.length; i++) {
			
			for(int j = 0; j < userTable[i].length; j++) {
				
				userTable[i][j] = (int) (Math.random()*3+1);
				
				System.out.print(userTable[i][j] + " ");
			}
				System.out.println("");
		}
		
		System.out.println("Prva vrsta:\n");
		
		for(int i = 0; i < userTable.length;i++) {
			System.out.println(userTable[i][0]);
		}
		
		
		System.out.println("Prvi column:\n");
		
		for(int i = 0; i < userTable.length;i++) {
			System.out.println(userTable[0][i]);
		}

	
	}

}
