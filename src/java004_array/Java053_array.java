package java004_array;

//[출력결과]
//red
//green
//pink

//[출력결과]
//Red
//Green
//Pink

//A:65, a:97
public class Java053_array {

	public static void main(String[] args) {
		char[][] color = { { 'r', 'e', 'd' }, { 'g', 'r', 'e', 'e', 'n' }, { 'p', 'i', 'n', 'k' } };

		for (int row = 0; row < color.length; row++) {
			for (int col = 0; col < color[row].length; col++) {
					// System.out.printf("%c", color[row][col]);				
				System.out.printf("%c", col ==0? (char)(color[row][col]-32) : color[row][col]);
				
				
			} System.out.println();
		}

	}// end main()

}// end class
