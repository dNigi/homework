import java.util.Arrays;

public class Naloga2 {

	public static void main(String[] args) {
		
/*
Naloga 2
Program naj sprejme 5 argumentov v obliki celega števila. 
Program naj izpiše najmanjše število, največje število in 
povprečno vrednost vseh števil.
*/
		
		
		/*
		int prvoStevilo = Integer.parseInt(args[0]);
		int drugoStevilo = Integer.parseInt(args[1]);
		int tretjeStevilo = Integer.parseInt(args[2]);
		int cetrtoStevilo = Integer.parseInt(args[3]);
		int petoStevilo = Integer.parseInt(args[4]);
		*/
		int x,y,z,k,j;
		
		x = 66;
		y = 22;
		z = 80;
		k = 23;
		j = 90;
		
		
		//int[] vsaStevila = {prvoStevilo, drugoStevilo, tretjeStevilo, cetrtoStevilo, petoStevilo};
		int[] vsaStevila = {x,y,z,k,j};
		
		
		Arrays.sort(vsaStevila);	
		
		int najmanjseStevilo = vsaStevila[0];
		int najvecjeStevilo = vsaStevila.length-1;
		
		int temp = 0;
		
		for (int i : vsaStevila) {			
		temp += i;			
		}
		
		System.out.println("ZDEJ VN + "+temp);
		
		System.out.println(temp / vsaStevila.length);
		
		
		
		
		
		
		
		

	
	}

}
