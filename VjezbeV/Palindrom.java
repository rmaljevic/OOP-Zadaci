package VjezbeV;

import java.util.Scanner;

public class Palindrom {
	
	public boolean jePalindrom(String s) {
		s = s.replace(" ", "");
		s = s.toLowerCase();
		
		String obrnuta = new StringBuilder(s).reverse().toString();
		
		
		if(obrnuta.equals(s)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite Rijec:");
		String rijec = ulaz.nextLine().trim();
		
		
		
	}

}
