package VjezbeVII;

import java.util.Scanner;

public class Zadatak1Kol {

	public static void main(String[] args) {
		int n;
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unosi cjeli broj N");
		n = unos.nextInt();
		
		while (n <= 0) {
			System.out.println("Unesi N Ponovo, N je <0");
			n = unos.nextInt();
			
		}
//		for(int i = 0 ; i<= n; i++) {
//			for (int j = 0 ; i<= i; j++)
//				System.out.print("*");
//			System.out.print("\n");
//		}
		String s = "*";
		for (int i = 0; i <= n; i++) {
			System.out.println(s);
			s = s + "*";
		}
		
		
		

	}

}
