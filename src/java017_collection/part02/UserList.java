package java017_collection.part02;

//  선형리스트( Linear List )
//  1 순서 리스트(Ordered List)
//  2 자료들 간에 순서를 갖는 리스트
//  3 선형 리스트에서 원소를 추가한 순서는 원소들의 순서가 된다.

//Vector Class에 있음
public class UserList {
	private Object[] sale; // null;
	private int pointer; // 0; -> 현재 데이터가 저장된 메모리의 위치값

	public UserList() {
		this(3);
	}

	public UserList(int cnt) {

		sale = new Object[cnt]; // new로 했으니까 배열의 크기는 고정
	}

	// append
	public void add(Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2]; // 기존 배열의 크기는 고정되어 있어서 새로 만든 것
			System.arraycopy(sale, 0, arr, 0, sale.length); // arr의 확장된 메모리에 sale 데이터 옮겨옴
			sale = arr;
		}
		sale[pointer++] = element; // point가 이동이됨
		
	}

	// insert
	// 기존에 있는 데이터를 한 칸씩 이동시킨 뒤 데이터 삽입
	public void add(int index, Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2]; // 기존 배열의 크기는 고정되어 있어서 새로 만든 것
			System.arraycopy(sale, 0, arr, 0, sale.length); // arr의 확장된 메모리에 sale 데이터 옮겨옴
			sale = arr;
		}
		
		for (int i = pointer; i > index; i--) {
			sale[i] = sale[i - 1];
		}
		sale[index] = element;
		pointer++;
	}

	// get
	public Object get(int index) {
		
		if (index < pointer)
			return sale[index];
		else
			throw new ArrayIndexOutOfBoundsException(index);
	}

	// remove
	// 포인터 앞에 있는 것까지 삭제 후 다시 옮김
	public Object remove(int index) {
		Object data = sale[index];
		for (int i = index; i < pointer-1; i++) {
			sale[i] = sale[i + 1];
		}
		pointer--;
		return data;

	}

	// 데이터가 저장되어 있는 요소 갯수
	public int size() {
		return pointer;
	}

	// 생성된 전체 메모리 크기
	public int capacity() {
		return sale.length;
	}

}// end class
