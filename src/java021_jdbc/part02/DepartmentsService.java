package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

public class DepartmentsService {
	DepartmentsDAO dao = null;
	
	public DepartmentsService() {
		
	}
	
	public List<DepartmentsDTO> getDepartmentsList(){
		List<DepartmentsDTO> aList = null;
		//get.connection()이 실행이되면 여기랑 template이랑 연결하기
		Connection conn = JdbcTemplate.getConnection();
		//그러면 SELECT(쿼리문)이 DAO : 이걸 받아와야 함
		dao = DepartmentsDAO.getInstance();
		
		try {
			conn.setAutoCommit(false);  //자동 커밋이 설정되어 있는데 이걸 해제함
			aList = dao.getListMethod(conn); //정상척으로 처리가 되면(DAO)
			JdbcTemplate.commit(conn);			//커밋해주고
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JdbcTemplate.rollback(conn); //비정상적으로 처리되면 롤백해주기
		}finally {
			JdbcTemplate.close(conn);		//그다음에 닫기
		}
		return aList;
	}
	
}//end class
