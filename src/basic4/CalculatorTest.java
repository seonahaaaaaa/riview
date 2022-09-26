package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		CalculatorExpr c = new CalculatorExpr();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 ==> ");
			int a = sc.nextInt();
			c.setNum1(a);
			System.out.print("두번째 숫자를 입력하세요 ==> ");
			int b = sc.nextInt();
			c.setNum2(b);
			System.out.println("추출 된 숫자 : "+ a + " , " + b );
			System.out.println("덧셈 : " + c.getAddition());
			System.out.println("뺄셈 : " + c.getSubtraction());
			System.out.println("곱셈 : " + c.getMultplication());
			System.out.println("나눗셈 : " + c.getDivision());
			System.out.println();
			
			System.out.println("종료하시겠습니까 Y/N");
			if(sc.next().equals("N")) break;
			
		}
																																																																															
	}
}