package lee.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		/*
		����) ���� ���� for�ݺ����� �����Ͽ� ���������� ��µǰ� �Ѵ�.
		������
		[1,1]
			[2,2]
				 [3,3]
		������ ���� for�ȿ� if else���ǹ��� Ȱ���ϰ� printf()�޼���� �ڸ��� ����
		ǥ���� �����ָ� �ȴ� 25�� �ݺ� �ڸ��� ǥ���� ������� �����ڷ� Ȱ���Ѵ�.%d��
		���� ���� ó�� (5�ڸ� ����ǥ���� ������ �����Ѵ�)
		 */		
		String a = "";
		int sum = 1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j > i || j <= i) {
					if(j == 1 && i == 1) {						
					}else {
						sum++;
						for(int empty=1; empty<sum; empty++) {
							System.out.printf("%5s",a);
						}	
					}			
				}
				System.out.printf("[%d,%d]",j+(i-1)*5,j+(i-1)*5);
				System.out.println();			
			}
		}
	}
}