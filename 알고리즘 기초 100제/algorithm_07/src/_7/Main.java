package _7;

public class Main {

	public static void main(String[] args) {
		
		int num = 13;
		
		boolean isPrimeNumber = true;
		
		// 소수 1. 자기 자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가 아님.
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				// primeNumber X
				isPrimeNumber = false;
			}
		}

		if(isPrimeNumber) {
			System.out.println(num + " 은 소수 입니다.");
		}
		else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}

}
