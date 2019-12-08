package hwTest;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Visina trikoitnika?");
		int rows = sc.nextInt() - 1;
				
		
		for (int i = 0; i <= rows; i++) {
			
			
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			Thread.sleep(220);
			
			System.out.println("");
			
		}
		sc.close();
		
		System.out.println("Za");
		Thread.sleep(320);
		System.out.println("Misev");
		Thread.sleep(320);
		System.out.println("BIRZDEJ ki ima "+ rows + "let!!");

	
	}

}
