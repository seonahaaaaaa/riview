
package c_collection;

import java.util.ArrayList;

class aArrayListEx1 {
	public static void main(String[] args) {

		ArrayList result = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

	static ArrayList dataSet() {
		String name = "김태희";
		int age = 31;
		double height = 162.3;

		ArrayList list = new ArrayList(); // 배열에 저장 할 값의 갯수가 명확하지 않을때 : ArrayList는 데이터를 많이 차지하기 때문에 값의 갯수를 알때는 사용하지 않고
											// 배열 사용
		list.add(name); // 메모리 공간의 값(배열의 index) 과 저장 할 값이 달라도 그대로 출력됨. ==> 메모리 공간에 몇 개를 지정할지 잘 기재
						// 안함.(의미가 없기 때문)
		list.add(age);
		list.add(height);

		return list;

	}
}
