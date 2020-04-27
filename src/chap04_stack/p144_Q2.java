package chap04_stack;

import java.util.Scanner;

class EmptyIntStackException2 extends Exception{
	
}

class OverflowIntStackException2 extends Exception{

}

class StackG <E> { //generic타입을 받는 stack
	private int max;
	private int ptr;
	private E [] stk;
	
	@SuppressWarnings("unchecked") // 모든 타입이 올 수 있기 때문에 타입 안정성이 낮다.
	//제네릭에는 참조형 데이터타입만 올 수 있기 때문에 기본 데이터형이 올 경우 Wrapper class를 사용해야 한다.
	//만약 Integer가 올 경우 intValue()를 사용하도록 분기해줘야?
	//Byte, Short, Integer, Long, Float, Double, Boolean, Char 등
	StackG(int capacity){
		max = capacity;
//		stk = new E[max];  ->generic array creation : Error(자바에선 제네릭 배열 생성이 허용되지 않음
		stk = (E []) new Object[max];

		ptr = 0;
	}
	//push, pop, peek, dump, clear, indexOf...
	
	void push(E obj) throws OverflowIntStackException2 {
		stk[ptr++] = obj;
		if(ptr == max) {
			throw new OverflowIntStackException2();
		}
	}
	
	E pop() throws EmptyIntStackException2 {
		if(ptr == 0) {
			throw new EmptyIntStackException2();
		}
		return stk[--ptr]; //ptr - 1값은 리턴하고 ptr값도 1 감소시킴
	}
	
	E peek() throws EmptyIntStackException2 {
		if(ptr == 0) {
			throw new EmptyIntStackException2();
		}
		return stk[ptr-1];
	}
	
	void dump() {
		System.out.print("[");
		for(int i = 0; i < ptr; i++) {
			
			if(i == ptr - 1) {
				System.out.print(stk[i]);
			}else {
				System.out.print(stk[i]+", ");
			}
		}
		System.out.println("]");
	}
	
	void clear() {
		ptr = 0;
	}
	
	int indexOf(E param) {
//		if(param instanceof String) {
//			for(int i = ptr - 1; i >= 0; i--) {
//				if(stk[i].equals(param)) {
//					return i;
//				}
//			}
//		}else {
//			for(int i = ptr - 1; i >= 0; i--) {
//				if(stk[i] == param) {
//					return i;
//				}
//			}
//		}
		for(int i = ptr - 1; i >= 0; i--) { //int형도 equals로 판단 가능(primitive type인 int형은 안되는 걸로 아는데?)
			if(stk[i].equals(param)) {
				return i;
			}
		}
		
		return -1;
	}
	
	boolean isEmpty() {
		if(ptr == 0) {
			return true;
		}
		return false;
	}
	
	boolean isFull() {
		if(ptr == max) {
			return true;
		}
		return false;
	}
	
	int capacity() {
		return max;
	}
	
	int size() {
		return ptr;
	}
	
	
}

public class p144_Q2 {
	public static void main(String[] args) {
		StackG<String> stStr = new StackG<String>(50); 
		StackG<Integer> stInt = new StackG<Integer>(50);
		
		try {
			stStr.push("Hello");
			stStr.push("I'm");
			stStr.push("Younghyun");
			stStr.dump();
		} catch (OverflowIntStackException2 e) {
			e.printStackTrace();
		}
		try {
			System.out.println(stStr.pop());
			System.out.print("stStr.dump() : ");
			stStr.dump();
		} catch (EmptyIntStackException2 e) {
			e.printStackTrace();
		}
		System.out.println("is stStr Full? : "+stStr.isFull());
		System.out.println("is stStr Empty? : "+stStr.isEmpty());
		
		System.out.println("stStr.indexOf(\"I'm\") : index("+stStr.indexOf("I'm")+")");
		
		try {
			stInt.push(50);
			stInt.push(300);
			stInt.push(24);
			stInt.push(54);
			System.out.print("stStr.dump() : ");
			stStr.dump();
		} catch (OverflowIntStackException2 e) {
			e.printStackTrace();
		}
		System.out.println("is stInt Full? : "+stInt.isFull());
		System.out.println("is stInt Empty? : "+stInt.isEmpty());
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾으려는 스택을 정해주세요.");
		System.out.println("0.stStr	1.stInt");
		int whatStack = sc.nextInt();
		switch(whatStack) {
		case 0 :
			System.out.println("찾으실 데이터를 입력해주세요.");
			String st = sc.next();
			int strSearch = stStr.indexOf(st);
			
			stStr.dump();
			
			if(strSearch != -1) {
				System.out.println("stStr.indexOf() : "+strSearch); //왜 못찾는지????????????????????????????????????
			}else {
				System.out.println("값을 찾을 수 없습니다.");
			}
			break;
			
		case 1:
			System.out.println("찾으실 데이터를 입력해주세요.");
			sc.nextLine();
			int intSearch = stInt.indexOf(sc.nextInt());
			
			if(intSearch != -1) {
				System.out.println("stInt.indexOf() : "+intSearch);
			}else {
				System.out.println("값을 찾을 수 없습니다.");
			}
			break;
		}
		sc.close();
	}
}
