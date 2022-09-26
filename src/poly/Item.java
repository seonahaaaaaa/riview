package poly;

abstract public class Item {

	protected String number; // 상속 받은 자식 클래스만 값을 수정 할 수 있게끔 protected로 지정 : 자식에게만 권한 허용
	protected String tittle; // private 는 상속 받아도 부모 클래스밖에 수정 불가하다.
	
	public Item() {
	}

	public Item(String number , String tittle) {
		this.number = number;
		this.tittle = tittle;
	}
	abstract public void output() ;
	

}

/*
	abstract : 미완성 : 미완성인 클래스에서는 객체 생성 불가능
	
		'method : overriding 의 강제성 => 다형성
		'class : method 중에 하나라도 abstract
		
	final : 변경불가 (오버라이딩을 불가하게 하는 것)
	
		'field :
		'method :
		'class : 

*/