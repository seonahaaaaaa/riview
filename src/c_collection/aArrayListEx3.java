package c_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result = method();
		// 학생 정보를 여기서 출력하시오.
		for (Student s : result) { // for (대입받을 변수 : 배열명)
			System.out.println(s);
		}

		// [참고] 전체 요소를 순서대로 검색
		// Enumeration => Iterator
		System.out.println("==================");
		Iterator<Student> it = result.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>(); // ArrayList : 인덱스로 내부의 값을 관리 (저장 할 데이터 값의 갯수를 모를때)
		// Student s = new Student("홍길자", 25);
		list.add(new Student("홍길자", 25)); // list.add()) ArrayList 값을 추가하는 코드
		list.add(new Student("홍길이", 33));
		list.add(new Student("홍삼이", 44));

		return list;
	}

}

//----------------------------------------------------------
class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "학생은 " + age + "세 입니다.";
	}
}
