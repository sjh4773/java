class Data_1 {
	int value;
//    Data_1() {} // �⺻�����ڸ� �߰�
}

class Data_2 {
	int value;
	
	Data_2(){}; // �⺻ ������
	
	Data_2(int x) {  // �Ű������� �ִ� ������.
		value = x;
	}
}

public class Oop_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // �⺻ �����ڰ� ���� ��� compile error �߻�

	}

}
