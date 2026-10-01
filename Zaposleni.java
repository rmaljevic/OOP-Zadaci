package vjezbe3Z1;

public class Zaposleni {
	
	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;
	
	public Zaposleni(String ime, String prezime , int godineStaza, int plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godineStaza = godineStaza;
		this.plata = plata;
		
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

	public int getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		if (godineStaza <= 0 ) {
			this.godineStaza = godineStaza;
		} else {
			System.out.println("godine staza ne mogu biti negativne");
		}
		
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		if (plata <= 0 ) {
			this.plata = plata;
		} else {
			System.out.println("plata ne moze biti nula");
		}
		
			
	}
	public void stampa() {
		
	System.out.println("Ime" + this.ime);
	System.out.println("Prezime" + this.prezime);
	System.out.println("Godine staza" + this.godineStaza);
	System.out.println("plata" + this.plata);
	
		
	}
	
	public  void AzuriranjePlate() {
		if (plata < 800 && godineStaza > 10) {
			plata = plata + plata * 0.06;
		System.out.println("Plata zaposlenog " + ime + " " + prezime + " uvecana je za 6%");
		} else {
			System.out.println("Plata zaposlenog " + ime + " " + prezime + "nije uvecana");
		}
		
	}

	public static void main(String[] args) {

		//Kreiranje objekta ili ti tri zaposlena
			Zaposleni a = new Zaposleni("Marko", "markovic", 700 ,12); 
			Zaposleni b = new Zaposleni("Marko", "jovanovic", 750 ,9); 
			Zaposleni c = new Zaposleni("Marko", "zdravkovic", 850 ,15); 
			
			a.stampa();
			System.out.println();
			b.stampa();
			System.out.println();
			c.stampa();
			
			b.AzuriranjePlate();
			b.stampa();
			
	}

}
