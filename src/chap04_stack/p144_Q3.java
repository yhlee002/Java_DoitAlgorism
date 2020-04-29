package chap04_stack;

//Q3)하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스 생성
//cf. 스택에 저장하는 데이터는 int형 값으로 아래 그림처럼 배열의 처음과 끝을 사용
class IntStack1{
	int[] stack;
	int ptr;
	int max;
	public IntStack1(int[] stack, int capacity) {
		this.stack = stack;
		ptr = 0;
		max = capacity;
	}
	
	public void push(int x) throws OverflowIntStackException2 {
		if(ptr == max) {
			throw new OverflowIntStackException2();
		}
		stack[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException2 {
		if(ptr == 0) {
			throw new EmptyIntStackException2();
		}
		return stack[--ptr];
	}
	
	public int peek() throws EmptyIntStackException2 {
		if(ptr == 0) {
			throw new EmptyIntStackException2();
		}
		return stack[ptr - 1];
	}
	
	public void dump() {
		System.out.print("[");
		for(int i = 0; i < ptr; i++) {
			if(i == ptr - 1) {
				System.out.print(stack[i]);
			}else {
				System.out.print(stack[i]+", ");
			}
			
		}
		System.out.println("]");
	}
	
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stack[i] == x) {
				return i;
			}
		}
		return -1;
	}
	public void clear() {
		ptr = 0;
	}
	
	public boolean isEmpty() {
		if(ptr == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(ptr == 25) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return ptr;
	}
	
	public int capacity() {
		return max;
	}
}


class IntStack2{
	int[] stack;
	int ptr;
	int max;
	public IntStack2(int[] stack, int capacity) {
		this.stack = stack;
		ptr = stack.length - 1; //ptr은 stack.length - 1 ~ stack.length - capacity + 1의 범위를 가진다.
		max = capacity;
	}
	
	public void push(int x) throws OverflowIntStackException2{
		if(ptr == stack.length - max) {
			throw new OverflowIntStackException2();
		}
		stack[ptr--] = x;
	}
	
	public int pop() throws EmptyIntStackException2 {
		if(ptr == stack.length - 1) {
			throw new EmptyIntStackException2();
		}
		return stack[++ptr];
	}
	
	public int peek() throws EmptyIntStackException2 {
		if(ptr == stack.length - 1) {
			throw new EmptyIntStackException2();
		}
		return stack[ptr + 1];
	}
	
	public void dump() {
		System.out.print("[");
		for(int i = stack.length - 1; i >= ptr + 1; i--) {
			if(i == ptr + 1) {
				System.out.print(stack[i]);
			}else {
				System.out.print(stack[i]+", ");
			}
			
		}
		System.out.println("]");
	}
	
	public int indexOf(int x) {
		for(int i = ptr + 1; i >= 50; i++) {
			if(stack[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		ptr = 50;
	}
	
	public boolean isEmpty() {
		if(ptr == 50) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(ptr == 25) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return stack.length - ptr;
	}
	
	public int capacity() {
		return max;
	}
}


public class p144_Q3 {
	public static void main(String[] args) {
		int[] array = new int[50];
		
		IntStack1 is1 = new IntStack1(array, 25); //ptr = 0 (25까지 오름차순) - indexOf()할 때는 가장 마지막 데이터부터(최대 24), dump()할 때는 최초의 데이터부터(0)
		IntStack2 is2 = new IntStack2(array, 25); //ptr = 50 (26까지 내림차순) - indexOf()할 때는 가장 마지막 데이터부터(최소 25), dump()할 때는 최초의 데이터부터(50)
		
		System.out.println("배열의 인덱스 0~24까지를 사용하는 stack 사용");
		
		try {
			is1.push(5);
			is1.push(10);
			is1.push(15);
		} catch (OverflowIntStackException2 e1) {
			e1.printStackTrace();
		}
		
		is1.dump();
		
		try {
			is1.pop();
		} catch (EmptyIntStackException2 e1) {
			e1.printStackTrace();
		}
		is1.dump();
		
		System.out.println("배열의 인덱스 25~50까지를 사용하는 stack 사용");
		
		try {
			is2.push(5);
			is2.push(10);
			is2.push(15);
		} catch (OverflowIntStackException2 e) {
			e.printStackTrace();
		}
		
		is2.dump();
		
		try {
			is2.pop();
		} catch (EmptyIntStackException2 e) {
			e.printStackTrace();
		}
		is2.dump();
		
	}
}
