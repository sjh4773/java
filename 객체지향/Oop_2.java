
public class Oop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(); //Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� �����ϰ�, Tv�ν��Ͻ��� �����ѵ� Tv�ν��Ͻ��� �ּҸ� t1�� �����Ѵ�.
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		// ��ü���� �ٸ� ��������� ���´�.
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		t2 = t1; // ���������� t1�� ���� t2�� ����.
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}

}

