package homework;

import java.util.Scanner;

public class Naloga16 {	

	//Program naj sešteje in izpiše vrednost posameznih vrstic tabele.
	//Program naj sešteje in izpiše vrednost posameznih stolpcev tabele.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// >>>>>>>>>>>>>SPREMENI V SCANNER NEWLINE <<<<<<<<<<<<<<<
		System.out.println("Vnesi stevilo vrstic");		
		int vnos1 = sc.nextInt();
		System.out.println("Vnesi stevilo stolpov");
		int vnos2  = sc.nextInt();		

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
				arr[i][j] = (int) (Math.random()*170+1);

			}
		}
	}

	public static void printArray(int[][] arr) {
		System.out.println("xxxxxxxxxxxxxxxxx");
		System.out.println("x Izpis Tabele  x");
		System.out.println("xxxxxxxxxxxxxxxxx");
		System.out.println("\n");
		
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

