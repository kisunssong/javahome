class TestClass14 {
	private Object value;
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}	
}


public class ColGeneric14 {
	public static void main(String[] args) {
		TestClass14 obj01 = new TestClass14();
		obj01.setValue(10); // ����ڽ̰� ��ĳ����
		System.out.println("��ȯ��: "+obj01.getValue());
		
		obj01.setValue(10.3); //����ڽ̰� ��ĳ����
		System.out.println("��ȯ��: "+obj01.getValue());
		
		obj01.setValue("apple"); //���ڿ� String����Ÿ���̹Ƿ� ����ڽ̹����� ����
		//�ϰ� ��ĳ���ø� ��.
		
		/*
		 * ���� instanceof �����ڸ� �߰��Ѵ�.
		 */
		
		if(obj01.getValue() instanceof String) {
			//return���� ObjectŸ���̶� String���� �ٿ�����ȯ ��������..�Ǹ� true
			String temp = (String)obj01.getValue(); 
			System.out.println("�ȴ�");
			System.out.println("�����빮��: "+temp.toUpperCase());
		}else {
			System.out.println("�ȵȴ�");
		}
		 //������ ��ĳ������ �Ѱ��� ���ؼ� ��������
		//�ٿ�ĳ����
	}
}