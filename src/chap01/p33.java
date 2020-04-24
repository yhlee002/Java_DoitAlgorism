package chap01;

import java.util.Scanner;

public class p33 {
	
	static Scanner sc = new Scanner(System.in);
	
	//Q10) 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.(b <= a일 경우  'a보다 큰 값을 입력하세요!' 반복)
	public static void Q10() {
		
		System.out.println("a를 입력하시오.");
		int a = sc.nextInt();
		System.out.println("b를 입력하시오.");
		int b = sc.nextInt();
		
		do {
			System.out.println("\'a보다 큰 값을 입력하세요!\'");
		
			System.out.println("a를 입력하시오.");
			a = sc.nextInt();
			System.out.println("b를 입력하시오.");
			b = sc.nextInt();
		}while(a >= b);
		System.out.println("b - a = "+(b-a));
	}
	
	//Q11) 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. ('그 수는 n자리 입니다.')
	public static void Q11() {
		
		System.out.println("num을 입력하시오.");
		int num = sc.nextInt();
		do {
			System.out.println("양의 정수를 입력하시오.");
			
			System.out.println("num을 입력하시오.");
			num = sc.nextInt();
		}while(num < 0);
		String numString = Integer.toString(num);
		System.out.println("그 수는 "+numString.length()+"자리 입니다.");
	}
	
	//실행 메소드
	public static void main(String[] args) {
		
		Q10();
		
		Q11();
	}
	
}
