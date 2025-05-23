package java012_api.part01;

import java.lang.reflect.Method;

//	1.리플렉션(reflection)
//  자바는 클래스와 인터페이스의 메타정보를 Class객체로 관리한다.
//  여기서 메타정보란 패키지 정보, 타입정보, 멤버(생성자,필드,메소드)정보 등을 말한다.
//  이러한 메타 정보를 프로그램에서 읽고 수정하는 행위를 리플렉션이라고 한다.
//  프로그램에서 Class객체를 얻으려면 다음 3가지 방법 중 하나이다.
//  ① Class clazz = 클래스명.class;                       => 클래스로부터 얻는 방법
//  ② Class clazz = Class.forName("패키지...클래스명"); => 클래스로부터 얻는 방법
//  ③ Class clazz = 객체참조변수.getClass();             => 객체로부터 얻는 방법
// 
//  2.JAVA API(Application Programming Interface)
// 
//  Object
//  1). 클래스 중에서 최상위 클래스이다.
//  2). Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
//  3). java.lang패키지에서 제공하는 클래스이다.
//  4). equals() : 객체의 번지를 비교하고 결과를 리턴
//     hashCode( ) : 객체의 해시코드를 리턴
//     toString( ) : 객체 문자 정보를 리턴

public class Java115_Object {

	public static void main(String[] args) {
		// 원래는 여기 없는 클래스를 가지고 오려면 import 해줘야 하는데, Java api에는 Object가 있어서 굳이 하지않아도 된다.
		Object obj = new Object();

		System.out.println(obj); // obj만 호출해도 obj.toString()을 자동적으로 호출함
		System.out.println(obj.toString());

//		Class객체를 얻기위한 3가지 방법
//		1.생성된 객체로부터 얻는 방법
		Class cobj = new Object().getClass(); // class java.lang.Object
		System.out.println(cobj);
		System.out.println(cobj.getName()); // java.lang.Object => 객체에 대한 클래스 이름만 들고 옴

//		2. 클래스 리터럴(*.class)로부터 얻는 방법
		Class sobj = Object.class;
		System.out.println(sobj);

//		3. 클래스 이름으로부터 얻는 방법
		try {
			Class lobj = Class.forName("java.lang.Object");
			System.out.println(lobj); // class java.lang.Object
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/////////////////////////////////////////
		// 패키지 정보 읽기
		System.out.println(cobj.getPackageName()); // java.lang

		// 패키지를 포함한 전체 클래스 이름을 알고 싶을 때
		System.out.println(cobj.getName()); // java.lang.Object

		// Object에서 제공하는 Method를 확인하고 싶을 때 
		System.out.println("========getMethods()========="); //현재의 위치에서 우리가 접근할 수 있는 Method만 보여준다 (반드시 public만 해당되는 것은 아님)
		Method[] methods = cobj.getMethods();
		for (Method md : methods) {
			System.out.println(md);
		}
		System.out.println("========getDeclaredMethod()========="); //public이외에도 protected도 확인 가능
		Method[] methodsDec = cobj.getDeclaredMethods();	
		for(Method md : methodsDec) {
			System.out.println(md);
		}
	

	}// end main()

}// end class
