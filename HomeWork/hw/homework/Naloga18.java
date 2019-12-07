package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Naloga18{
    public static void main(String[] args) throws IOException {
        BufferedReader vhod = 
                    new BufferedReader(new InputStreamReader(System.in));
      
       System.out.print("Vnesi prvo stevilo: ");
       int prvoStevilo = Integer.parseInt(vhod.readLine());
       
       System.out.println("Vnesi drugo stevilo: ");
       double drugoStevilo = Double.parseDouble(vhod.readLine());

       double rezultat = prvoStevilo + drugoStevilo;

       System.out.println("Sestevek obeh stevil je " + rezultat);
       
       
    }
    
    public static int odstevanje(int prvoStevilo, int drugoStevilo) { 
        System.out.print("Vnesi prvo stevilo: ");
        int prvoStevilo = Integer.parseInt(vhod.readLine());
        
        System.out.println("Vnesi drugo stevilo: ");
        double drugoStevilo = Double.parseDouble(vhod.readLine());
        
    	return prvoStevilo - drugoStevilo;    	
    }
    
    public static int mnozenje(int prvoStevilo, int drugoStevilo) {
    	return prvoStevilo * drugoStevilo;
    }
    
    
}
