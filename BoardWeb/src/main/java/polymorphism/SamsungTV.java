package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;

	public void initMethod() {
		System.out.println("---객체 초기화 작업 처리---");
	}
	
	public SamsungTV() {
		System.out.println("---SamsungTV 객체 생성 ---");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("---SamsungTV(2) 객체 생성 ---");
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
		System.out.println("---SamsungTV(3) 객체 생성 ---");
		this.speaker = speaker;
		this.price = price;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
	}

	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	@Override
	public void volumeUp() {
//		System.out.println("SamsungTV---소리 올린다.");
		
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
//		System.out.println("SamsungTV---소리 내린다.");
		
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}
