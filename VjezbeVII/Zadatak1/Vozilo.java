package Zadatak1;

public  abstract class Vozilo {
	private int id;
	protected int maxBrzina;
	
	
	public Vozilo(int id, int maxBrzina) {
		this.id = id;
		this.maxBrzina = maxBrzina;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMaxBrzina() {
		return maxBrzina;
	}


	public void setMaxBrzina(int maxBrzina) {
		this.maxBrzina = maxBrzina;
	}
	

	public void info() {
        System.out.println("ID vozila: " + id);
        System.out.println("Maksimalna brzina: " + maxBrzina);
    }



	public abstract double izracunajVrijemeDostave(double udaljenost);
}
	

