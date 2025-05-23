package java010_abstract_interface.answ.part04;
public class Staff extends Person {

	public Staff(String name, String jumin) {
		super(name, jumin);
	}

	@Override
	public char gender() {
		// 주민번호를 이용해서 성별을 구한후 반환
		char gd = getJumin().charAt(6);
		if (gd == '1' || gd == '3')
			return '남';
		else
			return '여';
	}

	@Override
	public int getYear() {
		// 주민번호를 이용한 년도4자리를 구한후 반환
		String year=getJumin().substring(0,2);
		char gd = getJumin().charAt(6);
		if(gd=='1' || gd=='2')
			year="19"+year;
		else
			year="20"+year;
		return Integer.parseInt(year);
	}

	@Override
	public int getMonth() {		
		return Integer.parseInt(getJumin().substring(2,4));
	}

	@Override
	public int getDATE() {		
		return Integer.parseInt(getJumin().substring(4,6));
	}

}// end Staff






