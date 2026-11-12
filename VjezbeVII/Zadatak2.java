 package VjezbeVII;

public class Zadatak2 {

	public static void main(String[] args) {
		String s = "c123s015g028t068r022p017h53b10020";
		String izl = dajPodatke(s);
		System.out.print(izl);
	}

	public static String dajPodatke(String s) {
		String izl = "";

		// Odradi temp
		int iT = s.indexOf('t');
		System.out.println(s.substring(iT + 1, iT + 4));
		float tt = Float.parseFloat(s.substring(iT + 1, iT + 4));
		float temp = ((tt - 32) * 5 / 9);
		
		
		int iH = s.indexOf('h');
		System.out.println(s.substring(iH + 1, iH + 3));
		float vlaznost = Float.parseFloat(s.substring(iH + 1, iH + 3));
		
		
		int iP = s.indexOf('p');
		System.out.println(s.substring(iP + 1, iP + 6));
		float pritisak = Float.parseFloat(s.substring(iP + 1, iP + 4))* 0.1f;

		izl = String.format("{\"temp\": %.1f, \"vlaznost\": %.1f%%, \"pritisak\": %.1f}",
		        temp, vlaznost, pritisak);

		return izl;
	}
}