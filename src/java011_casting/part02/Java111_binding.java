package java011_casting.part02;
//  다형성(polymorphism)
//  1 사전적 의미는 '여러가지 형태를 가질 수 있는 능력'을 의미한다.
//  2 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조하는 기술이다.
//     부모 클래스가 동일한 메시지로 하위 클래스들을 서로 다르게 동작시키는 객체 지향 원리입니다.
//    예를 들면, 하나의 타입으로 상속관계에 있는 여러 객체를 다루는 기술이다.
//   
//  바인딩(binding) : 메소드 호출을 실제 메소드의 몸체와 연결하는 기술이다.
//   1 정적바인딩(static binding) : 컴파일단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
//   2 동적바인딩(dynamic binding) : 실행단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술

public class Java111_binding {
	public static void main(String[] args) {
		Employee employee = new Employee("Steven", "code001");
		process(employee);
			
		Manager manager = new Manager("Neena", "professor", "second");
		process(manager);
		
		
	}//end main()
	
	 
	// Object obj = employee; 업캐스팅
	public static void process(Object obj) {			//여러 타입을 받을 수 있게 상위 클래스 변수로 설정
		System.out.println(obj.toString());				//oject의 toString 찾고 Employee에 오버라이딩된 toString이 있으면 Employee에 있는 toString을 사용
		if (obj instanceof Employee) {
			Employee ee = (Employee)obj;				//다운캐스팅; 부모 클래스인 Object는 자식클래스인 Employee에서 따로 만들어진 method에 직접 접근할 수 없으니까 Object를 employee로 변환하기 위해 다운캐스팅을 진행함
														// 즉 다운 캐스팅은 오버라이딩 되어 있지 않는 자식 클래스의 method를 부모클래스가 사용하고 싶을 때 자식클래스로 변환해서 사용
			System.out.println(ee.pay());
		}else if (obj instanceof Manager) {
			Manager mm = (Manager)obj;					//다운캐스팅
			System.out.println(mm.display());
		}
		
//		System.out.println(obj.pay());                 //pay(), display()가 오버라이딩 되지 않아서 인식 못하는 것
//		System.out.println(obj.display());
//		
		
		
	}//end process()
	
//	public static void process(Manager mng) {
//		System.out.println(mng.toString());
//		System.out.println(mng.display());
//	}//end process()
//	
//	public static void process(Employee emp) {
//		System.out.println(emp.toString());
//		System.out.println(emp.pay());
//	}//end process()
	
}//end class
