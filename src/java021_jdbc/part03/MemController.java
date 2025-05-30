package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;

//Service 참조해야 함
public class MemController {
	
	private MemService service;
	
	public MemController() {
		service = new MemService();
		
	}
	//데이터 삭제
	public int deletExecute(int num) {
		return service.getDeleteProcess(num);
	}
	
	
	//데이터 업데이트
	public int updateExecute(MemDTO dto) {
		return service.getUpdateProcess(dto);
	}
	
	//데이터 업데이트
		public int updateExecute(HashMap<String, Object> hMap) {
			return service.getUpdateProcess(hMap); //타입이 안맞으니까 오류
			
		}
	
	//데이터 insert
	public int insertExecute(MemDTO dto) {
		return service.getInsertProcess(dto);
	}
	
	
	//데이터 리스트화
	public List<MemDTO> listExecute(){
		return service.getListProcess();
		
		
	}//end listExecute()
	
}//end class
