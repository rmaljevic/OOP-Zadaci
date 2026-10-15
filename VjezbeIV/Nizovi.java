package VjezbeIV;

import java.util.Random;
import java.util.Scanner;

public class Nizovi {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		Random r  = new Random();
		
		System.out.println("UNesite duzinu niza:");
		int n = ulaz.nextInt();
		
		double[] niz = new double[n];
		
		for(int i = 0; i < n ; i++) {
			niz[i] = r.nextInt(10);
		}
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println(niz[i]);
		}
			
			for (int i = 0; i < n; i++) {
				if(niz[i] % 2 == 0) {
					niz[i] *= -1;
				} else {
					niz[i] = 1 / niz[i];
				}
			}
			for (int i = 0 ; i < n ; i++) {
				System.out.println(niz[i]);
			}
			
		

	}

}
