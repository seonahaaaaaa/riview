package basic1;

// import java.lang.String.*;     : 자동으로 발생

/*
	자료형 (data type)
	1. 기본형
		boolean
		char
		int / long
		double
	
	2. 참조형
		클래스
		배열
		==> new 예약어를 통해 객체를 생성 
		
	(*) String (기본형/참조형과 별개)
	
*/

public class Ex01_Var { // extends Object{ : 모든 클래스의 조상 / 자동으로 발생

	// * 멤버변수 : 자동 초기화 가능

	public static void main(String[] args) {
		// * 지역변수 : 초기화 불가, 값 할당 필수

		// 문자열 변수 a 선언
		String a = "Hello";
		// = a = new String("Hello)
		// 
		// 정수 변수 b 선언
		int b = 200;

		System.out.println(a);
		System.out.println(b);

	}

}
