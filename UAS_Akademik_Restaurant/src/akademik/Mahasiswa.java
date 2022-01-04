package akademik;

import java.util.Scanner;

public class Mahasiswa {
	private String nama;
	private int nim; 
	private float ipk;
	private static float jumlah_ipk;
	private static int jumlah_mahasiswa = 0;
	private static String[][] mahasiswa = new String[3][100];

	public Mahasiswa(String nama, int nim , float ipk) {
		
		this.setNama(nama);
		this.setNim(nim);
		this.setIpk(ipk);
		
		mahasiswa[0][jumlah_mahasiswa] = nama;
		mahasiswa[1][jumlah_mahasiswa] = String.valueOf(nim);
		mahasiswa[2][jumlah_mahasiswa] = String.valueOf(ipk);
		
		jumlah_ipk+=ipk;
		jumlah_mahasiswa+=1;
		
	}

	public static float getRataipk() {
		
		float hasil;
		float CountMahasiswa= Float.valueOf(jumlah_mahasiswa);
		if(jumlah_mahasiswa != 0) {
		hasil=jumlah_ipk/CountMahasiswa;
		
		}else
		{
			return 0;
		}
		
		return hasil;
		
	}
	
	public static void printAllMahasiswa() {
		
		// tabel ini!!!
		System.out.println("=================================================================================");	
		System.out.print("|\tNo.\t|");	
		System.out.print("\tNama Mahasiswa\t");	
		System.out.print("|\t    NIM\t\t|");	
		System.out.println("\tIPK\t|");
		System.out.println("================================================================================="); 	
		for(int i=0; i < jumlah_mahasiswa; i++) {	
		System.out.print("|\t"+(i+1)+"\t|" ); 
		System.out.print("\t"+mahasiswa[0][i]+"\t|");
		System.out.print("\t"+mahasiswa[1][i]+"\t|");
		System.out.println("\t"+mahasiswa[2][i]+"\t|");
		System.out.println("================================================================================="); 	
		}
		if(jumlah_mahasiswa != 0) {
		 	
		System.out.println("|\t\t\t\tRata-rata IPK : "+(getRataipk())+"\t\t\t\t|"); 	
		System.out.println("================================================================================="); 	
		}
		
		// case menu!!!
		int pilih;
		Scanner input = new Scanner(System.in); 
		System.out.println("+===============================+");
		System.out.println("|\tMenu Pada Sistem\t|");
		System.out.println("+===============================+");
		System.out.println("|\t1. Insert Data\t\t|");
		System.out.println("+===============================+");
		System.out.println("|\t2. Update Data\t\t|");
		System.out.println("+===============================+");
		System.out.println("|\t3. Remove Data\t\t|");
		System.out.println("+===============================+");
		System.out.println("|\t0. Exit\t\t\t|");
		System.out.print("+===============================+\n\n");
		System.out.print("Pilih Menu : ");
		pilih = input.nextInt();
		switch(pilih) {
			case 1 : tambah();break;
			case 2 : update();break;
			case 3 : remove();break;
			case 0 : System.exit(0);break; 
		
			}
	}
	
	public static void tambah() {
		Scanner scanner = new Scanner(System.in); 
		Scanner scanner2 = new Scanner(System.in); 
		Scanner scanner3 = new Scanner(System.in);		
		String nama;
		int nim; 
		float ipk;
		int banyakData;
		System.out.print("Masukan Jumlah Data : ");
		banyakData = scanner.nextInt();
		for(int i=0; i < banyakData; i++) {
			// menginputkan tipe data string yaitu untuk nama
			System.out.print("Masukan Nama : ");
			nama = scanner2.nextLine();
			
			// menginputkan tipe data int yaitu nim 
			System.out.print("Masukan NIM : ");
			nim = scanner.nextInt();
			
			//menginputkan tipe data int yaitu ipk  
			System.out.print("Masukan data IPK : ");
			ipk = scanner3.nextFloat();
			
			// instansiasi object
			Mahasiswa mahasiswa = new Mahasiswa(nama, nim, ipk);
		}
		
		// read data
		getRataipk();
		printAllMahasiswa();
	}

	
	// Function Update
	public static void update() {
		Scanner update = new Scanner(System.in);
		// ubah menjadi string karena menggunakan array static string!!!
		int  number;
		if(jumlah_mahasiswa == 0) {
			System.out.print("Insert Data terlebih dahulu");
			printAllMahasiswa();
		}
			// input id mahasiswa!!!
			System.out.print("Masukan ID yang dipilih : ");
			number = update.nextInt();
			// Menu Aksi
			System.out.println("Silahkan pilih menu aksi : ");
			System.out.println(" 1. Nama");
			System.out.println(" 2. NIM");
			System.out.println(" 3. IPK");
			System.out.println(" 4. Semua Data");
			Scanner input_menu= new Scanner(System.in);
			int pilih;
			System.out.print("Pilih menu : ");
			pilih = input_menu.nextInt();
			switch(pilih) {
			 case 1 : nama(number);break;
			 case 2 : nim(number);break;
			 case 3 : ipk(number);break;
			 case 4 : all(number);break;
		
			}
		
		// Read Data 
		getRataipk();
		printAllMahasiswa();
		
	}
	
