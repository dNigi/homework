package homework;
import java.util.Calendar;

public class Naloga4 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();		
		int currentYear = cal.get(Calendar.YEAR);
		
		int letnicaRojstva = Integer.parseInt(args[0]);		
		int starost = currentYear - letnicaRojstva;
		int manjkajocaLeta = 18 - starost;
				
		if(starost > 18)
			System.out.println("Lahko se udelezite volitev.");
		else
			System.out.println("Zal ste premladi.\nVolitev se lahko udelezite cez "+manjkajocaLeta +" let.");
		

		


	}

}
