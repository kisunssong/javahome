import java.util.Enumeration;
import java.util.Vector;

public class ColGeneric03 {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("=================");
// ������ �����ε�, ����ڽ�, ��ĳ����
		
		for(int i=1; i<=3; i++) {
			v.add(new Integer(i*10));
		}
// java.util��Ű���� Enumeration �÷��� �������̽� Ư¡)
// 1.jdk1.0���� �߰� �Ǿ���, �÷��ǿ� ����� �������� ���Ұ��� ���� �о���� ���ؼ� ���
// ����뵵�δ� ��� ����
		Enumeration enu2 = v.elements();
		while(enu2.hasMoreElements()) { //booleanŸ������ ��ȯ
			System.out.println(" "+enu2.nextElement());
		}
//		System.out.println(enu2.nextElement());
	}
}

