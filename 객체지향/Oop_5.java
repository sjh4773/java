
public class Oop_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan mt = new gugudan();
		mt.printGuGudan(2);
		
	}

}

class gugudan {
	void printGuGudan(int dan) {
		if(!(2<=dan && dan<=9))
			return; // �Է¹��� ��(dan)�� 2~9�� �ƴϸ�, �޼��� �����ϰ� ���ư���
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
//		return;
	}
}

