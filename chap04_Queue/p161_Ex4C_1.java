package chap04_Queue;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 링퍼버를 활용한 큐 프로그램
 * 정수입력은 무한히 가능하나 배열에 저장되는 데이터는 가장 마지막의 n개 데이터인 프로그램
 */


public class p161_Ex4C_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 큐의 크기를 입력하세요.");
		int N = sc.nextInt();
		int[] ringQueue = new int[N];
		
		int retry = 0;
		int cnt = 0; //데이터가 들어간 횟수. 즉, 들어간 데이터의 개수이자 다음 데이터가 들어갈 인덱스이기도 함
		do {
			System.out.println("추가할 데이터를 입력하세요.\n"+(cnt + 1)+"번째 수 : ");
			ringQueue[(cnt++) % N] = sc.nextInt();
			
			
			System.out.println("계속하시겠습니까?");
			System.out.println("0.계속한다. 1.종료한다.");
			retry = sc.nextInt();
		} while(retry == 0);
		
		System.out.println(Arrays.toString(ringQueue));
		
		int i = 0;
		if((i = cnt - N) < 0) 
			/* 
			 * cnt - N = 0인 경우 : cnt가 최대 인덱스를 넘어서 다시 0부터 시작.
			 * 즉, cnt - N < 0인 경우는 아직 cnt(다음 데이터가 들어갈 인덱스)가 0부터 최대 인덱스 사이라는 뜻
			 * 이 상황에서 i는 0부터 cnt-1만큼 반복문을 실행하면 된다.
			 * 
			 * 만약, cnt - N >= 0 의 경우라면 이는 배열의 인덱스 0 ~ 최대 인덱스까지를 한 바퀴 돌고 난 이후라는 의미로
			 * i는 cnt - N 부터 시작해 cnt - 1까지 반복(여태 넣은 데이터의 수에서 배열의 개수를 빼면 인덱스 0에 들어갈 데이터의 인덱스가 됨.
			 * 
			 * EX) 배열의 용량이 10인데 cnt가 38인 경우, i는 28부터 37까지 10회 반복하게 된다.
			 * |---10---|---10---|---10---|--8--|(cnt = 38일 경우)
			 * (배열의 용량인 10을 뺀 후)
			 * |---10---|---10---|--8--|--(10)--|(괄호의 10은 빠진 수)
			 * =>즉, 이러한 계산은 결국 최후의 10개의 데이터를 추려내는 것.
			 */
			i = 0;
		for( ; i < cnt; i++) {
			System.out.printf("%2d번째 정수 = %d\n", i+1, ringQueue[i % N]);
		}
	sc.close();	
	}
}
