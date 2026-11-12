package Zadatak1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vozilo> vozila = new ArrayList<Vozilo>();

		vozila.add(new Bicikl(1, 10));
		vozila.add(new Bicikl(2, 10));

		vozila.add(new Motor(3, 15));
		vozila.add(new Motor(4, 15));

		vozila.add(new Automobil(5, 20));
		vozila.add(new Automobil(6, 20));
		double udaljenost = 10.0;
		
		for (Vozilo x : vozila) {
			udaljenost = 10.0;
			udaljenost += new Random().nextDouble();
					x.info();

		    System.out.println("Vrijeme dostave: "
		            + x.izracunajVrijemeDostave(udaljenost));
		    if (x instanceof Ekonomican) {
		    	Ekonomican e = (Ekonomican)x;
		    	System.out.println("Vozilo je ekonomicno, a potrosnja je:" +e.potrosnjaPoKM());
		    } else {
		    	System.out.print("Vozilo je automobil");
		    }
		}
		


	}

}
