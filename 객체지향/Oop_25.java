abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�."); }
}

interface Fightable {
	public abstract void move(int x, int y); // public abstract�� ������
	public abstract void attack(Fightable f); // public abstract�� ������
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
	
	// Fightable �������̽��� ������ ��ü�� ��ȯ�Ѵ�.
	// �ο� �� �ִ� ��븦 �ҷ��´�.
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter�� �����ؼ� ��ȯ
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