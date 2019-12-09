package homework;

public class Naloga16 {	

	//Program naj sešteje in izpiše vrednost posameznih vrstic tabele.
	//Program naj sešteje in izpiše vrednost posameznih stolpcev tabele.

	public static void main(String[] args) {

		// >>>>>>>>>>>>>SPREMENI V SCANNER NEWLINE <<<<<<<<<<<<<<<
		int vnos1 = 3;
		int vnos2  = 3;		

		int[][] arr = new int[vnos1][vnos2];

		fillArray(arr);
		printArray(arr);
		System.out.println();
		sestejVrste(arr);
		System.out.println();
		sestejStolpe(arr);


	}

	public static void fillArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// >>>>>>>>>>>>>SPREMENI 2+1 V  170+1 <<<<<<<<<<<<<<<
				arr[i][j] = (int) (Math.random()*2+1);

			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

	public static int sumArray(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.print("Sestevek vseh stevil: ");
		return sum;
	}

	public static void sestejVrste(int[][] arr) {	

		for (int i = 0; i < arr.length; i++) {

			//RESET SUM NA 0 PO VSAKI ITERACIJI, CE NE SUM+= sesteva dalje!
			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {
				//ZA VRSTICE DAS   ARRAY [i]  [j]  -> za Stolpe obratno! ([j]  [i])
				sum += arr[i][j];				
			}
			System.out.println("Vrsta "+ i + ": "+sum+" ");
		}

	}
	
	public static void sestejStolpe(int[][]arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			//RESET
			int sum = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				//ZA STOLPE DAS   ARRAY [j]  [i]  -> za Stolpe obratno! ([i]  [j)
				
				sum+= arr[j][i];				
			}			
			System.out.println("Stolp "+ i + ": "+sum+" ");
		}
		
	}
	
	
}

