package sistemInformasiRestoran;

public class DaftarMinuman {
	private static String [][] minuman = new String [3][100];
	private static int i = 0;
	public DaftarMinuman(Minuman minuman){
		
		DaftarMinuman.minuman[0][i] = minuman.getNamaMinuman();
		DaftarMinuman.minuman[1][i] = String.valueOf(minuman.getHargaMinuman());
		DaftarMinuman.minuman[2][i] = String.valueOf(minuman.getStokMinuman());
		i++;
	}
	
	public static String[][] getDaftarMinuman(){
		return minuman;
	}
	
	public static int getI() {
		return i;
	}
}
