package query;

import java.sql.SQLException;

import com.sjh4773.app.console.NoticeConsole;

public class Jdbc_console {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		
		
		EXIT:while(true) {
			console.printNoticeList();
			int menu = console.inputNoticeMenu();
	
			switch(menu) {
			case 1: // 상세조회
				break;
			case 2: // 이전
				console.movePrevList();
				break;
			case 3: // 다음
				console.moveNextList();
				break;
			case 4: // 글쓰기
				break;
			case 5: // 검색
				console.inputSearchWord();
				break;
			case 6: // 종료
				System.out.println("Bye~~");
				break EXIT;
			default:
				System.out.println("<<사용방법>> 메뉴는 1~4까지만 입력할 수 있습니다.");
			}
		}
	}

}
