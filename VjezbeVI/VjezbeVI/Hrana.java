package VjezbeVI;

import java.time.LocalDate;

public class Hrana extends Proizvod {

    private int kalorije;
    private LocalDate rokUpotrebe;

    public Hrana(String opisProizvoda, String barkod, String zemljaProzivodnje,
            int godinaProizvodnje, double cjena, int kalorije, LocalDate rokUpotrebe) {

        super(opisProizvoda, barkod, zemljaProzivodnje, godinaProizvodnje, cjena);
        this.setKalorije(kalorije);
        this.setRokUpotrebe(rokUpotrebe);
    }

    public int getKalorije() {
        return kalorije;
    }
    
    public void setKalorije(int kalorije) {
        if (kalorije > 0) {
            this.kalorije = kalorije;
        }
    }
    
    public LocalDate getRokUpotrebe() {
        return rokUpotrebe;
    }

    public void setRokUpotrebe(LocalDate rokUpotrebe) {
        this.rokUpotrebe = rokUpotrebe;
    }

    public void maloprodajnaCjena() {
        if (this.rokUpotrebe.isBefore(LocalDate.now().plusMonths(6))) {
            this.setCjena(getCjena() * 1.05);
        } else {
            this.setCjena(getCjena() * 1.1);
        }
    }

	@Override
	public String toString() {
		return "Hrana [kalorije=" + kalorije + ", rokUpotrebe=" + rokUpotrebe + ", Barkod=" + getBarkod()
				+ ", ZemljaProzivodnje=" + getZemljaProzivodnje() + ", GodinaProizvodnje="
				+ getGodinaProizvodnje() + ", Cjena=" + getCjena() + "]";
	}
    
    
}