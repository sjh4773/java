package com.sjh4773.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sjh4773.app.entity.Notice;

public class NoticeService {
	
	public List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException{
		
		int start = 1 + (page-1)*10;  // 1, 11, 21, 31 ...
		int end = 10*page ; // 10, 20, 30, 40...
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "SELECT * FROM NOTICE_SERVICE_VIEW WHERE "+field+" LIKE ? AND NUM BETWEEN ? AND ?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
	    PreparedStatement st = con.prepareStatement(sql);
	    st.setString(1, "%"+query+"%");
	    st.setInt(2, start);
	    st.setInt(3, end);
		ResultSet rs = st.executeQuery();
		
		List<Notice> list = new ArrayList<Notice>();
		
		while(rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			Date regDate = rs.getDate("REGDATE");
			String content = rs.getString("CONTENT");
			int hit = rs.getInt("hit");
			String files = rs.getString("files");
			
			Notice notice = new Notice(
					id,
					title,
					writerId,
					regDate,
					content,
					hit,
					files);
			
			list.add(notice);
		}
		

		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}

	
	public int getCount() throws SQLException, ClassNotFoundException {
		int count = 0;
	
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "SELECT COUNT(ID) COUNT FROM NOTICE";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
	    Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		
		if(rs.next())
			count = rs.getInt("COUNT");
		
		rs.close();
		st.close();
		con.close();
		
		return count;
	}

	
	public int insert(Notice notice) throws SQLException, ClassNotFoundException {
		
		String title = notice.getTitle();
		String writerid = notice.getWriterId();
		String content = notice.getContent();
		String files = notice.getFiles();
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "INSERT INTO notice ("
				+ "    title,"
				+ "    writer_id,"
				+ "    content,"
				+ "    files"
				+ ") VALUES (?,?,?,?)";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, writerid);
		st.setString(3, content);
		st.setString(4, files);
		
		int result = st.executeUpdate();

		
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int update(Notice notice) throws SQLException, ClassNotFoundException {
		String title = notice.getTitle();
		String content = notice.getContent();
		String files = notice.getFiles();
		int id = notice.getId();
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "UPDATE NOTICE SET TITLE=?,CONTENT=?,FILES=? WHERE ID=?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, content);
		st.setString(3, files);
		st.setInt(4, id);
		
		int result = st.executeUpdate();
	
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int delete(int id) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		// 조회수가 10번을 초과하는 게시글만 출력 
		String sql = "DELETE NOTICE WHERE ID=?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "na753951");
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		
		int result = st.executeUpdate();
		
		
		st.close();
		con.close();
		
		return result;
	}
}



