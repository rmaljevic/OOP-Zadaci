package Zadatak3;

public class Zaposleni {
	
	private int id;
	private String ime;
	private String prezime;
	protected int plataPoSatu;
	protected int  ukupanBrojSati;
	protected double plata;
	
	
	public Zaposleni(int id, String ime, String prezime, int plataPoSatu, int ukupanBrojSati, double plata) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
		this.plata = plata;
	}
	
	public void plata() {
	    this.setPlata(4 * ukupanBrojSati * plataPoSatu);
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
	}



	public String getPrezime() {
		return prezime;
	}



	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}



	public int getPlataPoSatu() {
		return plataPoSatu;
	}



	public void setPlataPoSatu(int plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}



	public int getUkupanBrojSati() {
		return ukupanBrojSati;
	}



	public void setUkupanBrojSati(int ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}



	public double getPlata() {
		return plata;
	}


	public void setPlata(double plata) {
		this.plata = plata;
	}














		
	






	
	
	}


