class MyCar {
	String Color;
	int door;
	
	void drive() {   // �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends MyCar {   // �ҹ���
	void water() {  // ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}


public class Oop_20 {

	public static void main(String[] args) {
		MyCar car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;    // car = (Car)fe;���� ����ȯ�� ������
//		car.water();
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� <- ����Ÿ��. ����ȯ ���� �Ұ�
		fe2.water();
	}

}
