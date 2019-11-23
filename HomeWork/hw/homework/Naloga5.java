package homework;
public class Naloga5 {

	public static void main(String[] args) {

		String vneseniNiz = args[0];

		char[] nizVArray = vneseniNiz.toCharArray();		

		System.out.println("Vneseni niz: " + vneseniNiz);

		for (int i = 0; i < nizVArray.length; i = i +2) {

			System.out.print(nizVArray[i]);

		}

	}

}
