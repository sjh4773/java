package _7;

public class Main {

	public static void main(String[] args) {
		
		int num = 13;
		
		boolean isPrimeNumber = true;
		
		// �Ҽ� 1. �ڱ� �ڽ��� �����ϰ� ������ �������� ����� ������ -> �Ҽ��� �ƴ�.
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				// primeNumber X
				isPrimeNumber = false;
			}
		}

		if(isPrimeNumber) {
			System.out.println(num + " �� �Ҽ� �Դϴ�.");
		}
		else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
	}

}
