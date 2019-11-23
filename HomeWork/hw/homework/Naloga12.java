package homework;

public class Naloga12 {

	public static void main(String[] args) {
		
		
		String vnos = "123456";
		
		try {
			
			int vnosInt = Integer.parseInt(vnos);
		}
		catch (Exception e) {
			System.out.println("Vnos ni stevilo");
		}
		
		
		
		if(vnos.length() == 6) {
			System.out.println("moze");
		}
		
		else {
			System.out.println("Nisi vnesel 6 stevilk");
		}
		
		
		
		
		
		
		
		

	
	}

}
