package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // 데이터 공간의 값과 저장 할 값의 갯수는 의미 없음. 내부적으로 저장할 값의 갯수에 따라 공간을 늘려주기
															// 때문.

		list.add("rabbit");
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정 : <데이터타입> ArrayList 뒤에 붙임.(필수는 X)
		System.out.println(list); // 배열로 출력

		System.out.println("===== set ====");
		list.set(3, "rabbit"); // fox 값을 rat 으로 지정(fox 값을 rat 으로 덮음.)
		System.out.println(list);

		System.out.println("===== remove ====");
		list.remove(1); // zebra 값을 지움.
		System.out.println(list);

		System.out.println("===== sort ====");
		Collections.sort(list); // 배열을 순차적으로 정렬
		System.out.println(list);

		System.out.println("===== 일반 for문 ====");
		for (int i = 0; i < list.size(); i++) {
			String data = (String) list.get(i); // 모든 형 변환 ==> object 클래스
			System.out.println(data);
		}

		System.out.println("===== 향상 된 for문 : generics 무조건적으로 지정해줘야 사용 가능하다. =====");
		// 향상 된 for 문 (주로 사용)
		for (String data : list) { // 오른쪽(list) 집합을 String data 에서 하나하나 뽑아서 출력
			System.out.println(data);
		}

	}
}
