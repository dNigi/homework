package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kalkulator2 {

	public static void main(String[] args) throws IOException {
		izbirniMeni();
	}

	private static void izbirniMeni() throws IOException {
		System.out.println("1 - Sestej");
		System.out.println("2 - Odstej");
		System.out.println("3 - Mnozi");
		System.out.println("4 - Deli");
		System.out.println("5 - Izhod");
		
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ukaz: ");
		int ukaz = Integer.parseInt(beri.readLine());
		stikalo(ukaz);
		
	}

	private static void stikalo(int ukaz) throws IOException {
		switch(ukaz) {
		case 1:
			sestej();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Neveljaven ukaz!");
		}
		
		izbirniMeni();
	}
	
	public static void sestej() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Vnesi prvo stevilo: ");
		double prvoStevilo = Double.parseDouble(beri.readLine());
		
		System.out.print("Vnesi drugo stevilo: ");
		double drugoStevilo = Double.parseDouble(beri.readLine());
		
		double rezultat = prvoStevilo + drugoStevilo;
		
		System.out.println(prvoStevilo + " + " + drugoStevilo + " = " + rezultat);
	}

}
