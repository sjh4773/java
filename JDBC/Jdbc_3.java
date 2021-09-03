package ex1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import oracle.jdbc.internal.OracleConnection.XSOperationCode;

public class Jdbc_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		String title ="TEST3";
		String content = "HAHAHA";
		String files ="";
		int id = 9;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "UPDATE NOTICE SET TITLE=?,CONTENT=?,FILES=? WHERE ID=?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
	    //Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, content);
		st.setString(3, files);
		st.setInt(4, id);
		
		int result = st.executeUpdate();

		System.out.println(result);
		
		
		st.close();
		con.close();

	}

}
