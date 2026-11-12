package VjezbeVII;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<MeteoPodatak> niz = new ArrayList<MeteoPodatak>();
		niz.add(new MeteoPodatak("PG", "2026-10-25 00:11:11", 9 ,78 , 1002));
		niz.add(new MeteoPodatak("NK", "2026-10-25 00:11:11", 9 ,78 , 1002));
		niz.add(new MeteoPodatak("PG", "2026-10-25 14:21:41", 19 ,78 , 1002));
		niz.add(new MeteoPodatak("PG", "2026-10-25 18:41:11", 15 ,78 , 1002));
		
		ArrayList<MeteoPodatak> x = MeteoPodatak.izdvojPodatkeStanic(niz, "PG");
		for(MeteoPodatak a: x)
			System.out.println(a);
		
		
		float maxTemp = MeteoPodatak.odrediMaxTempDan(niz, "PG", "2026-10-21");
	}

}
