
import java.util.StringTokenizer;
public class ObjEx20 {
	public static void main(String[] args) {
		
		String phone="010-777-9999";
		StringTokenizer ph = new StringTokenizer(phone,"-");
/*
1. - �����ڸ� �������� ����ȣ�� �и��Ѵ�. �и��� ����ȣ�� ��ū ���ڿ��̶�� �Ѵ�.
2. ������Ʈ ���߿��� ȸ������ ����â���� ���� Ȱ��ȴ�.
3. 010(0)777(1)9999(3) index�� ��������
*/
		
		String ph01 = ph.nextToken();//ù��° �и��� ����ȣ
		String ph02 = ph.nextToken();//�ι�° �и��� ����ȣ
		String ph03 = ph.nextToken();//����° �и��� ����ȣ
		
		System.out.println("ù��° ����ȣ: "+ph01);
		System.out.println("�ι�° ����ȣ: "+ph02);
		System.out.println("����° ����ȣ: "+ph03);
	}
}
/*
ù��° ����ȣ: 010
�ι�° ����ȣ: 777
����° ����ȣ: 9999
*/