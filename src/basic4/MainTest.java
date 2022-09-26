package basic4;

public class MainTest {

	public static void main(String[] args) {

		// 값 지정 1 - setter
		Student s = new Student(); // 객체 생성 필수 : Heap 영역에 저장 될 데이터 공간이 없어서 생성 필수.

		// 필드 선언 (getter setter 변수명 대문자로 시작 source )
		s.setName("홍길동");
//		s.setKor(100);
//		s.setEng(30);
//		s.setMath(55);
		
		
		
		// 값 지정 2 - 생성자
		//Student s = new Student("홍길자" , 99 ,88, 66);
		
		
		s.calTotal(); // 총합 계산 메소드
		s.calAvg(); // 평균 계산 메소드
		//  s.total = 0;
		s.output(); // 출력 메소드
	}

}
/* 30명 정보를 저장
 * 학번 (String)
 * 이름  (String)
 * 국어점수 (int)
 * 영어점수 (int)
 * 수학점수 (int)
 * 총점  (int)
 * 평균 (double)
 */

/*	[1] 배열 : 동일한 자료형인 경우
*   	int []kor = new int[30];
*   	int []eng  = new int[30];
* 
*  [2] 구조체 : 서로 다른 자료형인 경우
* 		=> 자바에 없음
* 
*  [3] 클래스 : 서로 다른 자료형들 + 메소드 (함수)
*  
*  
*/

/*
 * 클래스의 멤버변수에 값을 지정 방식
 * [1] setter
 * 
 * [2] constructoir (생성자 함수) : 클래스의 멤버변수 초기화
 * 								- 리턴형이 없다. A () {} => 기본 생성자
 * 								- 클래스명과 동일해야함
 * 
 * 
 * 	int a;   ==> 메모리 확보 (변수선언)
 *  a = 10;  ==> 값 지정 
 *  int a = 10 ==> 초기화
 * 
 * 
 */

