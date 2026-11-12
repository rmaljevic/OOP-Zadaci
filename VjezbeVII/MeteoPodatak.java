
package VjezbeVII;

import java.util.ArrayList;

public class MeteoPodatak {

	private String nazivMjerneStranice;
	private String datumVrjemeOcitavanja;
	private float temperatura;
	private float vlaznostVazduha;
	private float pritisak;

	public MeteoPodatak() {
		this(null, null, 0, 0, 0);
	}

	public MeteoPodatak(String nazivStranice, String datumVrjemeOcitavanja, float temperatura, float vlaznostVazduha,
			float pritisak) {
		super();
		this.nazivMjerneStranice = nazivStranice;
		this.datumVrjemeOcitavanja = datumVrjemeOcitavanja;
		this.temperatura = temperatura;
		this.vlaznostVazduha = vlaznostVazduha;
		this.pritisak = pritisak;
	}

	public String getNazivStranice() {
		return nazivMjerneStranice;
	}

	public void setNazivStranice(String nazivStranice) {
		this.nazivMjerneStranice = nazivStranice;
	}

	public String getDatumVrjemeOcitavanja() {
		return datumVrjemeOcitavanja;
	}

	public void setDatumVrjemeOcitavanja(String datumVrjemeOcitavanja) {
		this.datumVrjemeOcitavanja = datumVrjemeOcitavanja;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getVlaznostVazduha() {
		return vlaznostVazduha;
	}

	public void setVlaznostVazduha(float vlaznostVazduha) {
		this.vlaznostVazduha = vlaznostVazduha;
	}

	public float getPritisak() {
		return pritisak;
	}

	public void setPritisak(float pritisak) {
		this.pritisak = pritisak;
	}

	@Override
	public String toString() {
		return "MeteoPodatak [nazivStranice=" + nazivMjerneStranice + ", datumVrjemeOcitavanja=" + datumVrjemeOcitavanja
				+ ", temperatura=" + temperatura + ", vlaznostVazduha=" + vlaznostVazduha + ", pritisak=" + pritisak
				+ "]";
	}
	
	
public static float
odrediMaxTempDan(ArrayList<MeteoPodatak> niz, String nazivStranice, String datum) {
	
	float maxTemp;
	ArrayList<MeteoPodatak> izdvojeno = new ArrayList<MeteoPodatak>();
	
//	public static ArrayList<MeteoPodatak> izdvojPodatkeStanic(ArrayList<MeteoPodatak> niz, String nazivStranice, String datum) {
//	ArrayList<MeteoPodatak> izdvojeno = new ArrayList<MeteoPodatak>();

		for (MeteoPodatak x : niz)
			if (x.getNazivStranice().equals(nazivStranice)
			&& x.getDatumVrjemeOcitavanja().startsWith(datum))
				izdvojeno.add(x);
		
		maxTemp = izdvojeno.get(0).getTemperatura();
		for(MeteoPodatak x: izdvojeno)
			if(x.getTemperatura() > maxTemp)
				maxTemp = x.getTemperatura();
		

		return maxTemp;
	}

public static ArrayList<MeteoPodatak> izdvojPodatkeStanic(ArrayList<MeteoPodatak> niz, String string) {
	// TODO Auto-generated method stub
	return null;
}
}
