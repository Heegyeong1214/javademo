package java010_abstract_interface.part06;

public interface Score {
	public int sol = 20;		//인터페이스의 모든 변수는 public이기 때문에 생략해도 괜찮음
								//public static final -> 숫자도 선언해야한다
	
	public int getScore();		//public abstract
}
