package ncs.test08;

public class UserTest {

	public static void main(String[] args) {

		User[] users = new User[3];

		User us1 = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		User us2 = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		User us3 = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");

		users[0] = us1;
		users[1] = us2;
		users[2] = us3;

		System.out.println("users list -------------------------------------------------------------------");
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].toString());
		}
		
		User[] copyUsers = new User[users.length];
		
		users.clone();
		
		System.out.println("copy USers -------------------------------------------------------------------");
		for(int j = 0; j <copyUsers.length; j++) {
			System.out.println(copyUsers[j].toString());
		}
		
		System.out.println("비교결과----------------------------------");
		
	
			
		
		
	}// end main()

}// end class
