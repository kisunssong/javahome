
public class Test1 {
	
	int a;
	int b;
	
	void guGuDan(int a, int b) {
		
		for(int i=a; i<=b; i++) {
			for(int j=a; j<=b; j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Test1 a = new Test1();
		a.guGuDan(2, 9);
		
	}
}
