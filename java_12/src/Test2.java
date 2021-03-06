class Student {
	String name;
	int age;
	
	Student(String name) {
		this.name = name;
	}
	Student(String name, int age) {
		this.name = name; this.age = age;
	}
	
	public boolean equals(Object obj) {// Object오버라이딩		
		Student s = (Student)obj; //Student s = song1, Object는 name변수를모른다
		if(this.name == s.name) {
			return true;
		}else {
			return false;
		}
	}
}
	public class Test2 {
	public static void main(String[] args) {
		
		Student song = new Student("송기선",34);
		Student song1 = new Student("송기선",34);
		System.out.println("song의 주소: "+song);
		System.out.println("song1의 주소: "+song1);
		System.out.println("=========================");
		
		System.out.println("참조타입은 주소를비교 ==");
		if(song == song1) {
			System.out.println("같다");
		}else {
			System.out.println("틀리다");
		}
		System.out.println("참조타입은 값을 비교 equals");
		if(song.equals(song1)) {
			System.out.println("같다");
		}else {
			System.out.println("틀리다");
		}
	}
}
/*
song의 주소: Student@7de26db8
song1의 주소: Student@1175e2db
=========================
참조타입은 주소를비교 ==
틀리다
참조타입은 값을 비교 equals
같다
*/