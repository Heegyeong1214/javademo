package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Java224_Jdbc {

	public static void main(String[] args) {

		MemController memcontroller = new MemController();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("======================");
			System.out.println("1 리스트, 2 삽입, 3 수정, 4 삭제, 0 종료 :");
			int input = Integer.parseInt(sc.nextLine());

			// 리스트
			if (input == 1) {
				listCall(memcontroller);
				// 삽입
			} else if (input == 2) {
				// 수정
				insertCall(memcontroller, sc);
			} else if (input == 3) {
				updateCall(memcontroller, sc);
				// 삭제
			} else if (input == 4) {
				deleteCall(memcontroller, sc);
				// 종료
			} else if (input == 0) {
				System.out.println("시스템 종료");
				sc.close();
				System.exit(0);
			}
		}

	}// end main()

	public static void deleteCall(MemController memcontroller, Scanner sc) {
		System.out.println("삭제 번호 입력; ");
		int num = Integer.parseInt(sc.nextLine());
		int chk = memcontroller.deletExecute(num);
		System.out.printf("%d개 삭제\n", chk);
	}

	// 데이터 Update
	public static void updateCall(MemController memcontroller, Scanner sc) {
		System.out.print("번호 입력: ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("이름입력: ");
		String name = sc.nextLine();

		System.out.print("나이입력:");
		int age = Integer.parseInt(sc.nextLine());

		System.out.print("지역입력: ");
		String loc = sc.nextLine();

		// int chk = memcontroller.updateExecute(new MemDTO(num, name, age, loc));
		HashMap<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("num", num);
		hMap.put("name", name);
		hMap.put("age", age);
		hMap.put("loc", loc);
		int chk = memcontroller.updateExecute(hMap);
		System.out.printf("%d개 수정\n", chk);
	}// end updateCall()

	// 데이터 Insert
	public static void insertCall(MemController memcontroller, Scanner sc) {
		System.out.print("이름입력: ");
		String name = sc.nextLine();

		System.out.print("나이입력:");
		int age = Integer.parseInt(sc.nextLine());

		System.out.print("지역입력: ");
		String loc = sc.nextLine();

		int chk = memcontroller.insertExecute(new MemDTO(name, age, loc));
		System.out.printf("%d개 삽입\n", chk);

	}// end insertcall()

	// 데이터 리스트화 한거 호출
	public static void listCall(MemController memController) {
		List<MemDTO> aList = memController.listExecute();// 여기까지는 데이터에 저장된 게 업승ㅁ

		if (aList.size() == 0) { // 삽입된 데이터가 없으면
			System.out.println("데이터가 없습니다.");
		} else {
			for (MemDTO dto : aList)
				System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		}
	}// end listCall()
}// end class
