
public class Date05 {
	public static void main(String[] args) {
		
		String s = "java.lang.Object";
		int idx1 = s.lastIndexOf('.');
		//'.'�� �� �����ʺ��� ã�Ƽ� ���� ���� ������ ��ġ��ȣ�� 
		//���ʺ��� ī��Ʈ �ؼ� ��ȯ. ù���� 0���� ���� : int 9 ��ȯ
		
		int idx2 = s.indexOf('.');
		//'.'�� ���ʺ��� ã�Ƽ� ������� ������ ��ġ��ȣ��
		//���ʺ��� ī��Ʈ �ؼ� ��ȯ. ù���� 0���� ���� : 4
		
		String s2 = "Hello";
		int length = s2.length();
		//���ڿ� ���̸� ��ȯ. ù���� 1���� ���� : 5
		
		String s3 = s2.replace("H", "C");
		//Hello���� H�� C�� ����(��ҹ��ڱ�����) : Cello
	}
}