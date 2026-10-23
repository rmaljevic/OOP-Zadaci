package VjezbeVI;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestnaKlasa {
	
	public static void main (String[] args) {
		Garderoba g1 = new Garderoba("majca" , "23224444", "Crna Gora", 2026, 2.5 , "Kasmir" , "zimska"); 
		HemijskiProizvodi h1 = new HemijskiProizvodi("deterdzent", "5675675467" , "Poljska" , 2026, 9.5 , 23.4 , true); 
		Hrana b1 = new Hrana("pica", "126371234", "Njemacka", 2026, 11, 600, LocalDate.of(2026, 11, 1));
		
		ArrayList <Proizvod>lista = new ArrayList<>();
		lista.add(g1);
		lista.add(h1);
		lista.add(b1);
		
		
		for (Proizvod p : lista) {
		    System.out.println(p);
		}

		for (Proizvod p : lista) {
		    p.izracunajCjenu();
		}

		System.out.println("*****************************");

		for (Proizvod p : lista) {
		    System.out.println(p);
		}
		
		
		
		
	}
	
}
