package basic2;

public class Ex05_2 {

	public static void main(String[] args) {

		int[] arr = new int[6];
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*45) + 1;	
		}	// for문 : 임의의 로또 6 번호를 출력하는 for문
		
		for(int i = arr.length -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {	// arr[j]와 arr[j+1]의 위치를 변경 / temp 값을 담아둘 변수 선언
					int temp = arr[j];	// temp에 arr[j] 값을 저장
					arr[j] = arr[j+1];	// 비어있는 arr[j]에 arr[j+1] 값을 저장
					arr[j+1] = temp;	// 비어있는 arr[j+1]에 arr[j] 값을 저장했던 temp를 저장 (교환 완료)
				}
			}
		} 	// for문 : 오름차순으로 정렬 (버블정렬)
		
		// 로또 값 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
