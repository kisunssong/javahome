
public class ObjEx18 {
	public static void main(String[] args) {
		
		String str01 = new String("java");
		String str02 = new String("java");
		
		if(str01 == str02) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(str01.equals(str02)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String pwd03 = "789";
		String pwd04 = "789";
		System.out.println(pwd03);
		System.out.println(pwd04);
		if(pwd03 == pwd04) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
