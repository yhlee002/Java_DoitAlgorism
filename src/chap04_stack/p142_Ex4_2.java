package chap04_stack;

import java.util.Scanner;

//p136_Ex4_1에서 만든 int형 스택을 사용하는 프로그램
// 스택 생성후, 계속해서 현재 데이터 수와 용량을 알려주며 종료하기 전까지 계속해서 푸시/팝/피크/덤프
public class p142_Ex4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack is = new IntStack(64);// Stack capacity : 64
		boolean replay = true;
		while(replay) {
			System.out.println("Stack size : "+is.size());
			System.out.println("Stack capacity : "+is.capacity());
			
			System.out.println("What do you want to do?");
			System.out.println("1.push	2.pop	3.peek	4.dump	0.exit");
			int doSomeThing = 0;
			
			//doSomeThing의 type이 int가 아닌 double이나 String일 경우 Mismatching Exception? 발생할텐데 이를 처리할 수는 없나?
			try {
				doSomeThing = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Wrong Input");
			}
			
			if(doSomeThing <= 0 || doSomeThing > 5) {
				System.out.println("Wrong number");
				continue;
			}
			
			switch(doSomeThing) {
			case 1: //push
				
				try {
					System.out.println("input data that you want to save in Stack");
					is.push(sc.nextInt());
				} catch (OverflowIntStackException e) {
					System.out.println("Stack is full");
				}
				break;
			case 2: //pop
				try {
					System.out.println("pop!");
					is.pop();
				} catch (EmptyIntStackException e) {
					System.out.println("Stack is Empty");
				}
				break;
			case 3: //peek
				try {
					System.out.println("is.peek() : "+is.peek());
				} catch (EmptyIntStackException e) {
					System.out.println("no data in Stack ");
				}
				break;
			case 4: //dump
				is.dump();
				break;
			case 5: //exit
				replay = false;
				break;
			}
			
		}
		sc.close();
	}
}
