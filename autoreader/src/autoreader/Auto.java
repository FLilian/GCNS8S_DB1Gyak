package autoreader;

public class Auto {
	private String marka;
	private String szin;
	private int ar;
	public Auto(String marka, String szin, int ar) {
		super();
		this.marka = marka;
		this.szin = szin;
		this.ar = ar;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getSzin() {
		return szin;
	}
	public void setSzin(String szin) {
		this.szin = szin;
	}
	public int getAr() {
		return ar;
	}
	public void setAr(int ar) {
		this.ar = ar;
	}
	
	
}
