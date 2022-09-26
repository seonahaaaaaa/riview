package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {

		// 1. 스택	: 마지막에 들어간 값이 나중에 나감. ex) 익스플로어 => 접속한 사이트를 저장한 후 뒤로가기 누를시 가장 마지막에 접속한 사이트로 돌아감.
		
		Stack s = new Stack();	// 임포트 받아야 함.
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());
		
		// 2. 큐 : 선착순(먼저 들어간 값이 먼저 나감)
		
		Queue q = new LinkedList();	// interface : 추상 클래스 => 객체 생성 불가
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q.poll());
		
		
	}

}
