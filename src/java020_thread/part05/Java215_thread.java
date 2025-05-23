package java020_thread.part05;

//프로세스 : 집
//스레드  : 가족 구성원(아빠, 엄마, 나, 동생)
//공유자원 : 욕실(Washroom)
public class Java215_thread {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread brother = new FamilyThread(wr, "brother");
		
		father.start();
		mother.start();
		sister.start();
		brother.start();

	}//end main()

}//end class
