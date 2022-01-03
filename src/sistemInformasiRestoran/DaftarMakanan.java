package sistemInformasiRestoran;

public class DaftarMakanan {
	private static String [][] makanan = new String [3][100];
	private static int i = 0;
	public DaftarMakanan(Makanan makanan){
		
		DaftarMakanan.makanan[0][i] = makanan.getNamaMakanan();
		DaftarMakanan.makanan[1][i] = String.valueOf(makanan.getHargaMakanan());
		DaftarMakanan.makanan[2][i] = String.valueOf(makanan.getStokMakanan());
		i++;
	}
	
	public static String[][] getDaftarMakanan(){
		return makanan;
	}
	
	public static int getI() {
		return i;
	}
}
