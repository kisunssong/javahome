import java.util.LinkedList;
import java.util.Stack;

public class ColGeneric08 {
	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		myStack.push("1-java");
		myStack.push("2-oracle");
		myStack.push("3-jsp");
		
		while(!myStack.isEmpty()) { //isEmpty: ��������� true, ���������� false, boolean��ȯ
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
peek()�޼���� ť�� �� ���� ��ü�� ��ȯ�Ѵ�. �̶� ��ü�� ť���� �������� �ʴ´�.
�׸��� ť(�÷���)�� ��� �ִٸ� null�� ��ȯ�Ѵ�.
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