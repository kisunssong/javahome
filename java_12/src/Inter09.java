interface I {
	void play();
}

class B1 implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class C1 implements I {
	public void play() {
		System.out.println("play in C class");
	}	
}

class A1 {
	void autoPlay(I i) {
		i.play();
	}
}

//����)�Ű����� ������ ������ ����Ǹ� A2Ŭ������ ��ü a�� ������ ����
//autoPlay() �޼��带 ȣ���Ͽ� ��ĳ�����Ͽ� �������̵��� �޼��带 ȣ��
public class Inter09 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.autoPlay(new B1());
		a.autoPlay(new C1());
	}
}
