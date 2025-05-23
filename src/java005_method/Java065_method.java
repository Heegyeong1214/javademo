package java005_method;

public class Java065_method {

	public static void main(String[] args) {
		char[] data = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < data.length; i++) {
			System.out.printf("%c", data[i]);

		}
		System.out.println();

		System.out.println(data); // char를 썻을 때만 나열해서 나옴 -> abcd로

		System.out.print(data + "\n");
		System.out.printf("%s", data);

		System.out.println();

		int[] num = { 1, 2, 3 };
		System.out.println(num); // int 등 숫자를 썻을 때에는 나열해서 나오지 않음

	}

}
