package inherit;

public class Umma {

	public Umma() {
		System.out.println("엄마생성");
	}
	
	public void job() {
		System.out.println("엄마는 대장");

	}

	public void gene() {
		System.out.println("부모는 부모");

	}

}

/*
 * 상속
 *
 * - 설계 관점
 * - 부모클래스 : 공통적인 기능
 * - 자식 클래스 : 고유의 기능
 *
 * - 개발 관점 - 부모 클래스 요소는 사용 가능 - 부모 클래스에 없는 요소는 추가해서 사용 - 부모 클래스에 있는데 변경해야 하는 경우
 * (상속 관계에서 동일한 메소드 - overriding : 인자, 리턴값, 타입 전부 동일해야함.)
 * 
 * 
 * private < default < protected < public
 */

/*	형변환 : casting
 * 	1) 기본형끼리
 * 	2) 참조형에서 상속관계 있는 경우만 가능
 * 
 * 	String s = new String("~~");
 * 	StringBuffer sb = (StringBuffer)s; ==> 불가 X
 * 
 */
