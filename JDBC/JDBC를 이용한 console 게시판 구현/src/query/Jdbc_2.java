package query;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import oracle.jdbc.internal.OracleConnection.XSOperationCode;

public class Jdbc_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		String title ="TEST2";
		String writerid ="newlec";
		String content = "hahaha";
		String files ="";
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// ��ȸ���� 10���� �ʰ��ϴ� �Խñ۸� ��� 
		String sql = "INSERT INTO notice ("
				+ "    title,"
				+ "    writer_id,"
				+ "    content,"
				+ "    files"
				+ ") VALUES (?,?,?,?)";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
	    //Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, writerid);
		st.setString(3, content);
		st.setString(4, files);
		
		int result = st.executeUpdate();

		System.out.println(result);
		
		
		st.close();
		con.close();

	}

}
