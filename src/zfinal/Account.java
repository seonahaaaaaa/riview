package zfinal;

import java.util.Scanner;

public class Account {

	String name; // 예금주
	String account; // 계좌
	int money; // 잔액

	Account() {
	} // 기본생성자
	
	public void out(int outmoney) { // 인출 메소드 : 인출 할 금액을 받고 잔액이 부족시에는 "잔액이 부족합니다" 라는 메세지를 잔액이 충분할때는 인출한 금액을 출력하는 메소드
		if (money - outmoney < 0) {
			System.out.println("잔액이 부족합니다.");
		} else {
			System.out.println("인출한 금액 : " + outmoney);
		}
	}

	public void in(int inmoney) { // 입금 메소드 : 인자로 입금 할 금액을 받고 입금액을 잔액에 더하여 입금한 금액을 출력하는 메소드
		inmoney += money;
		System.out.println("입금 할 금액 : " + inmoney);
	}

	@Override
	public String toString() {
		return "예금주 : " + name + "," + " 계좌번호 : " + account + "," + " 잔액 : " + money;
	}

	public static void main(String[] args) {

		Account ac = new Account();
		ac.money = 1000;
		ac.name = "홍길동";
		ac.account = "1234-5678";
		ac.out(800);
		ac.in(1500);
		System.out.println(ac.toString());
		
	}

}
