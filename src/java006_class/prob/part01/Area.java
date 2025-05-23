package java006_class.prob.part01;

public class Area {

	String menu;//이름
	int r; // 반지름

	float area() {
		return (float) (r * r * 3.14);
	}// end area

	void display() {
		
		if(menu=="피자") {
			System.out.printf("자바피자의 면적은 %.1f\n", area());
		} else {
		System.out.printf("자바도넛의 면적은 %.2f\n", area());
		}
	}
}//end display
