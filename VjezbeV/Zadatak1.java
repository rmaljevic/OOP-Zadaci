package VjezbeV;

import java.util.Scanner;

public class Zadatak1 {

    public static int brojRijeci(String s) {
        String[] rijeci = s.split(" ");

        return rijeci.length;
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite Recenicu:");
        String s = ulaz.nextLine().trim();

        Zadatak1 objekat = new Zadatak1();

        System.out.println("Broj Rijeci: " + objekat.brojRijeci(s));

        ulaz.close();
    }
}
