package homework;

public class Naloga20 {

	public static void main(String[] args) {

		int[] arr = new int[50];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 5000 + 1000);
		}

		System.out.println("Povprecna vrednost tabele: "+ tabAverage(arr));
		System.out.println("");

//		System.out.println(tabAverage2(arr));
		
		izpisTabele(arr);

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

	public static double tabAverage2(int[] arr) {
		double vsaStevila = 0;

		for(double data : arr) {			
			vsaStevila += data;		
		}

		return (double) vsaStevila / arr.length;
	}

	public static void izpisTabele(int[] arr) {

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] +" ");			
//		}

		for(int i : arr) {
			System.out.print(i+" ");
		}

	}
}
