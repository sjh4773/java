package query;

import java.sql.SQLException;

import com.sjh4773.app.console.NoticeConsole;

public class jdbc_5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		
		
		EXIT:while(true) {
			console.printNoticeList();
			int menu = console.inputNoticeMenu();
	
			switch(menu) {
			case 1: // ����ȸ
				break;
			case 2: // ����
				console.movePrevList();
				break;
			case 3: // ����
				console.moveNextList();
				break;
			case 4: // �۾���
				break;
			case 5: // �˻�
				console.inputSearchWord();
				break;
			case 6: // ����
				System.out.println("Bye~~");
				break EXIT;
			default:
				System.out.println("<<�����>> �޴��� 1~4������ �Է��� �� �ֽ��ϴ�.");
			}
		}
	}

}
