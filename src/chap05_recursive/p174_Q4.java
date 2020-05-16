package chap05_recursive;

public class p174_Q4 {
	static void recur2(int n) {
		if(n > 0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	
	public static void main(String[] args) {
		//recur2의 인자로 4를 전달했을 때
		recur2(4);
		/*
		 * 1)상향식
		 * recur2(4) -> recur2(2) -> recur2(0), system.out.println(2), recur2(1) -> 2출력, 1출력
		 * 			 -> System.out.println(4) -> 4출력
		 * 			 -> recur2(3) -> recur2(1), System.out.println(3), recur2(2) -> 1출력, 3출력, 2출력, 1출력
		 * 
		 * => 2, 1, 4, 1, 3, 2, 1 순서로 출력
		 */
		
		/*
		 * 2)하향식
		 * recur2(0) -> 어떠한 코드도 실행되지 않음(0보다 크지 않기 때문)
		 * recur2(1) -> 1출력
		 * recur2(2) -> 2출력, recur2(1) -> 2출력, 1출력
		 * recur2(3) -> recur2(1), 3출력, recur2(2) -> 1출력, 3출력, 2출력, recur2(1) -> 1출력, 3출력, 2출력, 1출력
		 * recur2(4) -> recur2(2), 4출력, recur2(3) -> 2출력, recur2(1), 4출력, recur2(1), 3출력, recur2(2) -> 1출력, 3출력, 2출력, recur2(1) -> 1출력, 3출력, 2출력, 1출력
		 */	
	}

}
