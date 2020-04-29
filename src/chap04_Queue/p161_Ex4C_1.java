package chap04_Queue;

import java.util.Scanner;

/*
 * 링퍼버를 활용한 큐 프로그램
 * 정수입력은 무한히 가능하나 배열에 저장되는 데이터는 가장 마지막의 n개 데이터인 프로그램
 */


public class p161_Ex4C_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 큐의 크기를 입력하세요.");
		int[] ringQueue = new int[sc.nextInt()];
		
		int retry = 0;
		int cnt = 0;
		int n = 0;
		do {
			System.out.println("입력할 데이터를 입력하세요.\n"+cnt+"번째 수 : ");
			ringQueue[n++] = sc.nextInt();
			
			
			System.out.println("계속하시겠습니까?");
			System.out.println("0.계속한다. 1.종료한다.");
			retry = sc.nextInt();
		} while(retry == 0);
		
		
	}
}
