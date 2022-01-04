package sistemInformasiRestoran;

public class Customer {
	private String namaCustomer;
	
	public Customer(String namaCustomer) {
		this.setNamaCustomer(namaCustomer);
	}
	
	public void setNamaCustomer(String namaCustomer) {
		this.namaCustomer = namaCustomer;
	}
	
	public String getNamaCustomer() {
		return namaCustomer;
	}
}
