package basic1;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02_control2 {

	public static void main(String[] args) {

		/*
		  우리대학의 학번은 총 10자리로 되어 있습니다.
		  맨 앞의 4자리는 입학년도이고 다섯번째 문자는 단과대 번호입니다.
		  1 : 공대
		  2 : 사회대
		  그 뒤의 2자리는 각 학과번호입니다.
		  공과대학인 경우는
		  11 : 컴퓨터학과 12 : 소프트웨어학과 13 : 모바일학과
		  22 : 자바학과 33 : 서버학과
		  사회대학인 경우는
		  11 : 사회학과 12 : 경영학과 13 : 경제학과
		  ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
		  ex) 2019 2 11 001 는 2019년도에 입학한 사회대 사회학과 학생입니다
		  ex) 2018 1 33 001 는 2018년도에 입학한 공대 서버학과 학생입니다
		 */  	
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int number = 0;		// 공대 & 사회대 구분 번호
		int classnumber = 0;	// 학과 번호
		
		Scanner sc = new Scanner(System.in);
		System.out.println("공대(1) & 사회대(2) 구분 번호를 입력하세요.");
		number = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("학과 번호를 입력하세요.");
		classnumber = sc2.nextInt();
		
		
		if (number == 1) {
			if (classnumber == 11) {		// 공대
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 공대 컴퓨터학과 학생입니다.");
			}else if(classnumber == 12) {
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 공대 소프트웨어학과 학생입니다.");
			}else if(classnumber == 13){
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 공대 모바일학과 학생입니다.");
			}else if(classnumber == 22){
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 공대 자바학과 학생입니다.");
			}else if(classnumber == 33){
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 공대 서버학과 학생입니다.");
			}
			
		}//if
		else if (number == 2)	{		// 사회대
			if (classnumber == 11) {
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 사회대 사회학과 학생입니다.");
			}else if (classnumber == 12) {
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 사회대 경영학과 학생입니다.");
			}else if (classnumber == 13) {
				System.out.println(Integer.toString(year) + Integer.toString(number) + Integer.toString(classnumber) + "001" + "는 " + year + "년도에 입학한 사회대 경제학과 학생입니다.");
			}
		}//else if
 }
}