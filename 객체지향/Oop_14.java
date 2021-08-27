class Tv {
	boolean power;
	int channel;
	
	void power()       { power = !power; }
	void channelUp()   { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	boolean caption;  // 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class Oop_14 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;            // 조상 클래스로부터 상속받은 멤버
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Java");
		stv.caption = true; // 캡션 기능을 켠다.
		stv.displayCaption("Java");

	}

}
