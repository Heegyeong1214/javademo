package java011_casting.part04;

public class Java113_binding {

	public static void main(String[] args) {
		LgTv lgTv = new LgTv("LG");
		process(lgTv);
		
		SamsungTv ssTv = new SamsungTv("SAMSUNG");
		process(ssTv);

	}//end main()
	
	//결합도가 (의존성이) 낮아졌다. 
	public static void process(HomeTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		
		if(tv instanceof LgTv) {
			LgTv lgTv = (LgTv)tv;
			lgTv.call();
		}else if(tv instanceof SamsungTv) {
			SamsungTv ssTv = (SamsungTv)tv;
			ssTv.move();
		}
	}

}//end class
