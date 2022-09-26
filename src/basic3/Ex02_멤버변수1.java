package basic3;

public class Ex02_멤버변수1 {

	static int a = 10;
	static int b = 20;
	static int sum = 0;

	public static void main(String[] args) {

		add();
		System.out.println(sum);

		// 두수 더한 결과를 출력
	}

	static void add() {
		// 두 수를 더하기
		sum = a + b;
	}

}
