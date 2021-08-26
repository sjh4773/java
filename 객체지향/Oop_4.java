
public class Oop_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.sutract(5L, 3L);
		long result3 = mm.mutiply(5L, 3L);
		double result4 = mm.divide(5L,3L);
		long result5 = mm.max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		
		System.out.println("add(5L, 3L) = "+result1);
		System.out.println("sutract(5L, 3L) = "+result2);
		System.out.println("mutiply(5L, 3L) = "+result3);
		System.out.println("divide(5L,3L) = "+result4);
		System.out.println("divide(5L,3L) = "+result5);
		System.out.println("divide(5L,3L) = "+result6);
	}

}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long sutract(long a, long b) {
		long result = a - b;
		return result;
	}
	
	long mutiply(long a, long b) {
		long result = a * b;
		return result;
	}
	
	double divide(double a, double b) {
		double result = a / b;
		return result;
	}
	
	long max(long a, long b) {

		return a > b ? a : b;
	}
	long min(long a, long b) {
		
		return a < b ? a : b; 
	}
}