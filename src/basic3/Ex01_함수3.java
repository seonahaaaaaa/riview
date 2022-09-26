package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {
		int sum = 0;
		int[] result = add();	// a , b 값을 받아서 합산도 여기서 출력
		for(int i = 0; i < result.length; i++) {
			sum += result[i];
		}	System.out.println(sum);
		
	}
	
	static int[] add() {	// arr의 자료형은 int 가 아닌 int[] 배열문으로 동일하게 적어줘야함. 
		int a = 10; 
		int b = 20;
		int[] arr = {a,b};
		
		return arr;
		
		
	}

}
