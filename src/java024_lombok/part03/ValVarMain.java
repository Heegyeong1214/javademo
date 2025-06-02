package java024_lombok.part03;

import lombok.val;
/*
 * 롬복은 프로젝트 폴더에 lombok.config 파일을 만들어 세부적인 설정을 적용할 수 있다. 
 * 기본적으로 disable로 설정되어있는 어노테이션은 flagUsage를 ALLOW로 설정해야 사용이 가능해진다.
 * lombok.---.flagUsage = ALLOW
 * ___ 는 어너테이션명이다.
 */
public class ValVarMain {

	public static void main(String[] args) {
	//val와 var의 공통점은 지역변수로 선언하고 데이터 타입을 지정하지 않는다.
	//val은 불변, var은 가변으로 사용된다.	
     val num = 10;
     System.out.printf("num=%d\n", num);
     
     //val은 final 지역변수로 lombok.config파일에서 lombok.val.flagUsage = ALLOW 설정한다.  
     //val은 불변이기 때문에 num 값을 변경할 수 없다!
     //num = 20;
     
     //가변 지역변수
     var str = "Hello";
     System.out.printf("str=%s\n", str);
     str = "java";
     System.out.printf("str=%s\n", str);
	}//end main()
  
}//end class
