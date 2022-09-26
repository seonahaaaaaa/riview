package basic3;

public class Ex01_함수1 {

	public static void main(String[] args) {
		int a = 10, b = 20;	// 메인 메소드에서 사용한 지역변수는 다른 메소드에서 바로 선언 불가. / add 라는 변수를 호출하여 메인함수 지역변수 값 대입.
		
		add(a,b);	// 인수
		
	}

	static void add(int a, int b) {	// 인자 , 메인 메소드에서 전송한 데이터를 받음. 변수명(a , b ==> x , y 받아도 작동은 원활하게 되지만 동일하게 사용하는 편이 좋음 )은 동일하지 않아도 상관 없다.
		// 여기에서 a,b 의 값을 합해서 출력
		int sum = a + b;
		System.out.println(sum);
	}
	
	
}
