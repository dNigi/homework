package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Naloga23 {
	

//Program naj iz prilozene datoteke prebere stevila ter jih sesteje.
//Rezultat naj se sharni v datoteko, pod zadnjim stevilom.

	public static void main(String[] args) throws IOException {	
		
		File datoteka = new File("stevilke.txt");	
		
		
		System.out.println("Beri datoteke boilerplate: ");		
		
		try {
			BufferedReader beriDatoteko = new BufferedReader( new FileReader(datoteka));
			
			String line;
			
			while(  (line = beriDatoteko.readLine()) != null ) {
				System.out.println(line);
			}
			
			beriDatoteko.close();
		} catch (IOException e) {
			System.out.println("Napaka");
		}
		
		
		
		

	
	}

}
