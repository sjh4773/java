
public class Oop_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;              // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();      // Tv�ν��Ͻ��� ������ ��, ������ Tv�ν��Ͻ��� �ּҸ� t�� ����
		t.channel = 7;     // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown();   // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");

	}

}

class Tv {
	// Tv�� �Ӽ�(�������)
	String color;       // ����
	boolean power;      // ��������(on/off)
	int channel;        // ä��
	
	// Tv�� ���(�޼���)
	void power() { power = !power; }  // Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; }   // Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel; } // Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}