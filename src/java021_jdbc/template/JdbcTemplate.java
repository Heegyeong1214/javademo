package java021_jdbc.template;
//Template을 만들어서 로그인
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Expression Edition: xe
 * Enterprise Edition: orcl
 */
public class JdbcTemplate {
	public static Connection getConnection() {
		Connection conn = null;
		
		// 1. 드라이버 연동
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}//end getconnection();
	
	//Connection 객체가 닫혀있는지의 여부를 확인하기 위함
	public static boolean isConnection(Connection conn) throws SQLException{
		boolean valid = true;
		if(conn == null || conn.isClosed()) {
			valid = false;
		}
		return valid;
		
	}//end isConnection()
	
	//Resertset의 객체를 닫기 위함
	public static void close(ResultSet rs) {
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}//end close()
	
	//Statement, PreparedStatement 객체 종료
	public static void close(Statement stmt) {
		if(stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}//end close()
	
	public static void close(Connection conn) {
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}//end close()
	
	public static void commit(Connection conn) {
		try {
			if(isConnection(conn))
					conn.commit();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
		}
	
					
	}//end commit()
	public static void rollback(Connection conn) {
		
			try {
				if(isConnection(conn))
					conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}//end rollback()
}//end class
