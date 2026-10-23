package VjezbeVI;

public class HemijskiProizvodi extends Proizvod {
	
	private double  temperaturaSkladistenja;
	private boolean Zapaljivo;
	
	
	public HemijskiProizvodi(String opisProizvoda, String barkod, String zemljaProzivodnje, int godinaProizvodnje,
			double cjena, double d, boolean zapaljivo) {
		super(opisProizvoda, barkod, zemljaProzivodnje, godinaProizvodnje, cjena);
		this.temperaturaSkladistenja = d;
		Zapaljivo = zapaljivo;
		
	}
	public double getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}
	public void setTemperaturaSkladistenja(float temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}
	public boolean isZapaljivo() {
		return Zapaljivo;
	}
	public void setZapaljivo(boolean zapaljivo) {
		Zapaljivo = zapaljivo;
	}
	
	public void izracunajCjenu() {
		
		if(this.Zapaljivo) {
			this.setCjena(getCjena() * 1.125);
		} else {
			this.setCjena(getCjena() * 1.1);
		}
	}
	@Override
	public String toString() {
		return "HemijskiProizvodi [temperaturaSkladistenja=" + temperaturaSkladistenja + ", Zapaljivo=" + Zapaljivo
				+ ", OpisProizvoda=" + getOpisProizvoda() + ", ZemljaProzivodnje=" + getZemljaProzivodnje()
				+ ", GodinaProizvodnje=" + getGodinaProizvodnje() + ", Cjena=" + getCjena() + "]";
	}
	
	
		

}
