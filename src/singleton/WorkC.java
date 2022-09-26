package singleton;

public class WorkC {
	
	DBConnect con;
	
	public WorkC() {
		//con = new DBConnect();
		con = DBConnect.getInstance();
	}

	public void use() {
		System.out.println("C 작업");
	}
}

/*
	1. 접근 지정자
		 - private : 해당 클래스 안에서 접근 가능 (괄호 안)
		 - public : 모든 접근 허용 (다른 클래스 내에서도 접근 가능)
		 - default : 해당 패키지에서만 접근 허용
		 - protected : 해당 패키지와 다른 패키지인 경우는 자식 클래스에만 허용

*/