package basic2;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 5명의 국어점수를 
		int kor[] = new int[3];
		for (int i = 0; i < kor.length ; i++) {
			System.out.println(i + "번 학생의 국어점수를 입력");
			kor[i] = sc.nextInt();
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
