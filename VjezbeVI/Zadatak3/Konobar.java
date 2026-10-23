package Zadatak3;

public class Konobar extends Zaposleni{
	
	private int prekovremeniSati;
	
	public int getPrekovremeniSati() {
		return prekovremeniSati;
	}

	public void setPrekovremeniSati(int prekovremeniSati) {
		this.prekovremeniSati = prekovremeniSati;
	}


	public Konobar(int id, String ime, String prezime, int plataPoSatu, int ukupanBrojSati, double plata,
			int prekovremeniSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati, plata);
		this.prekovremeniSati = prekovremeniSati;
	}
	
	public void plata() {
	    this.setPlata((getPlataPoSatu() * getUkupanBrojSati()
	            + getPlataPoSatu() * 1.20 * getPrekovremeniSati()) * 4);
	}



	


}
