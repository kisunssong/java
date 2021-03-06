import java.util.LinkedList;
import java.util.Stack;

public class ColGeneric08 {
	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		myStack.push("1-java");
		myStack.push("2-oracle");
		myStack.push("3-jsp");
		
		while(!myStack.isEmpty()) { //isEmpty: 비어있으면 true, 내용있으면 false, boolean반환
			System.out.println(myStack.pop());
		}
		System.out.println("===================");
		
		LinkedList myQue = new LinkedList();
		myQue.offer("1-java");
		myQue.offer("2-oracle");
		myQue.offer("3-jsp");
		
		while(myQue.peek() != null) {
			System.out.println(myQue.poll());
		}
/*
peek()메서드는 큐의 맨 위의 객체를 반환한다. 이때 객체를 큐에서 제거하지 않는다.
그리고 큐(컬렉션)이 비어 있다면 null을 반환한다.
*/
	}
}
/*
3-jsp
2-oracle
1-java
===================
1-java
2-oracle
3-jsp
*/