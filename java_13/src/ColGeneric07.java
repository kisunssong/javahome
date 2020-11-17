import java.util.Enumeration;
import java.util.Vector;

public class ColGeneric07 {
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		double[] arr = new double[] {38.6,9.2,45.3,6.1,4.7,1.6};
		
		for(int i=0; i<arr.length; i++) {
			vec.add(arr[i]);
			System.out.printf(vec.get(i)+" ");
			//38.6 9.2 45.3 6.1 4.7 1.6 
		}
		System.out.println();
		System.out.println("����ũ��: "+vec.size());
		//����ũ��: 6
		
		System.out.println("===Enumeration ����ؼ� ���� �� ��������===");
		Enumeration en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement());
			//38.69.245.36.14.71.6
		}
		System.out.println();
		System.out.println("==================================");
		double findData=6.1;
		//�ش���Ұ��� ���ͷκ��� ã�Ƽ� ��ġ��ȣ����ȯ, ������ -1 ��ȯ
		int index = vec.indexOf(findData);
		
		if(index != -1) {
			System.out.println("���� index: "+index);
			//���� index: 3
		}else {
			System.out.println("���� index: "+index);
		}
		
		double delData=45.3;
		if(vec.contains(delData)) {
			vec.remove(delData);
			System.out.println("���� index: "+delData);
			//���� index: 45.3
		}
		
		for(int i=0; i<vec.size(); i++) {
			System.out.print(vec.get(i)+" ");
			//38.6 9.2 6.1 4.7 1.6 
		}
		
	}
}
