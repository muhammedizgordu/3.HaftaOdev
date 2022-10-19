package youtubeEgitim;

public class CustomerManager {

	private Person _person;
	private Company _company;
	private IcreditManager _creditManager;

	

	public CustomerManager(Company compnay, IcreditManager creditManager) {

		_company = compnay;
		_creditManager = creditManager;
		
	}

	
	







	public void Save() {
		System.out.println("Müşteri eklendi...");

	}

	public void Delete() {
		System.out.println("Müşteri Silindi...");
		System.out.println("Müşteri Silindi...");
	}

	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}

}
