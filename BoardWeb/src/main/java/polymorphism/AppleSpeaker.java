package polymorphism;

public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("==> Apple �Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("==> Apple �Ҹ� ������.");
		
	}
	
}
