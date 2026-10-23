package VjezbeVI;

import java.util.ArrayList;

public class Proizvod {

    private String opisProizvoda;
    private String barkod;
    private String zemljaProzivodnje;
    private int godinaProizvodnje;
    private double uvoznaCjena;

    public Proizvod(String opisProizvoda, String barkod, String zemljaProzivodnje,
                    int godinaProizvodnje, double cjena) {

        this.opisProizvoda = opisProizvoda;
        this.barkod = barkod;
        this.zemljaProzivodnje = zemljaProzivodnje;
        this.godinaProizvodnje = godinaProizvodnje;
        this.uvoznaCjena = cjena;
    }

    public String getOpisProizvoda() {
        return opisProizvoda;
    }

    public void setOpisProizvoda(String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getZemljaProzivodnje() {
        return zemljaProzivodnje;
    }

    public void setZemljaProzivodnje(String zemljaProzivodnje) {
        this.zemljaProzivodnje = zemljaProzivodnje;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public double getCjena() {
        return uvoznaCjena;
    }

    public void setCjena(double cjena) {
        this.uvoznaCjena = cjena;
    }
    
    public void izracunajCjenu() {
    	
    }
 
	public static void main(String[] args) {

    }
}