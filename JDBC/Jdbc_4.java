package ex1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import oracle.jdbc.internal.OracleConnection.XSOperationCode;

public class Jdbc_4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		int id = 9;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "DELETE NOTICE WHERE ID=?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
	    //Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		
		int result = st.executeUpdate();

		System.out.println(result);
		
		
		st.close();
		con.close();

	}

}
