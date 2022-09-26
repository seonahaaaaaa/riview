package basic2;

import java.util.Scanner;

public class Ex04_369_02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		// 끝나는 숫자 입력
		
		for(int i = 1; i <= num; i++) {	
			int number = i;		// number : 1부터 num까지의 임의의 수
			boolean a = false;
			while(number != 0) {
				int su = number % 10;
				if(number == 3 || number ==6 || number==9)
					System.out.println("짝");
				a = true;
			}
			 number = number / 10;
		}
		
		sc.close();
		
	}

}
