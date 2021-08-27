class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint{ // 상속
//	int r;
//}

class Circle { // 포함
	MyPoint p = new MyPoint(); // 참조변수의 초기화
	int r;
}


public class Oop_15 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.x="+c.p.x);
		System.out.println("c.y="+c.p.y);
		System.out.println("c.r="+c.r);

	}

}
