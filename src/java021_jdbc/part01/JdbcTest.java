package java021_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public JdbcTest() {

	}

	public void process() {
		try {
			// 1. 드라이버 연동
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. DB서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
			// System.out.println(conn);
			
			//3. 쿼리문 실행을 위한 Stratement 객체를 생성
			stmt = conn.createStatement();
			
			//4. 쿼리문을 실행: SELECT - ResultSet(리턴타입) executeQuery(),
			//						UPDATE, INSERT, DELETE - int executeUpdate()
			String sql="Select*FROM mem";
			rs = stmt.executeQuery(sql);
			//ystem.out.println(rs);
			
			//5. 쿼리의 결과 출력
			//rs.next(); 다음에 읽어올 레코드가 있는지 여부 확인  -> 있으면 true, 없으면 false
			while(rs.next()){
				int num = rs.getInt("num");	//num number(오라클) -> 자바에서는 int로 
				String name = rs.getString("name"); //name varchar2  -> 자바에서는 string
				int age = rs.getInt("age"); //age number
				String loc = rs.getString("loc"); //loc varchar2
				System.out.printf("%d %s %d %s\n", num, name, age, loc);
				
			}
			 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6. 모든 자원을 종료
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}// end process()

}// end class()
