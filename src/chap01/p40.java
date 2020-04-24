package chap01;

public class p40 {
	//Q15) 직각 이등변 사각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요.
	static void Q15(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	//Q16) n단의 피라미드를 출력하는 메서드를 출력하세요.(i행에는 (i - 1)*2 + 1개의 *가 출력되게 하세요.)
		static void Q16(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - (i+1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Q17) 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.(i행에 출력하는 숫자는 i % 10으로 구하세요.)
	static void Q17(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - (i+1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++) { //n개의 열 생성
			for(int j = 1; j <= n - i; j++) { //공백은 n-1, n-2, ...0개 작성되어야 함
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) { //*문자는 1개, 1+2개, 1+2+2개, ...1+(2의 n승)개 작성되어야 함
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Q15(5);
		Q16(5);
		Q17(5);
	}
}
