
public class Date07 {
	public static void main(String[] args) {
		
		String s = " Hello Java ";
		int a = s.length();
		//���ڿ� ���� ��ȯ. ���� ����. ù ���� ���� 1 : 12
		int length = s.trim().length();
		System.out.println(length);
		//trim()���� ������ �����ϰ� length()���� ��ȯ : 10
		
		String fullName = "Hello.java";
		int index = fullName.indexOf('.');
		//'.'���Ϲ��ڸ� �� ���ʺ��� ã�Ƽ� ���� ���� ������ ���� 
		//�������� ���ʺ��� ī��Ʈ�ؼ� ��ȯ ù ���� ���� 0 : 5
		
		String b = "Hello.java";
		int index1 = b.indexOf('.');
		String b1 = b.substring(0,index1);
		//index1 ���ʱ��� '.'���� : 5
		//b1 0����, 5 �ٷ� �Ʒ����� : Hello
		
		int index2 = b.indexOf('j');
		String b2 = b.substring(index1+1);
		String b3 = b.substring(index2);
		//index1 : 5+1 = 6 ������ ��� : java
		//index2 : j = 6 ������ ��� : java
		
	}
}