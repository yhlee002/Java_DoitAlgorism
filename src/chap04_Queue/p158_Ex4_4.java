package chap04_Queue;

import java.util.Scanner;

//실습 4-4) 링 버퍼로 큐를 구현하는 프로그램 사용하기
public class p158_Ex4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQue iq = new IntQue(64); //p148_Ex4_3파일에 작성한 클래스
		
		boolean replay = true;
		while(replay) {
			System.out.println("Queue size : "+iq.size());
			System.out.println("Queue capacity : "+iq.capacity());
			
			System.out.println("what do you want to do?");
			System.out.println("1.enqueue	2.dequeue	3.peek	4.dump	5.exit");
			int doSomeThing = sc.nextInt();
			
			if(doSomeThing < 0 || doSomeThing > 5) {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
			switch(doSomeThing) {
			case 1:
				System.out.println("Input data what you want to enque");
				try {
					iq.enQue(sc.nextInt());
				} catch (OverflowIntQueueException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					System.out.println(iq.deQue());
				} catch (EmptyIntQueueException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println(iq.peek());
				} catch (EmptyIntQueueException e) {
					e.printStackTrace();
				}
				
				break;
			case 4:
				iq.dump();
				break;
			case 5:
				System.out.println("종료합니다.");
				break;
				
			}
		}
		sc.close();
	}
}
