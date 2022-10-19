package youtubeEgitim;

public class TeacherCreditManager implements IcreditManager {

	@Override
	public void Calculate() {
		
		
		System.out.println("Öğretmen Kredsi Hesapladı");
		
	}

	@Override
	public void Save() {
		
		System.out.println("Öğretmen Kredsi Kaydedildi");
	}

}
