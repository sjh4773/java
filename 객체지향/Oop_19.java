class Time {
	private int hour; // 0~23 ������ ���� ��������.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		
		this.hour = hour;
	}

	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� ��
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() { return hour; };
}



public class Oop_19 {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(100); // hour�� ���� 21�� ����
		System.out.println(t.getHour());

	}

}
