class Student {
	String name;
	int age;
	
	Student(String name) {
		this.name = name;
	}
	Student(String name, int age) {
		this.name = name; this.age = age;
	}
	
	public boolean equals(Object obj) {// Object�������̵�		
		Student s = (Student)obj; //Student s = song1, Object�� name�������𸥴�
		if(this.name == s.name) {
			return true;
		}else {
			return false;
		}
	}
}
	public class Test2 {
	public static void main(String[] args) {
		
		Student song = new Student("�۱⼱",34);
		Student song1 = new Student("�۱⼱",34);
		System.out.println("song�� �ּ�: "+song);
		System.out.println("song1�� �ּ�: "+song1);
		System.out.println("=========================");
		
		System.out.println("����Ÿ���� �ּҸ��� ==");
		if(song == song1) {
			System.out.println("����");
		}else {
			System.out.println("Ʋ����");
		}
		System.out.println("����Ÿ���� ���� �� equals");
		if(song.equals(song1)) {
			System.out.println("����");
		}else {
			System.out.println("Ʋ����");
		}
	}
}
/*
song�� �ּ�: Student@7de26db8
song1�� �ּ�: Student@1175e2db
=========================
����Ÿ���� �ּҸ��� ==
Ʋ����
����Ÿ���� ���� �� equals
����
*/