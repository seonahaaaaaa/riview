package basic3;

public class Ex03_CallByString {

	public static void main(String[] args) {
		
		String a = new String("안녕");
		String b = new String("하이");

		add(a, b);
		System.out.println("A=" + a + " B=" + b);	// 2) 안녕하이(아래 메소드에서 저장된 a값) / 하이
	}

	static void add(String a, String b) {
		
		a += b;	// String 자료형만 함수 호출 없이 연산 가능
		System.out.println("A=" + a + " B=" + b);	// 1) 안녕 하이,  하이	// 힙에서 저장 값에 변경이 있을 경우 새로운 데이터 생성하면 가르키는 번지수가 바뀜 : CallByValue
		
	}																										
}
		
		
	

