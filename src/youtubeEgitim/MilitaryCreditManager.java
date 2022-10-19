package youtubeEgitim;

public class MilitaryCreditManager implements IcreditManager{

	@Override
	public void Calculate() {
		System.out.println("Asker Kredsi Hesapladı");
	}

	@Override
	public void Save() {
		
		System.out.println("Asker Kredsi Kaydedildi");
	}

}
