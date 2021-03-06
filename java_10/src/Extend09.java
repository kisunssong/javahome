class Point12 {
	protected int x = 10;
	protected int y = 20;
	
	public Point12() {}
	public Point12(int x, int y) {
		this.x=x; this.y=y;
	}
}
class Point13 extends Point12 {
	protected int z = 30;
	
	public Point13() {
		super(1000,2000); // 오버로딩 생성자
	}
	public Point13(int x, int y, int z) {
		this.x=x; this.y=y; this.z=z;
	}
	public void print() {
		System.out.printf("x:%d y:%d z:%d\n",x,y,z);
	}
}

public class Extend09 {
	public static void main(String[] args) {
		//오버로딩 생성자 Point12(int x=1000, int y=2000)매개변수 전달
		Point13 p1 = new Point13();
		p1.print();
		
		Point13 p2 = new Point13(3000,4000,5000);
		p2.print();
		
	}
}
