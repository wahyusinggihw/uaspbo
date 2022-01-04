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
//		String textList;
			System.out.println("=== Restoran|Main Menu ===");
			System.out.println("1. Mengelola Menu");
			System.out.println("2. List Makanan");
			System.out.println("3. List Minuman");
			System.out.println("4. Data Pelanggan");
			System.out.println("5. Pendapatan");
			System.out.println("6. Pemesanan");
			System.out.print("Pilih Menu : ");
			numList = Num.nextInt();
			switch(numList)	{
				case 1 : addMenu(Text,Num);break;
				case 2 : readMakanan(Text,Num);break;
				case 3 : readMinuman(Text,Num);break;
//				case 4 : 
//				case 5 : 
//				case 6 :
				default : mainMenu(Text,Num);break;
					
			}
			
	}

	public static void addMenu(Scanner Text, Scanner Num) {
		int numList;
//		String textList;
			System.out.println("");
			System.out.println("=======================");
			System.out.println("== Restoran|Mengelola Menu ==");
			System.out.println("1. Add Makanan");
			System.out.println("2. Add Minuman");
			System.out.println("3. List Makanan");
			System.out.println("4. List Minuman");
			System.out.print("Pilih Menu : ");
			numList = Num.nextInt();
			switch(numList)	{
				case 1 : createMakanan(Text,Num);break;
				case 2 : createMinuman(Text,Num);break;
				case 3 : readMakanan(Text,Num);break;
				case 4 : readMinuman(Text,Num);break;
				default : addMenu(Text,Num);break;
			}
			
	}

	public static void createMakanan(Scanner Text, Scanner Num) {
//	int numList;
	int stok;
	int harga;
	String textList;
		System.out.println("===== Restoran|Tambah Makanan =====");
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
	
	private static void createMinuman (Scanner text, Scanner num) {
//	int numList;
	int stok;
	int harga;
	String textList;
		System.out.println("===== Restoran|Tambah Minuman =====");
		System.out.println("Nama Minuman : ");
			textList = text.nextLine();
		System.out.println("Harga Minuman : ");
			harga = num.nextInt();
		System.out.println("Stok : ");
			stok = num.nextInt();
		Minuman minuman = new Minuman(textList,harga,stok);
		DaftarMinuman daftar = new DaftarMinuman(minuman);
		addMenu(text,num);	
	}

	public static void readMakanan(Scanner text, Scanner num) {
		int numList = 0;
		
		System.out.println("===== Menu =====");
		System.out.println("==Makanan=======Harga==Stok==");
		for (int i=0; i<DaftarMakanan.getI(); i++) {
			System.out.println("==" + DaftarMakanan.getDaftarMakanan()[0][i] + "\t\t" + DaftarMakanan.getDaftarMakanan()[1][i] + "\t" + DaftarMakanan.getDaftarMakanan()[2][i] + " ==");
		}
		if(DaftarMakanan.getI()==0) {
			System.out.println("\t Makanan Kosong");
		}
		System.out.println("==============================");
		System.out.println("1. Main Menu");
		System.out.println("2. Mengelola Menu");
		System.out.println("Pilih Menu :");
		numList = num.nextInt();
		
		switch(numList)	{
		case 1 : mainMenu(text,num);break;
		case 2 : addMenu(text,num);break;
//		default : mainMenu(text,num);break;
		}
	}
	
	public static void readMinuman(Scanner text, Scanner num) {
		int numList = 0;
		System.out.println("==Minuman=======Harga==Stok==");
		for (int i=0; i<DaftarMinuman.getI(); i++) {
			System.out.println("==" + DaftarMinuman.getDaftarMinuman()[0][i] + "\t\t" + DaftarMinuman.getDaftarMinuman()[1][i] + "\t" + DaftarMinuman.getDaftarMinuman()[2][i] + " ==");
		}
		if(DaftarMinuman.getI()==0) {
			System.out.println("\t Minuman Kosong");
		}
		System.out.println("==============================");
		System.out.println("1. Main Menu");
		System.out.println("2. Mengelola Menu");
		System.out.println("Pilih Menu :");
		numList = num.nextInt();
		
		switch(numList)	{
		case 1 : mainMenu(text,num);break;
		case 2 : addMenu(text,num);break;
//		default : mainMenu(text,num);break;
		}
	}
	
	
}