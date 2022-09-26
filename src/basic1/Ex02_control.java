package basic1;

import java.util.Calendar;

/*
  
  제어문 : 프로그램 흐름을 변경하기 위해
   		1) if
   		2) switch
   		3) for
   		4) while / do~while
   		5) break / continue
 */

public class Ex02_control {

	public static void main(String[] args) {

		String id = "200302-3234567";

		char seong = id.charAt(7);

		System.out.println(seong);

		// seong 변수에 문자가 1이거나 3이거나 9라면 남자 출력 // 그렇지 않으고 문자가 2거나 4거나 0이라면 여자 출력

		// else : 그렇지 않고 else if : 그렇지 않으면

		if (seong == '1' || seong == '3' || seong == '9') { // char 로 '1'로 할당해주어야함. 1은정수 int형임
			System.out.println("남자입니다.");
		} else if (seong == '2' || seong == '4' || seong == '0') {
			System.out.println("여자입니다.");
		}

		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0이라면 '서울'
		// chul 변수가 1이라면 '인천 / 부산'
		// chul 변수가 2라면 '경기'
		// chul 변수가 9라면 '제주'

		String home = null;

		switch (chul) {

		case '0':
			home = "서울";
			break;
		case '1':
			home = "인천 / 부산";
			break;
		case '2':
			home = "경기";
			break;
		case '9':
			home = "제주";
			break;
		default:
			System.out.println("잘못 된 입력값입니다");
		}
		System.out.println(home + " 출신");
		
		String nai = id.substring(0,2);	// substring(a,b) : a자리부터 b 앞자리까지 문자열 출력 
		System.out.println(nai); 	// nai = "96"
		int sunai = Integer.parseInt(nai);
		System.out.println("=====================");
		
		System.out.println("==========출생년도별 나이 구하기===========");
		int age = 0;
		Calendar c = Calendar.getInstance(); // 시분초는 새로 생성하는 개념이 아닌, 시분초는 정해져 있으므로 getInstance 함수로 시분초를 받아와야함.
		int year = c.get(Calendar.YEAR);
		if(seong == '1' || seong == '2') {	// 2000년대생 위에는 2000을 더해야함   2000년대생 아래는 1900을 더해야함 
		 age = year- (sunai + 1900) + 1; 
			System.out.println("1900년도 출생입니다");
		} else if(seong == '3' || seong == '4') {
			age = year- (sunai + 2000) + 1; 
			System.out.println("2000년도 출생입니다."); 
		}
		System.out.println("나이는 : " + age + "살");
	}
}