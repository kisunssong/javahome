class Point08 {
// super(); ������. ���������� �ְ����� objectŬ������ �⺻������ ȣ��
	protected int x = 10;
	protected int y = 20;
	
	public Point08() {
		System.out.println("���� Ŭ������ Point08 ������ ȣ��! ");
	}
}

class Point09 extends Point08 {
	
	public Point09() {
//		super(); // Point08 �θ�Ŭ���� �⺻������ ȣ��. ��������
		System.out.println("Point09 ������ ȣ��!");
	}
}

public class Extend07 {
	public static void main(String[] args) {
		
		Point09 p = new Point09();
	
	}
}