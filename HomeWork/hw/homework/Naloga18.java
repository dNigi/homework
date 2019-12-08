package homework;

import java.util.Scanner;public class Naloga18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesi prvo stevilo: ");
        Double prvoStevilo = Double.parseDouble(sc.nextLine());

        System.out.print("Vnesi drugo stevilo: ");
        Double drugoStevilo = Double.parseDouble(sc.nextLine());

        System.out.println("\n");

        System.out.println("1 - Sestej");
        System.out.println("2 - Odstej");
        System.out.println("3 - Zmnozi");
        System.out.println("4 - Deli");
        System.out.println("//a");
        System.out.println("////");

        System.out.println("Izberi zeleno operacijo: ");
        int ukaz = Integer.parseInt(sc.nextLine());

        double rezultat = 0.0;

        switch(ukaz) { 
            case 1:
                rezultat = prvoStevilo + drugoStevilo;
                break;   
            default:
                System.out.println("Vnesen neveljaven ukaz");
                System.exit(0);
        }

        System.out.println("Rezultat : " + rezultat);
        sc.close();
    }
}