package java021_jdbc.part01;

/*
 * [JDBC 사용법]

 JDBC (Java DataBase Connectivity)
 
1 JDBC는 대부분이 인터페이스로 되어 있으며 이 인터페이스를 구현한 클래스 파일들의 
    묶음을 드라이버(driver)라고 한다.
2 자바에서 서로 다른 데이터베이스를 접속하기 위한 일관된 방식을 위해서 인터페이스로 만들고 
   각 벤더에서는  실제 접속방법을 구현한 클래스 파일을 제공하는 형태이다
3 따라서 벤더에서 제공한 데이터베이스의 드라이버를 반드시 사용해야  한다.


1. 데이터베이스와 연결하는 드라이버 파일을 찾아서 로딩한다.
   ​Class.forName("드라이버 이름")
2. 연결을 관리하는 Connection 객체 생성
​   Connection conn = DriverManager.getConnection("URL", "아이디","비밀번호" );

3. sql 구문을 처리할 Statement, PreparedStatement 객체 생성
   ​Statement stmt = conn.createStatement();
   PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM mem order by num");
4. 구문 실행 - select 구문 인 경우 ResultSet 객체를 통한 sql 결과 처리
    DML :  ​int cnt = stmt.executeUpdate("INSERT INTO Person(num, name, age, loc) VALUES(mem_num_seq.nextval,'김훈',40,'부산')");
   SELECT문 : ResultSet rs = stmt.executeQuery("SELECT * FROM mem order by num");
   
   ResultSet rs=pstmt.executeQuery();​​

5. 접속 종료 - 예외처리도 해야 함
   stmt.close();
   pstmt.close();   
   conn.close();​
​
 */
public class Java222_Jdbc {

	public static void main(String[] args) {
		JdbcTest jt = new JdbcTest();
		jt.process();
		
		
	}//end main()

}//end class
