class Animal {
	
	protected String kind; //종류
	protected int leg; //걷는다
	public Animal() {}
	public Animal(String kind, int leg) {
		this.kind=kind; this.leg=leg;
	}
	public void getKind() {
		if(kind.equals("강아지")) {
			System.out.println(kind+"는 동물이다.");
		}else {
			System.out.println(kind+"는 사람이다");
		}
	}
	public void walk() {
		if(leg == 4) {
			System.out.println(kind+"는 "+leg+"발로 걷는다");
		}else {
			System.out.println(kind+"는 "+leg+"발로 걷는다");
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
		Dog d = new Dog("강아지",4);
		d.getKind();
		d.walk();
		Human h = new Human("소녀",2);
		h.getKind();
		h.walk();
	}
}
