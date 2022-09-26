package accother;

public class Access {

	private String a = "프라이빗데이타"; // 해당 클래스 내에서만 접근 가능 , 다른 클래스 내에서는 변수 & 값 자체를 불러올 수 없음.
	public String b = "퍼블릿데이타";
	protected String c = "프로텍티드데이타";	// 동일한 패키지 내에서만 접근 가능
	String d = "디폴트데이타"; // 디폴트는 자동으로 입력되는 값

	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

/*
1. 접근 지정자
	 - private : 해당 클래스 안에서 접근 가능 (괄호 안)
	 - public : 모든 접근 허용 (다른 클래스 내에서도 접근 가능)
	 - default : 해당 패키지에서만 접근 허용
	 - protected : 동일한 패키지 내에서는 상속 없이 접근 가능 , 해당 패키지와 다른 패키지인 경우는 자식 클래스에만 허용

*/

/*

2. 상속
	- 클래스를 설계하는 관점
		- 부모 클래스 : 공통적인 부분 
		- 자식 클래스 : 고유의 기능 
	
	- 개발 관점
		- 부모 클래스 요소는 사용 가능
		- 부모 클래스에 없는 요소는 추가해서 사용
		- 부모 클래스에 있는데 변경해야 하는 경우 
		 (상속 관계에서 동일한 메소드 - overriding : 인자, 리턴값, 타입 전부 동일해야함.)


*/