import java.util.Calendar;

public class Date01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH+1);//1���� 0���� ��ȯ�ؼ�+1
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d�� %d�� %d��\n",year,month,date);
		System.out.printf("%d�� %d�� %d��",hour,minute,second);
	}
}
/*
2020�� 46�� 13��
9�� 25�� 52��
*/