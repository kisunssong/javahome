
public class Date06 {
	public static void main(String[] args) {
		
		String animals = "dog,cat,beer";
		String[] arr = animals.split(",");
		//�����ڸ� �������� ���ڿ��� �и��ؼ� �迭�� ����

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			//dog
			//cat
			//beer
		}
		for(String animal : arr) {
			System.out.println(animal);
			//dog
			//cat
			//beer
		}
		String s = "java.lang.Object";
		String c = s.substring(10);
		//10������ ���. ù ���� ���� 0 : Object
		
		String p = s.substring(5, 9);
		//5������ 9�Ʒ����� ���. ù ���� ���� 0 : lang
		
		s = "OBJECT";
		String s1 = s.toLowerCase();
		//�ҹ��ڷ� �ٲ� : object
	}
}