package Zadatak3;

public class Menadzer extends Zaposleni{
	private double osnovica;
	private double bonus;
	
	public Menadzer(int id, String ime, String prezime, int plataPoSatu, int ukupanBrojSati, double plata,
			double osnovica, double bonus) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati, plata);
		this.osnovica = osnovica;
		this.bonus = bonus;
	}

	public double getOsnovica() {
		return osnovica;
	}

	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void izracunajPlatu () {
		this.setPlata(this.getOsnovica()+ 4 * this.getUkupanBrojSati()*this.getPlataPoSatu() * this.getPlata());
	}
	
	
	
	

}
