package basic3;

public class Ex01_함수2 {

	public static void main(String[] args) {

		int sum = add();	// sum 값을 해당 자리에서 출력해야 할 경우
		System.out.println(sum);
	}

	static int add() {
		int a = 10;
		int b = 20;
		
		int sum = a + b;
		return sum;	// sum 값을 static 메소드에 전송시, return; 함수로 반환해야함 : return이 존재하지 않을시에 해당 메소드가 종료될시 선언 된 지역변수는 사라짐. ==> 반환 불가.
		
	}

}
