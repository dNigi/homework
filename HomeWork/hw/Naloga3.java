public class Naloga3 {

public static void main(String[] args) {
	
	final double PI = 3.141592653589;
	
	/*
	 * Program naj sprejme en parameter tipa double.
	 *  Podani argument predstavlja premer kroga.
	 *   Program naj izracuna in izpise obseg in ploscino kroga.
	 *    Za pi uporabi vrednost 3,141592653589.
	 */
	
	double premerKroga = 10;
	double polmerKroga = premerKroga / 2;
	
	//Obseg kroga ::>
	double obsegKroga = premerKroga * PI;
	

	
	double kvadratPolmera = Math.pow(polmerKroga, 2);
	double ploscinaKroga = kvadratPolmera * PI;
	
	System.out.println(ploscinaKroga);
	
	
	
	
	
}

}
