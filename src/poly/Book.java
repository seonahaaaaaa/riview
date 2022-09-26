package poly;

public class Book extends Item {

	private String author; // 필드 프라이빗 지정하여 값이 고정되게끔 (캡슐화) 
	private String ph;
	
	public Book() {
		this("000" , "제목없음" , "무명" , "인터넷"); 	// 기본 생성자가 아닌 인자있는 생성자가 먼저 출력되는 이유
		System.out.println("기본 생성자");				//  : this 구문에서 대입 할 매개변수를 찾아서 인자 있는 생성자로 내려가서 this 적은 값을 대입하게 되어 인자있는 생성자 구문이 먼저 생성 되고 해당 부분이 먼저 실행된 후
													//     this가 대입하고 기본생성자 출력문이 출력되게 됨.
	}
	public Book(String number , String tittle, String author , String ph) {
//		super.number = number;
//		super.tittle = tittle;
		super(number , tittle);
		
		this.author = author;
		this.ph = ph;
		System.out.println("인자 있는 생성자");
	}
	
	public void output() {
		System.out.println(number);
		System.out.println(tittle);
			System.out.println(author);
			System.out.println(ph);
	}

}
