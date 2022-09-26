package basic2;

/*
 * 	Math.random() : 0.0 <= 소수점수 < 1.0
 *  Math.random() * 10
 *  
 *  	ex) 0.1234 * 10 => 1.234
 *  		0.00123 * 10 => 0.0123
 *  		0.5673 * 10 => 5.673
 *  		0.9999 * 10 => 9.999
 * 
 * (int)Math.random() * 10
 * 		ex) 0.1234 * 10 => 1
 *  		0.00123 * 10 => 0
 *  		0.5673 * 10 => 5
 *  		0.9999 * 10 => 9
 * 
 * 
 */

/*
 * 	int a = 5; int b = 10;
 * 
 * 	int temp;	// 중간 매개체	
 * 	
 * 	a = temp;
 *  b = a;
 *  temp = b;
 */

public class Ex05_로또 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		// 값지정
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 0부터 1사이의 실수
		}

		// 버블 정렬	: 옆에 있는 값을 비교해서 더 작은 값을 앞으로 보내는 정렬법
		for (int i = lotto.length - 1; i > 0; i--) {	// lotto.length - 1 : 버블형으로 두개씩 짝지어 인접한 항목의 서로의 값을 교환하는 작업은 전체 갯수에서 -1
			for (int j = 0; j < i; j++) {				// lotto.length - 1 번의 교환 작업이 종료되면 data 배열에 가장 끝쪽에 위치한 값은 데이터 값 중 가장 최대값이 위치함.
				if (lotto[j] > lotto[j + 1]) {			// lotto.length - 1 : 두번째 진행시 그 다음 큰 값이 그 다음으로 위치하게 됨. (= 정렬의 단계는 (항목의 갯수 -1) 로 진행이 됨.)
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
		// 번호 출력

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "/");
		}
	}
}
