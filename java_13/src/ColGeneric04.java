import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColGeneric04 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		for(int i=1; i<=5; i++) {
			list.add(i); // ���������� ����ڽ̰� ��ĳ���� �Ǹ鼭 �����.
		}
/*
java.util��Ű���� Iterator�÷��� �������̽� Ư¡)
1.jdk1.2���� �߰��Ǿ���, �÷��ǿ� ����� �������� ���Ұ��� ������ �������� �о��.
*/
		
		Iterator list1 = list.iterator();
		while(list1.hasNext()) { // booleanŸ������ ��ȯ
			System.out.println(list1.next());
		}
	}
}