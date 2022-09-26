package basic2;

import java.util.Scanner;

/*
 * for	: 반복 횟수가 정해진 경우
 * while	: 반복 횟수를 모르는 경우 
 * do~ while	: 반복 횟수를 모르는 경우 (조건을 나중에 비교)
 */

public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력 받아서 해당 단의 구구단을 출력하라
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("몇 번 반복을 할까요? ==> ");
		//		int a = sc.nextInt(); // a = 반복횟수

		//		// 1. for문
		//		for (int j = 0; j < a; j++) {
		//			System.out.println("출력할 단을 입력해주세요 ==> ");
		//			int c = sc.nextInt(); // c = 출력 할 단
		//			for (int i = 1; i <= 9; i++) {
		//				System.out.print(c + "*" + i + "=" + c * i + " ");
		//			}
		//			System.out.println();
		//		}


		//		for(int i = 1 ; i <= 9; i++ ) {
		//			System.out.print(a + "*" + i + "=" + a*i + " " );
		//		}System.out.println();
		//		
		//		System.out.println("======구구단 반복문 (While문)");
		//		int i = 1;
		//		while (true ) {
		//			System.out.println("출력할 단을 입력해주세요 ==> ");
		//			int c = sc.nextInt();
		//			for (int j = 0; j < a; j++){
		//				System.out.print(c + "*" + i + "=" + c * i + " ");
		//			}
		//			System.out.println("반복을 종료(Y)");
		//			sc.nextLine();
		//			String answer = sc.nextLine();
		//			if(answer.equalsIgnoreCase("Y"))	// String == (불가)  & equalsIgnoreCase : 대문자 소문자 비교 안함, 둘다 가능하게 하는 함수
		//			break;
		//		}


		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("출력할 단을 입력해주세요 ==> ");
				int c = sc.nextInt();	// 출력 할 단
				for (int i = 1; i <= 9; i++) {
					System.out.print(c + "*" + i + "=" + i * c + " ");
			}
					System.out.println("반복을 종료(Y)");
					String answer = sc.next();
					if(answer.equalsIgnoreCase("Y"))  break;	// String == (불가)  & equalsIgnoreCase : 대문자 소문자 비교 안함, 둘다 가능하게 하는 함수
				}while(true);


sc.close();
		}





	}
