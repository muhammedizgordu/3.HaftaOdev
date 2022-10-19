package youtubeEgitim;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager2 = new CustomerManager(new Company(), new TeacherCreditManager());
		customerManager2.GiveCredit();

	}

}
