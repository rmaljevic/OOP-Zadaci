package Zadatak3;

import java.util.ArrayList;

public class Restoran {

	private String naziv;
	private String adresa;
	private String pib;
	private ArrayList<Zaposleni> zaposelni = new ArrayList<>();

	public Restoran(String naziv, String adresa, String pib) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
	}

	public Restoran(String naziv, String adresa, String pib, ArrayList<Zaposleni> zaposelni) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
		this.zaposelni = zaposelni;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public ArrayList<Zaposleni> getZaposelni() {
		return zaposelni;
	}

	public void setZaposelni(ArrayList<Zaposleni> zaposelni) {
		this.zaposelni = zaposelni;
	}

	public void dodajZaposlenog(Zaposleni z) {
		this.zaposelni.add(z);
	}

	public Zaposleni pronadji(int id) {
		for (Zaposleni z : this.zaposelni) {
			if (z.getId() == id) {
				return z;
			}
		}
		return null;
	}




	public static void main(String[] args) {
		

}
	
}
