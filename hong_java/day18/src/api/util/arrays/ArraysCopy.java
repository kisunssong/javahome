package api.util.arrays;

import java.util.Arrays;

public class ArraysCopy {
	
	public static void main(String[] args) {
		
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//arr1의 주소값을 > arr2로 대입했기때문에 arr1[0]만 바꿔도 같이바뀜
		//즉 사본이 아니다..
//		char[] arr2 = arr1;
//		arr1[0] = 'B';
		
		//이렇게하면 arr2배열 4개짜리char로 만들고
		//arr2[0] 번에 arr1[0]번을 대입 시켜라
		//복사가 되는거긴함.
//		char[] arr2 = new char[4];
//		arr2[0] = arr1[0];
//		arr2[1] = arr1[1];
//		arr2[2] = arr1[2];
//		arr2[3] = arr1[3];
		
		//arr1배열에 arr1길이 전부를 > arr2로
		//copy할배열(arr1), 길이(2) index0,1복사 : 즉 2번아래index까지
		char[] arr2 = Arrays.copyOf(arr1, 2);
//		arr2[2] = 'Z';
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//1번 index부터 3번 미만index까지 복사
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		// 1번 index부터 6번아래 index까지 복사
		int[] arr4 = {10, 20, 30, 40, 50, 60, 70, 80};
		int[] arr5 = Arrays.copyOfRange(arr4, 1, 6);
		System.out.println(Arrays.toString(arr5));
		
		
		
	}

}
