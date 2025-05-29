package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

//DAO: Data Access Object (DTO로 저장한 데이터를 template(로그인)으로 접근하기 위함)
public class DepartmentsDAO {
	private static DepartmentsDAO dao = new DepartmentsDAO();
	
	private DepartmentsDAO() {
		
	}
	
//	외부에서 객체를 생성하지 않고 자원을 호출하기 위함; class.method()로 호출하기 위해서 static을 사용
	//(싱글톤 패턴 활용) 
	public static DepartmentsDAO getInstance() {
		
		return dao;
		
	}
	//DTO가 우리가 만든 메소드이고, 데이터 타입 중에 하나가 메소드라서 제네릭 타입으로 사용할 수 있음
	public List<DepartmentsDTO> getListMethod(Connection conn){
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "SELECT*FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			//다음에 내용이 있는지 확인. rs.next()가 true이면 그 열을 저장하기위해 객체에 입력함
			//getInt()는 JDBC에서 ResultSet 객체로부터 정수(int) 값을 꺼낼 때 사용하는 메서드
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);//결과값을 Array List에 담고,서비스로 넘기기
				
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
		}
		
		
		return aList;
	}
	
	
}//end class
