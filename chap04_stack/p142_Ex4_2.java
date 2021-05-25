package chap04_stack;

import java.util.Scanner;

//p136_Ex4_1에서 만든 int형 스택을 사용하는 프로그램
// 스택 생성후, 계속해서 현재 데이터 수와 용량을 알려주며 종료하기 전까지 계속해서 푸시/팝/피크/덤프
public class p142_Ex4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		p136_Ex4_1.IntStack is = new p136_Ex4_1.IntStack(64);// Stack capacity : 64
		boolean replay = true;
		while(replay) {
			System.out.println("Stack size : "+is.size());
			System.out.println("Stack capacity : "+is.capacity());
			
			System.out.println("What do you want to do?");
			System.out.println("1.push	2.pop	3.peek	4.dump	0.exit");
			int input = 0;

			try {
				input = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Wrong Input");
			}
			
			if(input <= 0 || input > 5) {
				System.out.println("Wrong number");
				continue;
			}
			
			switch(input) {
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
					System.out.println("Stack is Empty(no data to peek)");
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
