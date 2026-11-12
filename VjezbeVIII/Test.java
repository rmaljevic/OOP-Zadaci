package VjezbeVIII;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		 ArrayList<IspitiniTermin> niz = new ArrayList<IspitiniTermin>();
		 
		 niz.add(new IspitiniTermin("Objektivno programiranje", "OP101","11.5.2026 10:00", "A4", 80));
	   
		 niz.add(new IspitiniTermin("Baza Podataka", "BZ101", "11.5.2025 9:00" , "AS" , 50 ));
		 
		 niz.add(new IspitiniTermin("Objektivno programiranje", "OP202","11.5.2026 10:00", "A2", 80));
		 
		 niz.add(new IspitiniTermin("GIS", "GS201","12.5.2026 10:00", "AP", 80));
		 
		 String sala = IspitiniTermin.pronadjiSalu(niz, "OP202");
		 System.out.println("sala:" + sala);
		 
		 int  broj = IspitiniTermin.ukupanBrojStudenata(niz, "OOP");
		 System.out.println( broj);
		 
		 

	}

}
