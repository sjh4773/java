//class MyPoint3 {
//	int x;
//	int y;
//	String getLocation() {
//		return "x:"+x+", y:"+y;
//	}
//}
//
//class MyPoint3D extends MyPoint3 {
//	int z;
//	
//	// ������ getLocation()�� �������̵�
//	String getLocation() {
//		return "x:"+x+", y:"+y+", z:"+z;
//	}
//}

//public class Oop_16 {
//
//	public static void main(String[] args) {
//		MyPoint3D p = new MyPoint3D();
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());
//
//	}
//
//}


class MyPoint3 extends Object {
	int x;
	int y;
	
	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	// ObjectŬ������ toString()�� �������̵�
	// ObjectŬ������ toString�� public�� �پ��ֱ� ������ �״�� ����, �������̵��� �Ϸ��� ����ΰ� ���ƾ���.
	public String toString() {
		 return "x:"+x+", y:"+y;
	}
}


public class Oop_16 {

	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(3, 5);
//		p.x = 3;
//		p.y = 5;
		System.out.println(p);
		
//		System.out.println(p.toString());		
//		System.out.println("p.x="+p.x);
//		System.out.println("p.y="+p.y);

	}

}

