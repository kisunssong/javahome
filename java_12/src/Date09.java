
import java.util.Random;
public class Date09 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Random rand2 = new Random();
		//Random클래스는 임의의 수 난수를 얻을 수 있다
		//임시비번 같은 것을 구할 때 사용
		
		for(int i=0; i<5; i++) {
			System.out.println(i+" : "+rand.nextInt());
			//int타입 범위의 난수 발생
		}
		System.out.println("============");
		
		System.out.println("두번째 난수 발생: ");
		for(int i=1; i<=5; i++) {
			System.out.println(i+" = "+rand2.nextInt());
			//int타입 범위의 난수 발생
		}
	}
}
