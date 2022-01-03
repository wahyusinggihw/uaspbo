package sistemInformasiRestoran;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputText = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
	
		mainMenu(inputText,inputNum);
	}
	
	public static void mainMenu(Scanner Text, Scanner Num) {
		int numList;
		String textList;
			System.out.println("=== Restoran ===");
			System.out.println("1. Mengelola Menu");
			System.out.println("2. List Menu");
			System.out.println("3. Data Pelanggan");
			System.out.println("4. Pendapatan");
			System.out.println("5. Pemesanan");
			System.out.print("Pilih Menu : ");
			numList = Num.nextInt();
			switch(numList)	{
				case 1 : addMenu(Text,Num);break;
				case 2 : listMakanan();break;
				default : mainMenu(Text,Num);break;
					
			}
			
	}

	public static void addMenu(Scanner Text, Scanner Num) {
		int numList;
		String textList;
			System.out.println("");
			System.out.println("=======================");
			System.out.println("== Mengelola Makanan ==");
			System.out.println("1. Tambah Makanan");
			System.out.println("2. Tambah Minuman");
			System.out.println("3. List Menu");
			System.out.print("Pilih Menu : ");
			numList = Num.nextInt();
			switch(numList)	{
				case 1 : addMenuMakanan(Text,Num);break;
				case 2 : addMenuMinuman(Text,Num);break;
				case 3 : listMakanan();break;
				default : addMenu(Text,Num);break;
			}
			
	}

	public static void addMenuMakanan(Scanner Text, Scanner Num) {
	int numList;
	int stok;
	int harga;
	String textList;
		System.out.println("===== Tambah Makanan =====");
		System.out.println("Nama Makanan : ");
			textList = Text.nextLine();
		System.out.println("Harga Makanan : ");
			harga = Num.nextInt();
		System.out.println("Stok : ");
			stok = Num.nextInt();
		Makanan makanan = new Makanan(textList,harga,stok);
		DaftarMakanan daftar = new DaftarMakanan(makanan);
		addMenu(Text,Num);
	}
	
	private static void addMenuMinuman (Scanner text, Scanner num) {
		
	}

	
	public static void listMakanan() {
		System.out.println("===== Menu =====");
		for (int i=0; i<DaftarMakanan.getI(); i++) {
			System.out.print(DaftarMakanan.getDaftarMakanan()[0][i]);
		}
	}
}