package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

//DAO : Data Access Object
public class MemDAO {
	private MemDAO() {

	}

	private static MemDAO dao = new MemDAO();

	public static MemDAO getInstance() {
		return dao;
	}

	// Delete method
	// 삭제할 때는 레코드 단위(하나의 행)을 삭제
	public int getDeleteMethod(Connection conn, int num) {
		int chk = 0;
		PreparedStatement pstmt = null;

		try {
			String sql = "DELETE FROM mem WHERE num = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			chk = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			JdbcTemplate.close(pstmt);
		}
		return chk;
	}

	// 업데이트 하는 Method(수정)
	public int getUpdateMethod(Connection conn, MemDTO dto) {
		int chk = 0;
		PreparedStatement pstmt = null;

		try {
			String sql = "UPDATE mem SET name=?, age=?,loc=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());
			pstmt.setInt(4, dto.getNum());
			// 인서트, 업데이트 델리트할 때에는 executeUpdate()사용
			chk = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		return chk;
	}

	public int getUpdateMethod(Connection conn, HashMap<String, Object> hMap) {
		int chk = 0;
		PreparedStatement pstmt = null;

		try {
			String sql = "UPDATE mem SET name=?, age=?,loc=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String)hMap.get("name"));
			pstmt.setInt(2, (int)hMap.get("age"));
			pstmt.setString(3, (String)hMap.get("loc"));
			pstmt.setInt(4, (int)hMap.get("num"));
			// 인서트, 업데이트 델리트할 때에는 executeUpdate()사용
			chk = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		return chk;
	}
	// 삽입하는 Method
	// 쿼리 실행에 대한 리턴 값은 ResultSet
	// 인서트, 업데이트, 델리트는 리턴 값이 int: 메인이라는 메소드에서 삽입한 데이터 값을 받음
	public int getInsertMethod(Connection conn, MemDTO dto) {
		int chk = 0; // -> 삽입한 데이터 갯수
		PreparedStatement pstmt = null;
		// 쿼리문
		// num은 시퀀스를 삽입해야함
		String sql = "INSERT INTO mem(num, name, age, loc) VALUES (mem_num_seq.nextval,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());

			// 크냑 쿼리 실행할 때는 excuteQuery() 사용
			// 인서트, 업데이트 델리트할 때에는 executeUpdate()사용
			chk = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}

		return chk;
	}

	// getListMethod는 List를 반환하는 메서드
	public List<MemDTO> getListMethod(Connection conn) {
		List<MemDTO> aList = new ArrayList<MemDTO>();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM mem ORDER BY num DESC";
			rs = stmt.executeQuery(sql); // sql 즉 쿼리를 실행한 결과가 rs
			while (rs.next()) {
				MemDTO dto = new MemDTO();// 각각 다른 데이터를 저장해야 하기 때문에 while문 안에서 작성함. 다음 라인이 있으면 반복해서 dto 호풀
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto); // dto를 aList에 넣기!
			} // 굳이 List에 DTO를 담아서 넣는 이유는? rs, stmt를 close하면 null이 되고 결국 null이 넘어감

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
		}

		return aList;

	}// end getListMethod()

}// end class
