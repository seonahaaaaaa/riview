package basic1;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02_control3 {

	public static void main(String[] args) {

		/*
		 * 우리대학의 학번은 총 10자리로 되어 있습니다. 맨 앞의 4자리는 입학년도이고 다섯번째 문자는 단과대 번호입니다. 1 : 공대 2 :
		 * 사회대 그 뒤의 2자리는 각 학과번호입니다. 공과대학인 경우는 11 : 컴퓨터학과 12 : 소프트웨어학과 13 : 모바일학과 22 :
		 * 자바학과 33 : 서버학과 사회대학인 경우는 11 : 사회학과 12 : 경영학과 13 : 경제학과 ex) 2017 1 11001 는
		 * 2017년도에 입학한 공대 컴퓨터학과 학생입니다 ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다 ex)
		 * 2018 1 33 001 는 2018년도에 입학한 공대 서버학과 학생입니다
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력하세요.");
		String studentId = sc.nextLine();

		String classname = null;
		String a = null;
		String year = studentId.substring(0, 4);
		String classnumber = studentId.substring(5, 7);
		char number = studentId.charAt(4); // 공대 사회대 구분번호

		if (number == '1') {
			classname = "공대";
			switch (classnumber) {
			case "11":
				a = "컴퓨터학과";
				break;
			case "12":
				a = "소프트웨어학과";
				break;
			case "13":
				a = "모바일학과";
				break;
			case "22":
				a = "자바학과";
				break;
			case "33":
				a = "서버학과";
				break;
			}
		} else if (number == '2') {
			classname = "사회대";
			switch (classnumber) {
			case "11":
				a = "사회학과";
				break;
			case "12":
				a = "경영학과";
				break;
			case "13":
				a = "경제학과";
				break;
			}
			System.out.println(studentId + "는 " + year + "년도에 입학한 " + classname + " " + a + "과 학생입니다.");
		}

	}
}