package java011_casting.part03;

public class Java112_binding {

	public static void main(String[] args) {
		LgTv lgTv = new LgTv("LG");
		process(lgTv);
		
		SamsungTv ssTv = new SamsungTv("SAMSUNG");
		process(ssTv);
		
	}
	
	//결합도(의존성)가 높다 - 유지보수가 높고 확장성이 약하다.
	public static void process(LgTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.call();
	}

	
	public static void process(SamsungTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.move();
	}

}
