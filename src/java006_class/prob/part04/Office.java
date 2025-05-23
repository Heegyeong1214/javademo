package java006_class.prob.part04;

public class Office {
	int num;  //번호
	int jumsu; //점수
	int chk;   //합격여부

	public Office(int chk) {
		this.chk = chk;
	}

	// 프로그램을 컴파일할때 정상적으로 수행이 되도록 생성자를 정의하시오.
	
	public Office(int num, int jumsu) {
		this.num = num;
		this.jumsu = jumsu;
	}
	/////////////////////////////////////////////////////

	public void count() {
		// 점수가 80이상이면 chk에 1로 변경한다.
		if (jumsu >= 80) {
			chk = 1;
		} else {
			chk = 2;
		}

	}

	public void prn() {
		System.out.printf("%d %d %d\n", num, jumsu, chk);
	}

	public void process() {
		count();
		prn();
	}
}

