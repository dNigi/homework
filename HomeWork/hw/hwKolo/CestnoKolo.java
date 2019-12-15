package hwKolo;


public class CestnoKolo extends Kolo {

	private int prestava = 1;
	private final int MAX_STEVILO_PRESTAV;
	
	public CestnoKolo(String barva, int maxHitrost, int maxPrestav) {
		super(barva, maxHitrost);
		
		this.MAX_STEVILO_PRESTAV = maxPrestav;
	}

	public void pospesi() {
		if(this.lahkoPospesi()) {
			super.hitrost += this.prestava;
		}
	}
	
	private boolean lahkoPospesi() {
		int novaHitrost = super.hitrost + this.prestava;
		
		if(novaHitrost <= super.MAX_HITROST) {
			return true;
		}
		
		return false;
	}
	
	public void prestavaGor() {		
		if(this.lahkoPrestavi()) {
			this.prestava++;
		}				
	}
	
	private boolean lahkoPrestavi() {		
		int novaPrestava = this.prestava+1;
		
		return novaPrestava <= this.MAX_STEVILO_PRESTAV;		
	}

	
	public void pospesis() {
		
		if(lahkoPospesis()) {
			this.hitrost += this.prestava;
		}
	}
	
	private boolean lahkoPospesis() {
		
		int novaHitrost = this.hitrost+1;
		
		return novaHitrost <= MAX_HITROST;
		
		
	}
	
	

	protected void izpisiVseLasnosti() {
		System.out.println("Barva kolesa: " + this.barva);
		System.out.println("Trenutna hitrost: " + this.hitrost);
		System.out.println("Maksimalna hitrost: " + this.MAX_HITROST);
		System.out.println("\tTrenutna prestava: "+ this.prestava);
		System.out.println(" \tMaksimalna prestava: " + MAX_STEVILO_PRESTAV);
	}
}
