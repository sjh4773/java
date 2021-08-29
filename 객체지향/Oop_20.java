class MyCar {
	String Color;
	int door;
	
	void drive() {   // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends MyCar {   // 소방차
	void water() {  // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}


public class Oop_20 {

	public static void main(String[] args) {
		MyCar car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;    // car = (Car)fe;에서 형변환이 생략됨
//		car.water();
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입. 형변환 생략 불가
		fe2.water();
	}

}
