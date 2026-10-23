package Zadatak3;

public class Kuvar extends Zaposleni{
	public int iznos;
	private int setplata;

	public Kuvar(int id, String ime, String prezime, int plataPoSatu, int ukupanBrojSati, double plata, int iznos) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati, plata);
		this.iznos = iznos;
	}

	public int getIznos() {
		return iznos;
	}

	public void setIznos(int iznos) {
		this.iznos = iznos;
	}
	
	public void izracunajPlatu() {
		this.setplata = (iznos + 4 * getUkupanBrojSati() * getPlataPoSatu());
	}


	

}
