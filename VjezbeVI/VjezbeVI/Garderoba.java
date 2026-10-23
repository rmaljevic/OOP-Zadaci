package VjezbeVI;

public class Garderoba extends Proizvod {

    private String materijalProzivodnje;
    private String sezona;

    public Garderoba(String opisProizvoda, String barkod, String zemljaProzivodnje,
            int godinaProizvodnje, double cjena, String materijal, String sezona) {

        super(opisProizvoda, barkod, zemljaProzivodnje, godinaProizvodnje, cjena);
        this.materijalProzivodnje = materijalProzivodnje;
        this.sezona = sezona;
    }

    public String getMaterijal() {
        return materijalProzivodnje;
    }

    public void setMaterijal(String materijalProizvodnje) {
        this.materijalProzivodnje = materijalProizvodnje;
    }

    public String getSezona() {
        return sezona;
    }

    public void setSezona(String sezona) {
        this.sezona = sezona;
    }

    public void izracunajCjenu() {
        this.setCjena(getCjena() * 1.05);
        // this.uvoznaCjena = this.getCjena() * 1.05;
        
        
        
    }

	@Override
	public String toString() {
		return "Garderoba [materijalProzivodnje=" + materijalProzivodnje + ", sezona=" + sezona
				+ ", OpisProizvoda=" + getOpisProizvoda() + ", Barkod=" + getBarkod()
				+ ", zemljaProzivodnje=" + getZemljaProzivodnje() + ", GodinaProizvodnje="
				+ getGodinaProizvodnje() + ", Cjena=" + getCjena() + ", getClass()=" + getClass() + "]";
	}
    
	
}