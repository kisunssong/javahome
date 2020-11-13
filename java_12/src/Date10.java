import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date10 {
	public static void main(String[] args) {
		
		String[] data = {"bat","bady","cA","ca","co","c.","c0","car","date"};
		
		Pattern p = Pattern.compile("c[a-z]*");
		//����ǥ���� ��ȣ c[a-z]* �� ���� c�����ڷ� ���۵Ǵ� ���� �ҹ��ڴܾ�
		
		for(String str : data) {
			Matcher m = p.matcher(str);
			if(m.matches()) {
				//����ǥ���Ŀ� �´� ���� ������ ��
				System.out.printf(" "+str);
			}
		}
		System.out.println("==============================");
		
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source,",");
		
		while(st.hasMoreTokens()) { //�и��� ��ū ���ڿ��� �ִٸ� ��
			System.out.println(" "+st.nextToken());
			//���� ��ū ���ڿ����� �����ͼ� ���
		}
//		System.out.println(" "+st.nextToken());
		//java.util.NoSuchElementException����
		//�и��� ��ū�� �ѹ� ����ϸ� ���̻� ������. ��ū�� �ٽ� �и��ؾ���
		
	}
}