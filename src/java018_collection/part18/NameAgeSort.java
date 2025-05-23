package java018_collection.part18;

import java.util.Comparator;

//List에 있는 거 가지고 비교해야하는데, ArrayList 타입이 Person이니까 비교할 때도 Person으로!
public class NameAgeSort implements Comparator<Person>{

	
	//name 오름차순, age 내림차순
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getName().equals(o2.getName()))
			//int는 method가 따로 없어서 compareTo를 사용하기 위해선 Integer로 변환해줘야함
			return Integer.valueOf(o2.getAge()).compareTo(Integer.valueOf(o1.getAge()));
			else
		return o1.getName().compareTo(o2.getName());
	}
}
