package basic1;

public class Ex02_ShortCircuitLogic2 {

	public static void main(String[] args) {

		int a = 3;
		
		if (a > 3 & ++a > 3) {
			System.out.println("조건만족");	// x
		}
		System.out.println("a = " + a);	// 3
		
		
		if(a > 1 | ++a > 3) {	// 숏서킷 : 
			System.out.println("조건만족2"); // O
		}  
		System.out.println("a = " + a); // 3
		
	}

}
