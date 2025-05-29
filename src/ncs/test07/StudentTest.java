package ncs.test07;

public class StudentTest {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		Student st1 = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		Student st2 = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		Student st3 = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		
		students[0] = st1;
		students[1] = st2;
		students[2] = st3;
		
		for(int i =0 ; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
		
	}

}
