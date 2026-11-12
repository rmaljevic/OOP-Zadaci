package VjezbeVIII;

import java.util.Scanner;

public class Zadtak1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Unesite broj n:");
		int n = sc.nextInt();
		String rez = "" ;
		
		while( n > 0) {
			rez = ( n % 2) + rez;
			n = n/2;
		}
		System.out.println("Binarni:" + rez);

	}

}
