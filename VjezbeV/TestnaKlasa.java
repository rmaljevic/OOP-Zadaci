package VjezbeV;

import java.util.ArrayList;

public class TestnaKlasa {
	
	public static ArrayList<Destinacija> filtriraj(ArrayList<Destinacija> destinacije) {
		
		ArrayList<Destinacija> rezultat = new ArrayList<Destinacija>();
		
		
		for(Destinacija a: destinacije) {
			 if (a.getOcjena() > 8 && a.getUdaljenostKm() < 1000) {
		            rezultat.add(a);
			 }
	}
		return rezultat;
		
	}
	
	public static Destinacija najvecaPosjeta(ArrayList<Destinacija> destinacije) {

	    Destinacija najveca = destinacije.get(0);

	    for (int i=1 ; i<destinacije.size(); i++) {
	        if (destinacije.get(i).getBrojPosjeta()>najveca.getBrojPosjeta()) {
	            najveca = destinacije.get(i);
	        }
	    }

	    return najveca;
	}
	
	public static ArrayList<Destinacija> sortiranje(ArrayList<Destinacija> destinacije) {
		destinacije.sort((d1 ,d2) -> Integer.compare(d2.getOcjena(), d1.getOcjena()));
		
		
		 return destinacije;
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
		d3.setOcjena(9);
		d3.setUdaljenostKm(500);
		
		ArrayList<Destinacija> rez = new ArrayList<Destinacija>();
		
		rez = filtriraj(destinacije);
		
		for (Destinacija a : rez) {
			System.out.println(a.getNaziv());
			
		}
		System.out.println(najvecaPosjeta(destinacije).getNaziv());
		
		
		destinacije = sortiranje(destinacije);
		
		


	}

}


