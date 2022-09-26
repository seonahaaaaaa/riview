package zfinal;

import java.util.Calendar;

public class TestAge {

	public static void main(String[] args) {

		int birthyear = 1996; // 태어난 년도
		int age = 0; // 나이
		int year = 0; // 현재년도

		Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR); 
		age = year - birthyear + 1;

		System.out.println("나이는 : " + age + "살");
		System.out.println("현재 년도는 : " + year);
	}

}
