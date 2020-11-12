/*
����) 1. com.naver.model ��Ű���� �����ؼ� �������̽��� IshapeClass�� �����
�߻� �޼���� void draw(); �� �����Ѵ�.
2. com.naver.model2�� ��Ű���� �����ϰ� ���� �������̽��� ���� ��ӹ���
�ڼ�Ŭ���� Circ,Rect,Tria�� �����. �׷����� pt�ҽ��� �����ؼ� ������ ���� 
��� ������� �ϼ�
*/
import com.naver.model.IShapeClass;
import com.naver.model2.Circ;
import com.naver.model2.Rect;
import com.naver.model2.Tria;
public class Ex19_01 {
	public static void main(String[] args) {
		
		IShapeClass a = new Circ();
		IShapeClass b = new Rect();
		IShapeClass c = new Tria();
		IShapeClass[] arr = {a,b,c};
		for(IShapeClass e : arr) {
			e.draw();
		}
	}
}