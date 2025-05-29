package java021_jdbc.part02;

import java.util.List;

/* MVC패턴
 Model : 데이터 관리(DTO, DAO)
 View : 결과화면
 Controller : 클라이언트 요청과 응답처리, Model과 View 연결
*/


public class Java223_Jdbc {

	public static void main(String[] args) {
		DepartmentsController dController = new DepartmentsController();
		List<DepartmentsDTO> aList = null;
		
		aList = dController.listProcess();
		display(aList);
		
	}// end main()
	
	public static void display(List<DepartmentsDTO> aList) {
		for(DepartmentsDTO dto : aList)
			System.out.printf("%d %s %d %d\n",
					dto.getDepartment_id(), dto.getDepartment_name(), 
					dto.getManager_id(), dto.getLocation_id());
		
	}//end display()
}// end class
