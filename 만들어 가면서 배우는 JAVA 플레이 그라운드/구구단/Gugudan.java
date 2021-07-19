import java.util.Scanner;

//public class Gugudan {
//	public static void main(String[] args) {
		
		
		// 2,3단 구현 - 계산 및 출력
		// 2단
		// 한줄 복사 : 윈도우 - ctrl + alt + 아래/위 화살표
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		
//		// 3단
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
		
		// 값 입력 및 변수
		// 4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
		// 사용자에게 숫자 값을 입력 받는 방법
//		System.out.println("구구단 총 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		// 반복문 사용
		// 6단
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1;
//			
//		}
//		// 7단
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * 1);
//		}
		
		// 입력 및 조건문
		// 8, 9 단
		
//		System.out.println("구구단 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값: " + number);
//		
//		if(number < 2) {
//			System.out.println("값을 잘못 입력했습니다.");
//		} else if(number > 9) {
//			System.out.println("값을 잘못 입력했습니다.");
//		} else
//			for(int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
		
		// 배열로 구구단 다시 구현
		// 2단, 3단
//		int[] result = new int[9];
//		
//		for(int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		
//		result = new int[9];
//		
//		for(int i = 0; i < result.length; i++) {
//			result[i] = 3 * (i + 1);
//		}
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
		
		
		
		// 메소드 활용해 구구단 다시 구현
//		int[] result = calculate(2);
//		print(result);
//		
//		
//		
//	}
//
//	// 메소드
//	public static int[] calculate(int times) {
//		int[] result = new int[9];
//		for(int i = 0; i < result.length; i++) {
//			result[i] = times  * (i + 1);
//		}
//		return result;
//	}
//	
//	public static void print(int[] result) {
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//	}
//	
//}


public class Gugudan{
// 메소드
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times  * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
