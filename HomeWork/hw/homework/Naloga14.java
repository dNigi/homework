package homework;

public class Naloga14 {

	public static void main(String[] args) {
		
/*
Program naj izpise tabelo
Program naj izpise vsa stevila v tabeli, ki so deljiva s 7
Program naj sesteje vsa stevila v tabeli in izpse rezultat

 */
		
		
		
		int[][] twoDimensional = new int[14][9];
		
		
		for (int i = 0; i < twoDimensional.length; i++) {
			for (int j = 0; j < twoDimensional[i].length; j++) {
				
				twoDimensional[i][j] = (int) (Math.random()*70+1);
				
				//Izpis Tabele ::>
				//System.out.print("  "+twoDimensional[i][j]+" ");			
				//Izpis tabele / 7 ::>
				
				if(twoDimensional[i][j] % 7 == 0){
					System.out.println(twoDimensional[i][j] +" je deljivo s 7");
				}

			}
			
			
		}

	
	}

}
