
public class Oop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(); //Tv인스턴스를 참조하기 위한 변수 t를 선언하고, Tv인스턴스를 생성한뒤 Tv인스턴스의 주소를 t1에 저장한다.
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		// 객체마다 다른 저장공간을 갖는다.
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		t2 = t1; // 참조변수의 t1의 값을 t2에 저장.
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}

