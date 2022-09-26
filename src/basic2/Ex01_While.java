package basic2;


public class Ex01_While {

	public static void main(String[] args) {

		// 0. for문
		// 1부터 10까지의 합
//		int sum = 0;		// 지역변수는 초기화 필수, 처음 선언시 값 할당이 안되어있음.
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

//		// while문
//		int sum = 0;
//		int i = 1; // while 문 내의 지역변수 외부에서 초기화
//		while (i <= 10) {
//			sum += i; // 조건식
//			i++;
//		}
//		System.out.println(sum); // 출력문

		// 1~10 곱한 값
//		int result = 1;
//		int i = 1;
//		while (i <= 10) {
//			result *= i;
//			i++;
//			System.out.println(result);
//		}

//		int sum = 0;
//		int i = 1; // while 문 내의 지역변수 외부에서 초기화
//		do {
//			sum += i; // 조건식
//			i++;
//		} while (i <= 10);
//		System.out.println(sum); // 출력문

//		int result = 1;
//		int i = 1;
//		do {
//			result *= i;		
//			i++;					
//			
//		}while (i <= 10);
//		System.out.println(result);

		
//      A
//      AB
//      ABC
//      ABCD
//      :
//      ABCDEFGHIJKLMNOPQRSTUVW
//      ABCDEFGHIJKLMNOPQRSTUVWX
//      ABCDEFGHIJKLMNOPQRSTUVWXY
//      ABCDEFGHIJKLMNOPQRSTUVWXYZ

		int i = 0;
		while (i < 26) {
			i++;
			for (char j = 'A'; j < 'A' + i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}

//      ABCDEFGHIJKLMNOPQRSTUVWXYZ
//      ABCDEFGHIJKLMNOPQRSTUVWXY
//      ABCDEFGHIJKLMNOPQRSTUVWX
//      ABCDEFGHIJKLMNOPQRSTUVW
//      ABCDEFGHIJKLMNOPQRSTUV
//      :
//      ABC
//      AB
//      A
		
		
		
		
	}

}
