package basic3;

public class Ex03_CallByRef {

	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");

		add(a, b);
		System.out.println("A=" + a + " B=" + b);	// 2) 안녕하이(아래 메소드에서 저장된 a값) / 하이
	}

	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("A=" + a + " B=" + b);	// 1) 안녕 하이	/ 하이	// 참조형은 new 객체 생성시에 heap을 새로 생성하지 않고 값을 그대로 가르킴 ( 메소드가 종료해도 힙에 저장 된 데이터는 동일하고 
	}																		// 선언 된 a,b만 사라짐. 변경 된 heap에 저장 되어있는 값은 원본으로 그대로 올라감.	: CallByRef										
}

/*
 * 문자열 처리 클래스
 * 
 * - String
 * 
 * - StringButter (보편적) / StringBuilder
 * 
 */
