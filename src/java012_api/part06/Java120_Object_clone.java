package java012_api.part06;

import java.util.Arrays;

public class Java120_Object_clone {

	public static void main(Java121_String[] args) {
		Rect[] rect = new Rect[3];
		rect[0] = new Rect(2, 5);
		rect[1] = new Rect(1, 4);
		rect[2] = new Rect(3, 2);

		// Rect[] copy = rect;
		
		Rect [] copy = rect.clone();
		//rect랑 copy의 주소가 다름
		System.out.println(rect);
		System.out.println(copy);
		System.out.printf("%d %d\n", rect[0].width, rect[0].height);   //2 5
		System.out.printf("%d %d\n", copy[0].width, copy[0].height);	//2 5
		
////		copy[0]= new Rect(100,200);
////		copy[0].width =100;
////		copy[0].height = 200;
//		System.out.printf("%d %d\n", rect[0].width, rect[0].height);	//2 5, 100 200
//		System.out.printf("%d %d\n", copy[0].width, copy[0].height);	//100 200
		
		for(int i=0; i<copy.length; i++)
			copy[i] = rect[i].clone();
		copy[0].width =100;
		copy[0].height = 200;
		System.out.printf("%d %d\n", rect[0].width, rect[0].height);   //2 5
		System.out.printf("%d %d\n", copy[0].width, copy[0].height);
		
//        
}
}