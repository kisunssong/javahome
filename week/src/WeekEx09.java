abstract class Shape09 {
	abstract void make();
}
class House extends Shape09 {
	void make() {
		System.out.println("집을 짓는다.");
	}
}
class Brideg extends Shape09 {
	void make() {
		System.out.println("다리를 건설한다.");
	}
}
class Building extends Shape09 {
	void make() {
		System.out.println("빌딩을 짓는다.");
	}
}
public class WeekEx09 {	
	 void print(Shape09 a) {
		a.make();
	}
	public static void main(String[] args) {
		
		House h = new House();
		Brideg br = new Brideg();
		Building bu = new Building();
		
		Shape09[] arr = {h,br,bu};
		System.out.println("====for문 출력 다형성====");
		for(Shape09 search : arr) {
			search.make();
		}
		System.out.println("====매개변수 호출 다형성====");
		WeekEx09 w = new WeekEx09();
		w.print(h);
		w.print(br);
		w.print(bu);
		
	}
}
