package sistemInformasiRestoran;

public class Minuman {
	private String namaMinuman;
	private int hargaMinuman;
	private static int stokMinuman;
	
	public Minuman(String namaMinuman, int hargaMinuman, int stokMinuman){
		setNamaMinuman(namaMinuman);
		setHargaMinuman(hargaMinuman);
		Minuman.setStokMinuman(stokMinuman);
	}
	
	public void setNamaMinuman(String namaMinuman) {
		this.namaMinuman = namaMinuman;
	}
	
	public String getNamaMinuman() {
		return namaMinuman;
	}
	
	public void setHargaMinuman(int hargaMinuman) {
		this.hargaMinuman = hargaMinuman;
	}
	
	public int getHargaMinuman() {
		return hargaMinuman;
	}
	
	public static void setStokMinuman(int stokMinuman) {
		Minuman.stokMinuman = stokMinuman;
	}
	
	public int getStokMinuman() {
		return stokMinuman;
	}
}
