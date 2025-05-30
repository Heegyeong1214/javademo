package java021_jdbc.part02;

import java.util.List;

public class DepartmentsController {
	private DepartmentsService service;
	
	public DepartmentsController() {
		service = new DepartmentsService();
		
	}
	
	public List<DepartmentsDTO> listProcess(){
		return service.getDepartmentsList();
		
		
	}//end process()
	
	public List<DepartmentsDTO> listSearchProcess(String search){
		return service.getSearchList(search);
	}
}//end class
