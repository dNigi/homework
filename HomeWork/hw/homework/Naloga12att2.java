package homework;

public class Naloga12att2 {

	public static void main(String[] args) {
		
		String input = args[0];
				
		if(input.length() != 6) {
			System.out.println("Stevilo ne ustreza pogojem");
		}
		else {			
			System.out.println("Vneseno stevilo ("+ input+") razdelimo na dva dela \n"+ input.substring(0,3) +" in "+ input.substring(3,6));
			System.out.println("Rezultat je:");
			rez(input);			
			
		}	
	}
	
	public static void rez(String vnos) {
		
		int prviDel = Integer.parseInt(vnos.substring(0,3));
		int drugiDel = Integer.parseInt(vnos.substring(3,6));
		System.out.print(prviDel+drugiDel);
		
	}

}
