package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;

	public void initMethod() {
		System.out.println("---��ü �ʱ�ȭ �۾� ó��---");
	}
	
	public SamsungTV() {
		System.out.println("---SamsungTV ��ü ���� ---");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("---SamsungTV(2) ��ü ���� ---");
		this.speaker = speaker;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("---SamsungTV(3) ��ü ���� ---");
		this.speaker = speaker;
		this.price = price;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}

	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	@Override
	public void volumeUp() {
//		System.out.println("SamsungTV---�Ҹ� �ø���.");
		
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
//		System.out.println("SamsungTV---�Ҹ� ������.");
		
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}
