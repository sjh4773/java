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
//	// 조상의 getLocation()을 오버라이딩
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
	
	
	// Object클래스의 toString()을 오버라이딩
	// Object클래스의 toString에 public이 붙어있기 때문에 그대로 유지, 오버라이딩을 하려면 선언부가 같아야함.
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

