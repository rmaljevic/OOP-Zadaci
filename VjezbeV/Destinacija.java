package VjezbeV;

import java.util.ArrayList;

public class Destinacija {
		
		private String naziv;
		private String drzava;
		private  int ocjena;
		private double udaljenostKm;
		private int brojPosjeta;
		
		public Destinacija(String naziv, String drzava, int ocjena, double udaljenostKm, int brojPosjeta) {
			this.naziv = naziv;
			this.drzava = drzava;
			this.ocjena = ocjena;
			this.udaljenostKm = udaljenostKm;
			this.brojPosjeta = brojPosjeta;
			
		}
		
		public Destinacija() {
			this.naziv = "default";
			this.drzava = "default";
			this.ocjena = 5;
			this.udaljenostKm = 1000;
			this.brojPosjeta = 2500;
			
		}

		public String getNaziv() {
			return naziv;
		}

		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}

		public String getDrzava() {
			return drzava;
		}

		public void setDrzava(String drzava) {
			this.drzava = drzava;
		}

		public int getOcjena() {
			return ocjena;
		}

		public void setOcjena(int ocjena) {
			if ( ocjena >= 0 && ocjena <= 10) {
				this.ocjena = ocjena;
			}
		
		}

		public double getUdaljenostKm() {
			return udaljenostKm;
		}

		public void setUdaljenostKm(double udaljenostKm) {
			this.udaljenostKm = udaljenostKm;
		}

		public int getBrojPosjeta() {
			return brojPosjeta;
		}

		public void setBrojPosjeta(int brojPosjeta) {
			this.brojPosjeta = brojPosjeta;
		}
		
		
	public static void main(String[] args) {
		
		ArrayList<Destinacija> destinacije = new ArrayList <Destinacija>();
		Destinacija d1 = new Destinacija("Malaga", "Spanija", 10, 2500,3000000);
		Destinacija d2 = new Destinacija("Venezia", "Italija", 9, 1200,1000000);
		Destinacija d3 = new Destinacija();
		d3.setBrojPosjeta(100000);
		destinacije.add(d1);
		destinacije.add(d2);
		destinacije.add(d3);

	}

}
