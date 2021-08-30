abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다."); }
}

interface Fightable {
	public abstract void move(int x, int y); // public abstract가 생략됨
	public abstract void attack(Fightable f); // public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	// Fightable 인터페이스를 구현한 객체를 반환한다.
	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		return (Fightable)f;
	}
}



public class Oop_25 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();
		f2.move(150, 250);
		f2.attack(new Fighter());
	}
}