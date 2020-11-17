import java.util.ArrayList;
import java.util.List;

/*
����) 1. score�迭�� List�� ��������� ArrayList�� Ȱ���ؼ� ���� ���ڰ��� ���尡����
�÷��� ���׸� scoreList�� ��������
2. �ݺ����� Ȱ���Ͽ� �迭���Ұ��� �÷��ǿ� �߰��� ���� ���� Ÿ�� ������ �Ǽ� Ÿ��
����� ���Ѵ�.
3. scoreList�÷����� Ȱ���ؼ� �÷��� ���Ұ����� �ִ�/�ּҰ��� ���ϴ� ���α׷� �ϼ�
 */
public class ColGeneric13 {
	public static void main(String[] args) {

		int[] score = {100,90,80,90,80};

		int sum = 0;
		
		List<Integer> scoreList = new ArrayList<>();
		for(int i=0; i<score.length; i++) {
			scoreList.add(score[i]);
			sum += scoreList.get(i);
		}
		System.out.println("����: "+sum);
		System.out.println("���: "+sum/(double)score.length);
		
		int big = scoreList.get(0);
		int small = scoreList.get(0);
		for(int i=0; i<scoreList.size(); i++) {
			if(small > scoreList.get(i)) {
				small = scoreList.get(i);
			}else if(big < scoreList.get(i)) {
				big = scoreList.get(i);
			}
		}
		System.out.println(small);
		System.out.println(big);
		System.out.println("=======================");
	}
}