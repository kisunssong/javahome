/*
����1) IShapeClass, Circ, Rect, Tria �� Ȱ���ؼ� �Ű����� ������ ����������
�Ͽ� ������ ���� ��� ������� ������.
���)  ���� �׸���. �簢���� �׸���. �ﰢ���� �׸���.
������ ������ static void pr(�θ��������̽�Ÿ�� �Ű�������)�� Ȱ���ؼ�
������ ������ �����Ѵ�.

����2) ���� �������̽��� Ȱ���ؼ� �迭ũ�Ⱑ 3�� arr�迭�� ������ ����
�ݺ����� Ȱ���Ͽ� ���� ������� �������.
*/
import com.naver.model.*;
import com.naver.model2.*;
public class Ex19_012 {
	static void pr(IShapeClass i) {
		i.draw();
	}
	
	public static void main(String[] args) {
		
		pr(new Circ());
		pr(new Rect());
		pr(new Tria());
		System.out.println("for");
		IShapeClass[] arr = {new Circ(), new Rect(), new Tria()};
		for(IShapeClass e : arr) {
			e.draw();
		}
	}
}