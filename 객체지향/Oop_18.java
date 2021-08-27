//// 모든 생성자는 첫줄에 다른 생성자를 호출해야한다!!!!
//
//class MyPoint4 {
//	int x, y;
//	
//	MyPoint4(){}
//	
//	MyPoint4(int x, int y){
//		super(); // Object();
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class MyPoint3D extends MyPoint4 {
//	int z;
//	
//	MyPoint3D(int x, int y, int z){
//		super();
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
//}
//
//
//public class Oop_17 {
//
//	public static void main(String[] args) {
//		MyPoint3D p = new MyPoint3D(1, 2, 3);
//		System.out.println("x=" + p.x + ", y=" + p.y + ", z=" + p.z);
//
//	}
//
//}


class MyPoint4 {
	int x, y;
	
	MyPoint4(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class MyPoint3D extends MyPoint4 {
	int z;
	
	MyPoint3D(int x, int y, int z){
		super(x, y); // Point(int x, int y)
		this.z = z;
		
	}
}



public class Oop_18 {

	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D(1, 2, 3);
		System.out.println("x=" + p.x + ", y=" + p.y + ", z=" + p.z);

	}

}
