package homework;

public class Naloga20 {

	public static void main(String[] args) {
		
		int[] arr = { 5,0,0,0,3 };
		
		System.out.println(tabAverage(arr));

	
	}
	
	public static double tabAverage(int[] arr) {
		
		double vsaStevila = 0;
		int stevec = 0;
		
		for (int i = 0; i < arr.length; i++) {	
			if(arr[i] != 0) {
				vsaStevila += arr[i];
				stevec++;				
			}

		}
		
		return (double) vsaStevila / stevec;
		
	}

}
