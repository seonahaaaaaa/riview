package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 5명의 국어점수를 
		int kor[] = new int[3];
		
		/*
		 * 3명의 국어점수를 입력하세요 
		 */
		System.out.println(kor.length+ "명의 국어점수를 입력하세요 (ex. 10/20/30)");
		String inputData = sc.nextLine();	// 세명의 국어 점수를  String 값으로 인풋받음
		StringTokenizer st = new StringTokenizer(inputData,"/");	// st 라는 변수에 인풋 받은 값으로 객체 생성 / StringTokenizer : 지정한 구분자로 문자열을 쪼개는 함수
		for(int i = 0 ; st.hasMoreTokens(); i++) {	// hasMoreTokens : 다음에 읽어올 token이 있을 경우 true값 , 없으면 false 값
			String str = st.nextToken(); // nextToken : 인풋받은 값을 입력하는
			kor[i] = Integer.parseInt(str);	
		}
		
		//출력
		for ( int i = 0; i < kor.length ; i++) {
			System.out.println(i + " 번 학생의 점수 : " + kor[i]);
		}
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < kor.length; i++) {
			sum += kor[i];
			count++;
		}System.out.println("총점 : " + sum + " 평균 : " + (double)sum/count);
		
		sc.close();
	}

}
