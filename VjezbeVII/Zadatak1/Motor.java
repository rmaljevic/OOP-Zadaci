package Zadatak1;

public class Motor extends Vozilo implements Ekonomican{

	public Motor(int id, int maxBrzina) {
		super(id, maxBrzina);
	}
	
	 @Override
	    public double izracunajVrijemeDostave(double udaljenost) {
	        return udaljenost / maxBrzina;
	    }

	  @Override
	    public double potrosnjaPoKM() {
	        return 0.05;
	    }
	}
	


