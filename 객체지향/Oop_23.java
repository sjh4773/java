abstract class Player { // �߻� �޼��带 ������ �����Ƿ� �߻� Ŭ������ �ȴ�!(�̿ϼ� Ŭ����, �̿ϼ� �����)
	abstract void play(int pos); // �߻� �޼���(�̿ϼ� �޼���)
	abstract void stop();        // �߻� �޼���(����θ� �ְ� ������ { }�� ���� �޼���)
}

// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ��������
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+" ��ġ���� play �մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}
}


public class Oop_23 {

	public static void main(String[] args) {
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); // ������
		ap.play(100);
		ap.stop();

	}

}
