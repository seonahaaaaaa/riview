package c_collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<String, String>();	// HashMap : 데이터를 키와 값의 쌍으로 저장 : 순서 X , 중복 ( 키(id) 중복 X , 값(pwd) 중복 O)
		map.put("javassem", "1111");
		map.put("javassem", "1234"); // 위의 javassem/1111을 덮어버림?
		map.put("kimssem", "1234");
		map.put("kimjava", "9999");
		map.put("kimbabo", "1234");

		boolean stop = false;
		while (!stop) {
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디 -> ");
			String id = input.nextLine();
			System.out.print("패스워드 -> ");
			String pass = input.nextLine();

			// 1-1. 입력받은 id가 map에서 key 부분에 해당되는 것이 있다면
			if (map.containsKey(id)) {	// 맵에서 키나 값이 있는지 확인하는 함수
				if (map.get(id).equals(pass)) {	// 파라미터로 입력받은 값이 Map에 존재하면, 입력받은 값을 리턴하고, 만약 파라미터로 입력받은 값이 Map에 존재하지 않으면, null을 리턴합니다.
					System.out.println("로그인 성공");
					stop = true;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;

				}

			} else {
				System.out.println("존재하지 않는 아이디입니다.");
				continue;
			}
			// 2-1. 그 아이디와 같은 key의 value값과 입력받은 패스워드가 같다면 로그인 성공

			// 2-2. 패스워드가 다르다면 출력

			// 1-2. 없다면 해당하는 아이디 없다고 출력

		}
	}
}
