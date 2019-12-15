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
}
