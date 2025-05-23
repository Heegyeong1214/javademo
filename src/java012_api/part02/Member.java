package java012_api.part02;

public class Member /*extends Object*/{
	
	int id;
	
	
	public Member() {		//생성자는 Class랑 이름이 같아야 하고 리턴타입이 없어야 한다. 리턴 타입있으면 Method로 인식

	}

	public Member(int id) {		//매개변수 있는 생성자
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)		    //매개변수에서 받은 값이 Member이면
			return id == ((Member)obj).id;	//다운캐스팅; object를 Member로 바꿔주고 => (Member)obj
											//바뀐 것에 대한 id값을 비교해줘: ((Member)obj).id
		else
			return false;
	}
}//end class
