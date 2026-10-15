package VjezbeIV;

public class AnalizaNiza {
	
	
	private int[] niz;
	
	
	public AnalizaNiza(int[] niz) {
		this.niz = niz;
	}
	
	public double parniPozitivniProsjek() {
		
		
		int suma = 0;
		int broj = 0;
	 
	for (int i = 0 ; i < this.niz.length ; i++) {
		if (this.niz[i] > 0 && this.niz[i] % 2 == 0) {
			suma = suma + niz[i];
			broj++;
		}
		
	}
	if(broj == 0) {
		return 0 ;
	}
	return suma / broj;
	
				
	
	}

	
	public static void main(String[] args) {
		int duzinaNiza =  10;
		int noviNiz[] = new int[duzinaNiza];
		for (int i = 0 ; i < duzinaNiza; i++) {
			noviNiz[i] = 0;
			
		}
		
		AnalizaNiza niz2 = new AnalizaNiza(noviNiz);
		
		double rez =  niz2.parniPozitivniProsjek();
		System.out.println(rez);

	}

}
