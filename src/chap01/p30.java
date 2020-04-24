package chap01;

import java.util.Scanner;

public class p30 {
	
	static Scanner sc = new Scanner(System.in);
	
	//Q7) n이 7이면 '1+2+3+4+5+6+7 = 28'로 출력하는 프로그램을 작성하시오.
	public static void Q7() {
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		String count = "";
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			
			
			if(i == n) {
				count += i;
			}else {
				count += i+" + ";
			}
		}
		System.out.println(count+" = "+sum);
	}
	
	//Q8) 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있습니다. 가우스의 덧셈이라는 방법을 사용해 1부터 x까지의 정수 합을 구하는 프로그램을 작성하세요.
		/*
		 * 가우스의 덧셈 : 1부터 100까지의 합을 구해야 한다면 1+100, 2+99, 3+98, ..., 98+3, 99+2, 100+1과 같이 
		 * 양쪽끝에서 부터 양 쪽의 두 수를 100번 더한 뒤 2로 나누면 된다.
		 * 즉, n부터 m까지의 합은 (n+m)*((m-n+1)/2)
		 */
	public static void Q8() {
		int sum = 0;
		System.out.println("x의 값을 입력하시오.");
		int x = sc.nextInt();
		for(int i = 1; i <= x; i++) {
			sum = (1+x)*x/2; 
		}
		System.out.println("1부터 x("+x+")까지의 합 : "+sum);
	}
	
	//Q9) 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
	public static void Q9(int a, int b) {
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			sum = (a+b)*(b-a+1)/2; 
		}
		System.out.println("a("+a+")와 b("+b+") 사이의 모든 정수의 합 : "+sum);
	}
			
	//실행 메소드
	public static void main(String[] args) {
		Q7();
		Q8();
		
		System.out.println("a를 입력하시오.");
		int a = sc.nextInt();
		System.out.println("b를 입력하시오.");
		int b = sc.nextInt(); 
		Q9(a, b);
		
	}
}
