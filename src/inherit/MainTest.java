package inherit;

public class MainTest {

	public static void main(String[] args) {

//		Umma u = new Umma();
//		u.job();
//		u.gene();
		
//		System.out.println("====상속 받은 딸 메소드 값 출력====");
//		Ddal d = new Ddal();
//		d.gene(); // Umma 메소드 : Ddal 메소드 내에서 Umma 메소드 수정함. (동일한 인자, 동일한 타입, 동일한 메소드명) 내에서만 수정 가능하다! = overriding
//		d.job();  // Umma 메소드 : Ddal 메소드 내에서 Umma 메소드 수정함. (동일한 인자, 동일한 타입, 동일한 메소드명) 내에서만 수정 가능하다! 
//		d.study(); // Ddal 메소드

		//Ddal d = new Umma();	// 자식 변수에 부모 객체 생성 불가.
		// 부모 변수에 자식 객체 생성 가능 : 
		//Umma u = new Ddal(); // 
		//u.gene();	// 오버라이딩 된 메소드 값이 있을 경우 상속 받은 클래스의 값을 불러온다. but 오버라이딩 되지 않았을시에 상속받은 클래스의 메소드는 불러올 수 없다.
					// 결론 : 오버라이딩 된 메소드만 불러올 수 있다. 불러올시 상속받은 클래스의 메소드 값을 불러오게 됨.
		//u.job();
	
		//Umma u = new Umma();
		//Ddal d = (Ddal)u;
		
		Ddal d = new Ddal();	// 딸 객체 생성 
		Umma u = (Umma)d;	// 딸 객체에서 엄마를 참조 (업캐스팅)
		Ddal d2 = (Ddal)u;	// 다운캐스팅
		
		
		
		
		
	}

}
