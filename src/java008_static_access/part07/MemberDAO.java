package java008_static_access.part07;

public class MemberDAO {

//	public MemberDAO() {
//		
//	}
	private static MemberDAO dao = new MemberDAO();		// private라서 아무나 접근 못함, 객체를 생성해 놓는 것 => Member DAO라는 method 적용해서 데이터 호출
	private MemberDAO() { 								//생성자;싱글톤 패턴일 때는 public이 아니라 private로 설정
											
	}
	
	//private static int x = 5;
	
	public static MemberDAO getInstance() {             // 접근할 수 있는 method에게 접근할 수 있도록 먼저 명시하고 생성해 놓은 객체를 갖다 씀
														// static을 적용한 method는 static에 대한 자원만 사용할 수 있기 때문에 private static/ public static을 적용하는 것
		return dao;
	}
	
	public void display() {
		System.out.println("display");
	}
}//end class
