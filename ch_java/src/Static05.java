
public class Static05 {
	
	static {
		//정적변수 초기화 블록({}),클래스 초기화 블록이라고도 한다. 클래스
		//초기화 블록은 해당 클래스가 메모리에 처음으로 로딩되어 실행될때 딱 한번만 
		//수행된다. 클래스가 실행될때 정적변수들이 자동으로 함께 메모리ㅣ에 만들어
		//지고, 곧바로 클래스 초기화 블록이 정적변수들을 초기화 하게 된다.
		System.out.println("static{}");
		
		
	}
	{
/*
인스턴스 변수 초기화 블록이다. 인스턴스 초기화 블록은 생성자와 같이 객체가 생성될때
마다 수행된다. 그리고 생성자 보다 먼저 수행된다. 인스턴스 변수 초기화는 주로 생성자를
사용하고, 인스턴스 변수 초기화 블럭은 모든 생성자에서 공통적으로 수행되어져야 하는코드
를 넣는데 사용한다.	 
*/
		System.out.println("{}");
	}
	public Static05() {
		System.out.println("기본생성자");
	}
	
	
	public static void main(String[] args) {
		new Static05(); //기본생성자를 호출하지만 먼저 인스턴스 초기화 블럭이 먼저실행
		new Static05();
		
/*
메모리 로딩 실행 순서)
1. 해당 클래스가 로드 될때 딱 한번 수행되는 클래스 초기화블록
2. 객체 생성될떄 마다 수행되는 인스턴스 초기화 블록->생성자 순으로 실행 		
*/
	}
}
