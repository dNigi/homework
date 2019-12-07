package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;	
import java.io.IOException;

public class Naloga21{

	public static void main(String[] args) throws IOException{

		while(true) {

			try {
				izbirniMeni();
				break;
			}
			catch (Exception e) {
				System.out.println("Nisi vnesel stevilke");
			}	
		}
	}

	public static void izbirniMeni()  throws IOException {
		System.out.println("1- Sestej");
		System.out.println("2- Odsetj");
		System.out.println("3- Mnozi");
		System.out.println("4- Deli");
		System.out.println("5- Izhod");

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ukaz: ");
		int ukaz = Integer.parseInt(beri.readLine());
		stikalo(ukaz);

	}

	public static void stikalo(int ukaz) throws IOException {
		switch (ukaz) {
		case 1:
			sestej();
			break;
		case 2:
			odstej();
			break;
		case 3:
			mnozi();
			break;
		case 4:
			deli();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Ni Stevilo");
			break;
		}

	}//END METHOD STIKALO



	public static void sestej() throws IOException {

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Vnesi prvo stevilo");		
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.println("Vnesi drugo stevilo");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo + drugoStevilo;

		System.out.println(prvoStevilo+" + "+ drugoStevilo + " = " + rezultat);

	}


	public static void odstej() throws IOException {

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Vnesi prvo stevilo");		
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.println("Vnesi drugo stevilo");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo - drugoStevilo;

		System.out.println(prvoStevilo+" + "+ drugoStevilo + " = " + rezultat);

	}	

	public static void mnozi() throws IOException {

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Vnesi prvo stevilo");		
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.println("Vnesi drugo stevilo");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo * drugoStevilo;

		System.out.println(prvoStevilo+" + "+ drugoStevilo + " = " + rezultat);

	}

	public static void deli() throws IOException {

		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Vnesi prvo stevilo");		
		double prvoStevilo = Double.parseDouble(beri.readLine());

		System.out.println("Vnesi drugo stevilo");
		double drugoStevilo = Double.parseDouble(beri.readLine());

		double rezultat = prvoStevilo / drugoStevilo;

		System.out.println(prvoStevilo+" + "+ drugoStevilo + " = " + rezultat);

	}



}
