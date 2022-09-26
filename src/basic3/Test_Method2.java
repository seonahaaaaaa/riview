package basic3;

import java.util.Scanner;

public class Test_Method2 {

	public static void main(String[] args) {
		//(문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
		//함수명 : checkUpper
		//인자 : char
		//리턴(반환) : char

		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 소문자를 입력하세요 ==> ");
		
		String spell = sc.next(); // 영문자를 입력
		char ch = spell.charAt(0); // 입력한 String 값을 char로 변환 후 ch 에 저장
		System.out.println(ch);	// 저장 값 확인
		System.out.println(checkUpper(ch));
		sc.close();
	}

	static char checkUpper(char ch) {
		if (ch >= 97 && ch <= 122) {
			return (char)(ch - 32);	// 소문자를 대문자로
		} else {
			return (char)(ch + 32);	// 대문자를 소문자로
		}
		
	} 

}
