import java.util.Enumeration;
import java.util.Vector;

public class ColGeneric03 {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("=================");
// 생성자 오버로딩, 오토박싱, 업캐스팅
		
		for(int i=1; i<=3; i++) {
			v.add(new Integer(i*10));
		}
// java.util패키지의 Enumeration 컬렉션 인터페이스 특징)
// 1.jdk1.0에서 추가 되었고, 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오기 위해서 사용
// 저장용도로는 사용 안함
		Enumeration enu2 = v.elements();
		while(enu2.hasMoreElements()) { //boolean타입으로 반환
			System.out.println(" "+enu2.nextElement());
		}
//		System.out.println(enu2.nextElement());
	}
}


