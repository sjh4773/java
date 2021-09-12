package _9;

public class algorithm_09 {

	public static void main(String[] args) {
		
		int inputNum = 1232;
		int accSum = 0;

		
		while(inputNum != 0) {
			accSum += inputNum % 10;
			inputNum /= 10;

		}
		System.out.println(accSum);
		
	}

}
