package ex1;

import java.sql.Statement;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import oracle.jdbc.internal.OracleConnection.XSOperationCode;

public class Jdbc_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "SELECT * FROM NOTICE WHERE HIT > 10";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
	    Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			Date regDate = rs.getDate("REGDATE");
			String content = rs.getString("CONTENT");
			int hit = rs.getInt("hit");
			
			System.out.printf("id:%d, title:%s, writerId:%s, regDate:%s, content:%s, hit:%d\n", id, title, writerId, regDate, content, hit);
		}
		
		rs.close();
		st.close();
		con.close();

	}

}
