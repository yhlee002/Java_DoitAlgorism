package chap01;

import java.util.Scanner;

public class p29 {
	//Q6) 실습 1-4에서 while문이 종료될 때 변수 i값이 n+1이 됨을 확인하세요.(변수 i값을 출력하도록 프로그램을 수정)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n의 값을 입력하시오.");
		int n = sc.nextInt();
		
		int i = 1, sum = 0;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("최종 sum값은 "+sum+"이고, 최종 i의 값은 "+i+"입니다.");
		
		sc.close();
	}
}
