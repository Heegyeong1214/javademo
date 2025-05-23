package java018_collection.part15;

import java.util.Vector;

public class Java202_Vector {

	public static void main(String[] args) {

		Vector<String> vt = new Vector<String>();
		vt.add("java");
		vt.add("jsp");
		vt.add("spring");
		vt.add("oracle");
		vt.add("mysql");
		System.out.println(vt.toString());
		
		//지정한 index에 있는 데이터 삭제
		vt.remove(0);
		System.out.println(vt.toString());
		
//////////////////////////////////////////////////////////////////////////		
		//삭제하고 싶은 데이터를 vector에다가 넣음
		Vector<String> vm = new Vector<String>();
		vm.add("oracle");
		vm.add("mysql");
		vm.add("mssql");
		
		//boolean java.util.Vector.removeAll(collection<?> c):은 모든 타입의 컬렉션을 삭제해도 됨
		vt.removeAll(vm);
		System.out.println(vt.toString());
		
///////////////////////////////////////////////////////////////////////////
		
		Vector<Integer> vn = new Vector<Integer>();
		vn.add(10);
		vn.add(20);
		vt.removeAll(vn);   //String이 아니더라도 Method입력은 할 수 있음
		System.out.println(vt.toString()); //String이 아니기 때문에 추가된 게 없음
		
		
		
		
		
		
	}

}
