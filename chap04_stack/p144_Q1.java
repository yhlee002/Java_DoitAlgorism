package chap04_stack;

import java.util.Scanner;

//Q1) 클래스 IntStack의 모든 메소드를 사용하는 프로그램 작성
public class p144_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		p136_Ex4_1.IntStack is = new p136_Ex4_1.IntStack(50);
		
		//isEmpty, isFull, indexOf
		while(true) {
			System.out.println("[Stack size] : "+is.size());
			System.out.println("[Stack capacity] : "+is.capacity());
			System.out.println("What do you want to do?");
			System.out.println("0.exit	1.push	2.pop	3.peek	4.dump	5.clear	6.searchData");
			int doSomeThing = sc.nextInt();
			if(doSomeThing < 0 || doSomeThing > 6) {
				System.out.println("잘못된 숫자입니다.");
				break;
			}
			switch(doSomeThing) {
			case 0 : 
				break;
			case 1 : 
				System.out.println("Input Data");
				try {
					is.push(sc.nextInt());
				} catch (OverflowIntStackException e) {
					System.out.println("Stack is already full");
				}
				break;
			case 2:
				try {
					is.pop();
					System.out.println("pop!");
				} catch (EmptyIntStackException e) {
					System.out.println("Stack is empty!!");
				}
				break;
			case 3:
				try {
					is.peek();
				} catch (EmptyIntStackException e) {
					System.out.println("Stack has no data");
				}
				break;
			case 4:
				System.out.print("Datas in Stack : ");
				is.dump();
				System.out.println();
				break;
			case 5:
				is.clear();
				System.out.println("Stack Clear");
				break;
			case 6:
				System.out.println("Input data what you want to search");
				int result = is.indexOf(sc.nextInt());
				if(result != -1) {
					System.out.println("Index"+is.indexOf(sc.nextInt()));					
				}else { //is.indexOf()가 -1을 리턴했을 때(찾지 못했을때)
					System.out.println("no same data");
				}

				break;
			}

		}
		sc.close();
	}
}
