package java013_api;

import java.util.Arrays;
import java.util.Random;

public class Java144_Random {

	public static void main(String[] args) {
		int[] num = new int[5]; // 1부터 10까지
		
		
		Random ran = new Random();
		
		for (int i = 0; i < num.length; i++) {
			//num[i]=ran.nextInt(10)+1;
			num[i]=ran.nextInt(45) + 1; //1~45
			
		for (int j = 0; j < i; j++) {			//중복체크
			if(num[j]==num[i]) {
				i--;
				break;
			}
		}
		}
		for(int data:num)
			System.out.printf("%4d", data);
		
		System.out.println();
		
	//오름차순
		Arrays.sort(num);
		for(int data:num)
			System.out.printf("%4d", data);
	}

}
