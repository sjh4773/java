class Tv {
	boolean power;
	int channel;
	
	void power()       { power = !power; }
	void channelUp()   { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	boolean caption;  // ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class Oop_14 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;            // ���� Ŭ�����κ��� ��ӹ��� ���
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Java");
		stv.caption = true; // ĸ�� ����� �Ҵ�.
		stv.displayCaption("Java");

	}

}
