package Zadatak1;

public class Bicikl extends Vozilo implements Ekonomican {

	public Bicikl(int id, int maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double potrosnjaPoKM() {
		return 0;
	}
	
	@Override
	public double izracunajVrijemeDostave(double udaljenost) {
		return udaljenost / getMaxBrzina();
	}
	
	
	
	

}
