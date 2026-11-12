package VjezbeVIII;

public class Zadatak2 {
	
	
	public static String konvertujDatum (String d) {
		
		String[] p= d.split("/");
		return p[1] + "-" + p[0] + "-" + p[2];
	}

	public static void main(String[] args) {
		String d = "11/03/2023";
		System.out.println(konvertujDatum(d));
		
		
	
		
		
	}

}
