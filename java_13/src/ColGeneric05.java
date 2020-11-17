import java.util.ArrayList;
import java.util.ListIterator;

/*
java.util��Ű���� �÷��� ListIterator �������̽� Ư¡)
1. jdk1.2���� �߰�, Iterator�������̽��� ��ӹ���
2. ������, ������, ����� ��� ������ ���� ����, �÷��� List�������̽��� ������ �ڼ�
������ ����ؾ� �Ѵ�.
*/
public class ColGeneric05 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		ListIterator it = list.listIterator();
		
		//������ ���
		while(it.hasNext()) { //�������Ұ� �ִٸ� ��
			System.out.println(" "+it.next());
		}
		System.out.println("===============");
		
		//������ ���
		while(it.hasPrevious()) {
			System.out.println(" "+it.previous());
		}
	}
}