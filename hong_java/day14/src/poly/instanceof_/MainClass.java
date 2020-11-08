package poly.instanceof_;

public class MainClass {
	
	public static void main(String[] args) {
		
		printPersonInfo(new Person("�߰���", 22));
		printPersonInfo(new Student("�踻��", 24, "44"));
		printPersonInfo(new Teacher("������", 33, "�丮"));
		printPersonInfo(new Employee("������", 21, "�ֹ�"));
//		printPersonInfo(new Person("�߰���", 22));

		
	}

	public static void printPersonInfo(Person p) {
		
		
		//P �ȿ��� �� ��üŸ�Ե��� ����, PersonŸ������ ���� Ÿ��Ȯ�����Ѵ�.
		//Person�ȿ��� �ڽ� Ÿ���� ����, �װ� �ڽ��� Ÿ�� Ȯ�ν� instanceof������
		if(p instanceof Student) {
			System.out.println("****** �л��� ���� *****");
		}else if (p instanceof Teacher) {
			System.out.println("****** �������� ���� *****");
		}else if (p instanceof Employee) {
			System.out.println("****** ������ ���� *****");
		}else {
			System.out.println("****** ����� ���� *****");
		}
		System.out.println(p.info());
	}
}