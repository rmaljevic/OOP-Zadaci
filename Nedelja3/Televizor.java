package vjezbe3Z1;

public class Televizor {
	
	//Atributi
	
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	
	//Konstruktor
	public Televizor(int brojKanala,String nazivKanala, int jacinaTona) {
		this.brojKanala = brojKanala;
		this.nazivKanala = nazivKanala;
		this.jacinaTona = jacinaTona;
			
	}
	
	//Getteri i Setteri
	public int getBrojKanala() {
		return brojKanala;
	}

	public void setBrojKanala(int brojKanala) {
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;
		} else {
			System.out.println("Greska, broj knala mora biti bar 1");
		}
		
	}

	public String getNazivKanala() {
		return nazivKanala;
	}

	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}

	public int getJacinaTona() {
		return jacinaTona;
	}
	
	//provjera jacine tona
	public void setJacinaTona(int jacinaTona) {
		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else {
			System.out.println("Greska,jacina tona mora biti u opsegu 0-10");
		}
		
	}
	
	//pojacavanje tona za 1
	public void pojacajTon() {
		if (jacinaTona < 10 ) {
			jacinaTona++;
		} else {
			System.out.println("Zvuk ne smije biti jaci od 10");
		}
	}
	
	//ispis jacine i broj kanala
	public void ispis () {
        System.out.println("Broj kanala: " + this.brojKanala + ", jacina tona: " + this.jacinaTona + ", naziv kanala:" + this.nazivKanala);
	}


	public static void main(String[] args) {
		Televizor televizor1 = new Televizor(10 , "Prvi Kanal", 5);
		System.out.println(televizor1.getBrojKanala());
		televizor1.setBrojKanala(0);
		System.out.println(televizor1.getJacinaTona());
		televizor1.pojacajTon();
		System.out.println(televizor1.getJacinaTona());
		televizor1.ispis();
		
		
	}

}
