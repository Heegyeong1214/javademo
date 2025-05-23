package java003_statements;

//  for(초기식; 조건식; 증감식){
//    반복 수행할 문장;
//  }
// 
//  1. 조건식이 true일때만 반복을 실행한다.
//  2. for문 실행순서
//     초기식 -> 조건식(true) -> 반복수행 -> 증감식
//          -> 조건식(true) -> 반복수행 -> 증감식
//          -> 조건식(true) -> 반복수행 -> 증감식
//          .......
//          -> 조건식(false) -> for문을 종료함
//         
// 3. 초기식은 한번만 수행한다.
// 4. 초기식, 조건식, 증감식은 생략할 수 있지만 for(;;)세미콜론은 생략할 수 없다.
// 5. 초기식, 증감식은 여러개 사용할 수 있으나 조건식은 한개이하만 사용할 수 있다.
//    for(int a=3, b=4; ; sum+=a, hap+=b){  }
// 6. 조건식을 생략하면 true로 처리한다.(무한루프)
//     for문의 종료 시점을 정확히 파악할 수 없을 때 for문의 조건식을 생략한다. 
 

public class Java025_for {

	public static void main(String[] args) {
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		//i=i+1, i+=1, i++
		for (int i =1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}
