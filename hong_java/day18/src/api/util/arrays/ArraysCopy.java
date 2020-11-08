package api.util.arrays;

import java.util.Arrays;

public class ArraysCopy {
	
	public static void main(String[] args) {
		
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//arr1�� �ּҰ��� > arr2�� �����߱⶧���� arr1[0]�� �ٲ㵵 ���̹ٲ�
		//�� �纻�� �ƴϴ�..
//		char[] arr2 = arr1;
//		arr1[0] = 'B';
		
		//�̷����ϸ� arr2�迭 4��¥��char�� �����
		//arr2[0] ���� arr1[0]���� ���� ���Ѷ�
		//���簡 �Ǵ°ű���.
//		char[] arr2 = new char[4];
//		arr2[0] = arr1[0];
//		arr2[1] = arr1[1];
//		arr2[2] = arr1[2];
//		arr2[3] = arr1[3];
		
		//arr1�迭�� arr1���� ���θ� > arr2��
		//copy�ҹ迭(arr1), ����(2) index0,1���� : �� 2���Ʒ�index����
		char[] arr2 = Arrays.copyOf(arr1, 2);
//		arr2[2] = 'Z';
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//1�� index���� 3�� �̸�index���� ����
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		// 1�� index���� 6���Ʒ� index���� ����
		int[] arr4 = {10, 20, 30, 40, 50, 60, 70, 80};
		int[] arr5 = Arrays.copyOfRange(arr4, 1, 6);
		System.out.println(Arrays.toString(arr5));
		
		
		
	}

}