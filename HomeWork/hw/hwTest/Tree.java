package hwTest;

public class Tree {

	public static void main(String[] args) {
		
		
		int rows = 5;
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = rows; j > i; j--) {
				System.out.print(j);
			}
			
			System.out.println("x");
			
		}

	
	}

}
