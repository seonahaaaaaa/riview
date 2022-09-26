package basic4;

public class Student {

	// 클래스에서 객체 생성시에 해당 값들이 Heap 영역에 초기화 되어 저장됨.
	private String hakbun; // 학번은 고정값으로 String 사용
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;

	// 기본 생성자 필수로 만들기
	public Student() { // 오버로딩 : 생성자 명 동일( 생성자 내에 들어가는 매개변수와 데이터 타입이 다른 경우 )
		// this.name = "이름없음";
		// this.kor = 50;
		// this.eng = 50;
		// this.math = 50;
		this("이름없음", 50, 50, 50);	// 무조건 첫 라인에 존재해야함 : 생성자가 내에 생성자명을 호출 할 수 없기때문에 this를 생성자명으로 지칭하여 사용.
		// MainTest 내에 생성한 객체에서 호출 1)
		System.out.println("기본 생성자"); // 7)
	}

	public Student(String name, int kor, int eng, int math) {
		//2)
		this.name = name; // 필드 호출시 this. 사용하여 지역변수와 구분
		//3)
		this.eng = eng;
		//4)
		this.kor = kor;
		//5)
		this.math = math;
		//6)
		System.out.println("인자 있는 생성자");

	}

	// getter setter : 권한을 줄이기 위하여.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // this. : 필드를 지칭하기 위해
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void calTotal() {
		total = kor + eng + math;
	}

	public void calAvg() {
		avg = total / 3;
	}

	public void output() {
		System.out.println(name + "님 성적 : " + total + " / " + avg);
	}

}

/*
 * 캡슐화 - 멤버 변수(field) : private - 멤버 메소드 : public
 */
