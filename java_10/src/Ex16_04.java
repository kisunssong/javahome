class Animal {
	
	protected String kind; //����
	protected int leg; //�ȴ´�
	public Animal() {}
	public Animal(String kind, int leg) {
		this.kind=kind; this.leg=leg;
	}
	public void getKind() {
		if(kind.equals("������")) {
			System.out.println(kind+"�� �����̴�.");
		}else {
			System.out.println(kind+"�� ����̴�");
		}
	}
	public void walk() {
		if(leg == 4) {
			System.out.println(kind+"�� "+leg+"�߷� �ȴ´�");
		}else {
			System.out.println(kind+"�� "+leg+"�߷� �ȴ´�");
		}
	}
}//Animal
class Dog extends Animal{
	
	String name;
	public Dog() {	
	}
	public Dog(String kind, int leg) {		
		super(kind,leg);
	}

}//Dog
class Human extends Animal{
	
	public Human() {		
	}
	public Human(String kind, int leg) {
		super(kind,leg);
	}
}//Human

public class Ex16_04 {
	public static void main(String[] args) {
		Dog d = new Dog("������",4);
		d.getKind();
		d.walk();
		Human h = new Human("�ҳ�",2);
		h.getKind();
		h.walk();
	}
}