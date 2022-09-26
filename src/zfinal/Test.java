package zfinal;

final class Parent { 	// 클래스 앞에 final 적용시에 해당 클래스는 부모 클래스가 될 수 없다. 상속받아도 해당 클래스의 필드나 메소드를 선언 , 호출 자체가 불가능 하기 때문에.
	final String field = "부모님꺼"; // 해당 선언 된 구문 제외하고 나머지 구문에서는 변경 절대 불가능

	final public void jib() {
		System.out.println("부모님이 만드신거");
	}
}

//class Child extends Parent { // parent 를 상속받음
//	Child() {
//		// field = "내꺼";
//	}
//	 public void jib() {
//		System.out.println("내가 탕진함");
//	}
//}

public class Test {

	public static void main(String[] args) {

//		Parent p = new Child();
//		System.out.println(p.field);
//		p.jib();

	}

}
