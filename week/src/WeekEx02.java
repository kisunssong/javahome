//�������̵� ��Ģ
//��Ӱ��迡�� �θ�Ŭ���� �޼����̸�,��ȯŸ��,�Ű�����Ÿ�� ���� ��� �����ؾ���
class Father02 {
	void f02() {
		System.out.println("�θ�Ŭ���� f02() �޼���");
	}
}
class Child02 extends Father02 {
	void f02() {
		System.out.println("�ڽ�Ŭ���� f02() �޼���");
	}
}

public class WeekEx02 {
	public static void main(String[] args) {
		Child02 ch = new Child02();
		System.out.printf("�ڽ��� ȣ��: ");
		ch.f02();
		
		Father02 fa = new Father02();
		System.out.printf("�θ� ȣ��: ");
		fa.f02();
		
	}
}