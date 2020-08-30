package chap05_recursive;

import java.util.Scanner;

//실습 5-1) 자연수를 입력하면 해당 자연수의 팩토리얼을 구하는 프로그램
public class p166_Ex5_1 {
	//내가 생각한 코드 : int factorial(int x)
	static int factorial(int x) {
		int fac = 1;
		if(x > 0) {
			for(int i = 0; i < x; i++) {
				fac *= (x-i);
			}
			return fac;
		}else
			return fac; // 1인 상태
	}
	//정답 코드(보다 간결하고 재귀함수에 걸맞는 코드) : int factorial2(int x)
	static int factorial2(int x) {
		if(x > 0)
			return x*factorial2(x-1); 
		else
			return 1;
	}
	/* 
	 * x가 5라면 5*factorial2(4) = 5*4*factorial2(3) = 5*4*3*factorial2(2) = 5*4*3*2*fatorial2(1)
	 *  = 5*4*3*2*1*factorial2(0) 이 때, factorial2(0)에서 인자인 0은 0보다 크지 않으므로 1 리턴(0! = 1)
	 *  따라서 5*4*3*2*1*1의 결과가 나오게 됨.
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry = 0;
		do {
			System.out.println("양의 정수 x를 입력하세요.");
			int x = sc.nextInt();
			if(x < 0) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			System.out.println("x! : "+factorial(x));
			System.out.println("x! : "+factorial2(x));
			System.out.println("계속하시겠습니까?\n0.계속한다.\t1.종료한다.");
			retry = sc.nextInt();
		}while(retry == 0);
		sc.close();
	}
}
