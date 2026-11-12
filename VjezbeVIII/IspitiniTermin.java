package VjezbeVIII;

import java.util.ArrayList;

public class IspitiniTermin {
	
	private String nazivPredemta;
	private String sifraTermina;
	private String datumVrijemeTermina;
	private String oznakaSale;
	private int brojPrijavljenihStudenata;
	
	
	public IspitiniTermin() {
		
	}
	
	public IspitiniTermin(String nazivPredemta, String sifraTermina, String datumVrijemeTermina, String oznakaSale,
			int brojPrijavljenihStudenata) {
		this.nazivPredemta = nazivPredemta;
		this.sifraTermina = sifraTermina;
		this.datumVrijemeTermina = datumVrijemeTermina;
		this.oznakaSale = oznakaSale;
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
	}



	public String getNazivPredemta() {
		return nazivPredemta;
	}
	public void setNazivPredemta(String nazivPredemta) {
		this.nazivPredemta = nazivPredemta;
	}
	public String getSifraTermina() {
		return sifraTermina;
	}
	public void setSifraTermina(String sifraTermina) {
		this.sifraTermina = sifraTermina;
	}
	public String getDatumVrijemeTermina() {
		return datumVrijemeTermina;
	}
	public void setDatumVrijemeTermina(String datumVrijemeTermina) {
		this.datumVrijemeTermina = datumVrijemeTermina;
	}
	public String getOznakaSale() {
		return oznakaSale;
	}
	public void setOznakaSale(String oznakaSale) {
		this.oznakaSale = oznakaSale;
	}
	public int getBrojPrijavljenihStudenata() {
		return brojPrijavljenihStudenata;
	}
	public void setBrojPrijavljenihStudenata(int brojPrijavljenihStudenata) {
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
	}

	@Override
	public String toString() {
		return "IspitiniTermin [nazivPredemta=" + nazivPredemta + ", sifraTermina=" + sifraTermina
				+ ", datumVrijemeTermina=" + datumVrijemeTermina + ", oznakaSale=" + oznakaSale
				+ ", brojPrijavljenihStudenata=" + brojPrijavljenihStudenata + "]";
	}
	
	public static String pronadjiSalu(ArrayList<IspitiniTermin> niz, String sifra) {

	    for (IspitiniTermin x : niz) {

	        if (x.getSifraTermina().equals(sifra)) {
	            return x.getOznakaSale();
	        }
	    }

	    return null;
	}
	
	public static int ukupanBrojStudenata(ArrayList<IspitiniTermin> niz, String nazivPredmeta) {
	    int suma = 0;
	    for (IspitiniTermin x : niz) {

	        if (x.getNazivPredemta().equals(nazivPredmeta)) {
	            suma += x.getBrojPrijavljenihStudenata();
	        }
	    }

	    return suma;
	}
	
	
	
	
	
	
	

}