	// function untuk mengubah seluruh data 
	public static void all(int number) {
		String nama,nim,ipk;
		Scanner update = new Scanner(System.in);
		Scanner update1= new Scanner(System.in);
		Scanner update2= new Scanner(System.in);
		System.out.print("Nama : ");
		nama = update1.nextLine();
		System.out.print("NIM : ");
		nim = update1.nextLine();
		System.out.print("IPK : ");
		ipk = update2.nextLine();
		float ipk1 = Float.valueOf(mahasiswa[2][number-1]);
		// dikurang 1 karena agar sesuai dan tidak memanggil index array-nya dari 0
		mahasiswa[0][number-1] = nama;
		mahasiswa[1][number-1] = nim;
		mahasiswa[2][number-1]= ipk;
		
		float selisih = ipk1 - Float.valueOf(ipk);
		jumlah_ipk -= selisih;
	

		}
	
	
	// function untuk mengubah data nama
	public static void nama(int number) {
	String nama;
	System.out.print("Nama : ");
	Scanner update1= new Scanner(System.in);
	nama = update1.nextLine();
		
	// dikurang 1 karena agar sesuai dan tidak memanggil index array-nya dari 0
	mahasiswa[0][number-1] = nama;
	
	}
	
	// Function untuk mengubah data nim
	public static void nim(int number) {
		String nim;
		System.out.print("NIM : ");
		Scanner update1 = new Scanner(System.in);
		nim = update1.nextLine();
		
	    // dikurang 1 karena agar sesuai dan tidak memanggil index array-nya dari 0
		mahasiswa[1][number-1] = nim;
		
	}
	
	// Function untuk mengubah data ipk!
	public static void ipk(int number) {
		String ipk;
		System.out.print("IPK : ");
		Scanner update2 = new Scanner(System.in);
		ipk = update2.nextLine();
		
		// dikurangi 1 karena agar sesuai dan tidak memanggil index array-nya dari 0
		float ipk1 = Float.valueOf(mahasiswa[2][number-1]);
		mahasiswa[2][number-1] = ipk;
		float selisih = ipk1 - Float.valueOf(ipk);
		jumlah_ipk -= selisih;
		// average ipk
		
		
		
	}
	
	// Function untuk menghapus data!
	public static void remove() {
		
		Scanner update = new Scanner(System.in);
		// ubah menjadi string karena menggunakan array static string!!!
		int  number;
		System.out.println("System Remove Mahasiswa");
		// input id mahasiswa!!!
		System.out.print("Masukan ID yang dipilih : ");
		number = update.nextInt();
		number = number - 1;
		
		jumlah_ipk -= Float.valueOf(mahasiswa[2][number]);
		
		// gunakan algoritma teknik traversal
		// teknik merplace lalu hapus bagian akhirnya
		for(int j = number; j < jumlah_mahasiswa; j++) {
			
			mahasiswa[0][j]= mahasiswa[0][j+1];
			mahasiswa[1][j]=mahasiswa[0][j+1];
			mahasiswa[2][j]=mahasiswa[0][j+1];
			
		}
		// jika data tidak bisa direplace maka data dihapus
		jumlah_mahasiswa--;
		
		printAllMahasiswa();
	}
	
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}

	public float getIpk() {
		return ipk;
	}

	public void setIpk(float ipk) {
		this.ipk = ipk;
	}
	
	
}
