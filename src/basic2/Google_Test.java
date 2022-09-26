package basic2;

public class Google_Test {

	public static void main(String[] args) {
//		 * 문제  : 8의 숫자 세기(구글입사문제)
//		 * 
//		1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?		- for문
//		8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
//		(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
//		결과 : 4000

		int count = 0; // 8이 카운팅 되는 횟수
		for (int i = 1; i <= 10000; i++) {
			int number = i; 
			while (number != 0) {
				int su = number % 10;
				if (su == 8) {
					count++;
				}
				number = number / 10; // su : 나머지

			}
		}System.out.println(count);
	}
}