class Parent05 {
	void p05() {
		System.out.println("����Ŭ���� �޼��� p05()");
	}
}
class Child05 extends Parent05 {

	void p05() {
		super.p05(); //����Ŭ���� �޼��带 ���� ȣ��
		System.out.println("�ڼ�Ŭ������ �´� ���� ����");
	}
	void ch05() {
		System.out.println("�ڼ�Ŭ���� �޼��� ch05");
	}
}

public class Extend05 {
	public static void main(String[] args) {
		Child05 c = new Child05();
		c.p05();	
		c.ch05();
	}
}