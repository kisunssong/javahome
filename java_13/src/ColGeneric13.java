import java.util.ArrayList;
import java.util.List;

/*
문제) 1. score배열을 List를 구현상속한 ArrayList를 활용해서 정수 숫자값만 저장가능한
컬렉션 제네릭 scoreList를 생성하자
2. 반복문을 활용하여 배열원소값을 컬렉션에 추가한 다음 정수 타입 총점과 실수 타입
평균을 구한다.
3. scoreList컬렉션을 활용해서 컬렉션 원소값에서 최대/최소값을 구하는 프로그램 완성
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
		System.out.println("총점: "+sum);
		System.out.println("평균: "+sum/(double)score.length);
		
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
