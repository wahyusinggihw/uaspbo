package sistemInformasiRestoran;

public class Makanan {
	private String namaMakanan;
	private int hargaMakanan;
	private static int stokMakanan;
	
	public Makanan(String namaMakanan, int hargaMakanan, int stokMakanan){
		setNamaMakanan(namaMakanan);
		setHargaMakanan(hargaMakanan);
		Makanan.setStokMakanan(stokMakanan);
	}
	
	public void setNamaMakanan(String namaMakanan) {
		this.namaMakanan = namaMakanan;
	}
	
	public String getNamaMakanan() {
		return namaMakanan;
	}
	
	public void setHargaMakanan(int hargaMakanan) {
		this.hargaMakanan = hargaMakanan;
	}
	
	public int getHargaMakanan() {
		return hargaMakanan;
	}
	
	public static void setStokMakanan(int stokMakanan) {
		Makanan.stokMakanan = stokMakanan;
	}
	
	public int getStokMakanan() {
		return stokMakanan;
	}
	
	public void mengambilMakanan() {
		setStokMakanan(getStokMakanan() -1);
	}
}
