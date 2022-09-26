package basic3;

import java.util.Scanner;

public class Test_Method3 {

	public static void main(String[] args) {
		// (문제 3) 
		   // multiple 메소드 만들기
		  // - 2개의 int 인자인 경우는 곱셈 계산 한 결과를 출력
		  // - 1개의 int 인자와 1개의 char 인자인 경우는 int 인자 수 만큼 char 인자 문자를 출력   ex) multiple ( 4, 'ㅋ' ) 호출        [출력결과]  ㅋㅋㅋㅋ
		  // - 2개의 int 인자와 1개의 char 인자인 경우는 char 인자 문자를 n * m 형식의 행과 열로 출력 
			// 총 불러와야하는 인자는 정수 2개 문자열 1개
		
		int a = 0;
		int b = 0;
		String ch = " ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 의 값을 입력하세요 ==> ");
		a = sc.nextInt(); 
		b = sc.nextInt();
		System.out.println("문자를 입력하세요 ==> ");
		ch = sc.next();
		char c = ch.charAt(0);
		sc.close();
		
	}
	
	static void multiple (int a , int b) {
		System.out.println(a * b);
	}
	
	static void multiple (int a , char ch) {
		for(int i = 0; i <= a ; i++ ) {
			System.out.println(ch);
			
		}
	}
	
		
	}
	

