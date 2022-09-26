package basic3;

public class Ex03_CallByValue {
				// 기본형을 함수의 인자로 보냄(복사함) ==> 복사한 값은 반환시 다시 원본값으로 초기화 됨 (원본에 영향을 미치지 않음)
	public static void main(String[] args) {
		int a = 10, b = 20;
		add(a,b);	// add 함수로 a,b를 보냄
		System.out.println("A=" + a + " B=" + b);	// 2 a = 10 ; b = 20
		
	}

	static void add(int a , int b) {	// 메인 메소드에 a , b 넘겨받음
		a += b ;	
		System.out.println("A=" + a + " B=" + b);	// 1	a = 30; b=20	// 해당 메소드는 해당 출력 값을 출력 후에 초기화 됨 (원본에 영향을 미치지 않음)

	}

}
