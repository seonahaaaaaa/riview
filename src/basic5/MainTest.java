package basic5;

public class MainTest {

	public static void main(String[] args) {

		// b1 = 스택공간 (heap 영역의 번지수를 가리킴)
		// heap : Book 이라는 데이터 안에 count 변수가 생성되며 초기화 된 값이 들어옴, 생성자 호출 시 count++ 됨 
		// static (공유공간 : count 변수의 데이터 값이 스택에 저장되어 다른 객체와 해당 값이 공유됨 : 스택 & 힙 과 별개의 공간에 static 공간이 생김, 
		
//		Book b1 =new Book();
//		System.out.println("총 갯수 : " + b1.getCount());
//		
//		Book b2 =new Book();
//		System.out.println("총 갯수 : " + b2.getCount());
//		
//		Book b3 =new Book();
//		System.out.println("총 갯수 : " + b3.getCount());
		
		System.out.println("총 갯수 : " + Book.getCount());
		
		
	}

}
