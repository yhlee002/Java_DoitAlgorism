package chap05_recursive;

import java.util.Scanner;

// Ex5-3 재귀함수의 재귀 제거
public class p176_Ex5_5 {
	public static void recurseX(int n) throws OverflowIntStackException, EmptyIntStackException {
	/*
		[기존의 재귀함수]
		while(true) {
			recurseX(n-1);
			System.out.println(n);
			recurseX(n-2); --> n -= 2;
		}
	 */

		IntStack is = new IntStack(100);
		
		while(true) {
			if(n > 0) {
				is.push(n);
				n -= 1;
				continue;
			}
			if(!is.isEmpty()) {
				n = is.pop();
				System.out.println(n);
				n -= 2;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요.");
		int n = sc.nextInt();
		try {
			recurseX(n);
		} catch (OverflowIntStackException | EmptyIntStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
