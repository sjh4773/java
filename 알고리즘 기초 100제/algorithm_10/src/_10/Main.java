package _10;

public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		
		
		for (int j =0; j < n ; j++) {
			for (int i=0; i < n; i++) {
				System.out.printf("%4d", j*n + i + 1);
			}
			System.out.println();
		}
		
	}

}
