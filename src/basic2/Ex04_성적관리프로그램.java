package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적관리프로그램 {

	public static void main(String[] args) {

//		입력할 학생수를 입력하세요. 4
//		4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
//		1째 학생의 성적을 입력 -> 88/77/66
//		2째 학생의 성적을 입력 -> 50/40/70
//		3째 학생의 성적을 입력 -> 44/33/22
//		4째 학생의 성적을 입력 -> 55/50/70
//		[결과]
//		1째 학생의 총점 xxx 이고 평균은 ooo 입니다
//		2째 학생의 총점 xxx 이고 평균은 ooo 입니다
//		3째 학생의 총점 xxx 이고 평균은 ooo 입니다
//		4째 학생의 총점 xxx 이고 평균은 ooo 입니다
//		-----------------출력문--------------
//		국어과목  총점 xxx 이고 평균은 ooo 입니다
//		영어과목  총점 xxx 이고 평균은 ooo 입니다
//		수학과목  총점 xxx 이고 평균은 ooo 입니다

		Scanner sc = new Scanner(System.in); // 학생수 입력받기

		int lee[] = new int[3]; // st1의 국어/영어/수학
		int kim[] = new int[3]; // st2의 국어/영어/수학
		int park[] = new int[3]; // st3의 국어/영어/수학
		int jung[] = new int[3]; // st4의 국어/영어/수학

		System.out.println("lee 의 국어/영어/수학 점수를 순서대로 나열하시오 (ex. 10/20/30)");
		String inputData = sc.nextLine(); // 세명의 국어 점수를 String 값으로 인풋받음
		StringTokenizer st = new StringTokenizer(inputData, "/"); // st 라는 변수에 인풋 받은 값으로 객체 생성 / StringTokenizer : 지정한
																	// 구분자로 문자열을 쪼개는 함수
		for (int i = 0; st.hasMoreTokens(); i++) { // hasMoreTokens : 다음에 읽어올 token이 있을 경우 true값 , 없으면 false 값
			String str = st.nextToken(); // nextToken : 인풋받은 값을 입력하는
			lee[i] = Integer.parseInt(str);
		}

		// lee 점수 출력
		for (int i = 0; i < lee.length; i++) {
			System.out.println(i + " 번 학생의 점수 : " + lee[i]);
		}
		
		System.out.println("kim 의 국어/영어/수학 점수를 순서대로 나열하시오 (ex. 10/20/30)");
		String inputData1 = sc.nextLine(); 
		StringTokenizer st1 = new StringTokenizer(inputData, "/"); 
																
		for (int i = 0; st.hasMoreTokens(); i++) { 
			String str = st.nextToken(); 
			kim[i] = Integer.parseInt(str);
		}

		// kim 점수 출력
		for (int i = 0; i < kim.length; i++) {
			System.out.println(i + " 번 학생의 점수 : " + lee[i]);
		}
		
		sc.close();
		
		
	}
}
