package chap04_stack;


class EmptyIntStackException extends Exception {
	public EmptyIntStackException() {
		super("EmptyIntStackException이 발생했습니다.");
	}
}
class OverflowIntStackException extends Exception {
	public OverflowIntStackException() {
		super("OverflowIntStackException이 발생했습니다.");
	}
}
class IntStack {
	private int max;
	private int ptr;
	private int[] stk;
	
//	EmptyIntStackException emptyExcep;
//	OverflowIntStackException overflowExcep;
	
	public IntStack(int c) { //capacity(용량)
		max = c; //지역변수가 없고 필드뿐인 max와 ptr은 this 생략 가능
		ptr = 0; //stack pointer(새로운 데이터가 삽입될 인덱스를 기억하는 용도로 사용됨)

		stk = new int[max];
	}
	
	int push(int x) throws OverflowIntStackException{
		if(ptr >= max) { 
			/*
			 * max = stk.length. stk의 인덱스는 max-1까지로, ptr(새로운 데이터가 들어갈 인덱스)가 
			 * max와 같아지거나 그 이상이 된다는 것은 배열이 가지는 인덱스(담을 수 있는 칸)가 모두 찼다는 것을 의미
			 */
			throw new OverflowIntStackException();
		}

		return stk[ptr++] = x;
		
	}
	
	int pop() throws EmptyIntStackException{
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
}

public class p136_Ex4_1A {
	public static void main(String[] args) {
//		int[] intStack = new int[10];
//		int ptr; 
		
		
		
	}
}
