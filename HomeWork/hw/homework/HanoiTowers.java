package homework;

public class HanoiTowers {

	public static void main(String[] args) {
		
		char stolp1 = 'a';
		char pomozniStol = 'b';
		char zadnjiStolp = 'c';
		
		premik(stolp1,zadnjiStolp);
		
			

	}	
	
	public static void premik(char x, char y) {
		System.out.println("premik iz "+x+" na "+ y);
	}

}
