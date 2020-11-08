package api.lang.sb;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder ("Java ");
		
		//���ڿ��� �� ���� �߰��ϴ� �޼��� append()
		//�ϳ��� ��ü ������ �����ϸ羴��
		sb.append("Program Study");
		System.out.println(sb);
		
		//��ü�� 2���� java����, java + program study ����
		String str = "Java ";
		str = str + "Program Study";
		System.out.println(str);
		
		//���ڿ��� Ư�� �ε��� ��ġ�� �����ϴ� �޼��� insert()
		//12�� �ε����� ming�� ����
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//5�� �ε��� ���� 16���̸�! ���̿� Book���� ��ü
		sb.replace(5, 16, "Book");
		System.out.println(sb);
		
		//���ڿ��� �����ϴ� �޼���delete(begin, end)
		//4�� �ε������� 9���ε����̸�! ���� ����
		sb.delete(4, 9);
		System.out.println(sb);
		
		//length ������ 1���� �ؼ� �������� �? (�ε����� 0����)
		System.out.println(sb.length());
	}
}