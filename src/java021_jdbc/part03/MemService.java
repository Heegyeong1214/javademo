package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

//트랜잭션 처리함! 일련의 순서
public class MemService {
	public MemDAO dao;
	
	public MemService() {
		dao = MemDAO.getInstance();
	}
	//Delete할 때 사용
	public int getDeleteProcess(int num) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			chk = dao.getDeleteMethod(conn, num);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		return chk;
	}
	
	
	//Update할 때 사용
	public int getUpdateProcess(MemDTO dto) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			chk = dao.getUpdateMethod(conn, dto);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		return chk;
	}
	
	//Update할 때 사용
		public int getUpdateProcess(HashMap<String, Object> hMap) {
			int chk = 0;
			Connection conn = JdbcTemplate.getConnection();
			
			try {
				conn.setAutoCommit(false);
				chk = dao.getUpdateMethod(conn, hMap);
				JdbcTemplate.commit(conn);
			} catch (SQLException e) {
				e.printStackTrace();
				JdbcTemplate.rollback(conn);
			}finally {
				JdbcTemplate.close(conn);
			}
			return chk;
		}
	
	//Inset할 때 사용
	public int getInsertProcess(MemDTO dto) {
		int chk = 0; //삽입한 갯수
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			chk = dao.getInsertMethod(conn, dto);
			JdbcTemplate.commit(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		
		return chk;
		
	}//end getInsertProcess()
	
	//getListProcess() :어떤 클래스의 객체를 오직 하나만 생성하고, 그 하나의 객체를 공통적으로 사용하고 싶을 때 사용합니다.
	//이때 객체를 반환하는 메서드 
	//반적으로 자바에서 데이터베이스(예: 오라클)와 연결해서 여러 행의 데이터를 조회해 리스트 형태로 반환하는 메소드
	
	//오라클의 데이터를 리스트화하는 Method
	public List<MemDTO> getListProcess(){
		List<MemDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);
			aList = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {				//문제가 생기면 rollback
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);			//connection 되면 close
		}
		
		
		return aList;
		
	}//end getListProcess()
	
}//end Memservice
