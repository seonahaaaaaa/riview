package basic5;

public class Book {

	private static int count;	// 공유 확장 : 객체끼리 공유
	
	public Book() {
		count++;	// 생성자 호출시에 값 하나씩 증가
		
	}

	public static int getCount() {
		return count;
	}
}

/*
	static
	
	- 객체의 공유
	- 객체 생성보다 먼저 실행하기 때문에 클래스명 접근 (중요)
	- 변수에 붙일시 : 객체 값 공유
	- 메소드명에 붙일시 : 클래스명 공유 (getter 사용시 객체명을 써야하지만 static은 클래스명을 사용해야하기 때문에 메소드명 앞에 static 기재함)
*/

/*
	Math.random(); : Math.random 앞에 static이 자동 생성 되어있기 때문에 객체 생성 없이 사용 가능함.
	


*/