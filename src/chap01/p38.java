package chap01;

import java.util.Scanner;

public class p38 {
	
	//Q12) 곱셈표의 위와 왼쪽에 곱하는 수를 작성하세요.
	public static void Q12() {
		System.out.printf("%6s", "|");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
		}
		System.out.print("\n----------------------------------");
		System.out.println();
		for(int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
			System.out.printf("%3s", "|");
			for(int j = 1; j < 10; j++) {
				
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	//Q13) 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요.
	public static void Q13() {
		System.out.printf("%6s", "|");
		for(int i = 1; i < 10; i++) {
		System.out.printf("%3d", i);
		}
		System.out.print("\n----------------------------------\n");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%3d%3s", i, "|");
			for(int j = 1; j < 10; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
		System.out.println("\n");
		
	}
	
	//Q14) 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
	public static void Q14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하시오.");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		Q12();
		
		Q13();
		
		Q14();
	}
}
