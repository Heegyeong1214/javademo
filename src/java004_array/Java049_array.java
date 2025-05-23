package java004_array;

//1   2   3   4   5
//-   -   -   -   -
//11  12  13  14  15
//-   -   -   -   -

public class Java049_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, 
				        { 6, 7, 8, 9, 10 }, 
				        { 11, 12, 13, 14, 15 }, 
				        { 16, 17, 18, 19, 20 } };

		for(int i=0; i < num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(i % 2 == 0) {
					System.out.printf("%4d", num[i][j]);
					
					
				}else {
					System.out.printf("%4c", '-');
			} 
			}System.out.println();
		} 
			
		
	}//end main()

}//end class
