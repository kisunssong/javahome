import java.util.Vector;

public class ColGeneric16 {
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<>();
		list.add("���");
		list.add("�ٳ���");
		list.add("������");
		
		Vector<? extends Object> objlist; //���׸�Ÿ�� ��ĳ������ �Ұ���?
		objlist = list;//���׸� Ÿ�԰��� ����ȯ�� �ȵȴ�.
		System.out.println(objlist); //<? extends Object>
	}
}