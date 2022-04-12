package chap05_recursive;

public class IntStack{
	private int max; //스택 용량
	private int ptr; //스택 포인터(다음에 들어올 데이터의 위치) 현재 스택에 쌓여있는 요소 수로도 여길 수 있음.
	private int[] stk; //스택 본체(int값을 담음)
	EmptyIntStackException emptyE;
	OverflowIntStackException overflowE;
	
	public IntStack(int capacity) {
		this.max =capacity;
		ptr = 0; //IntStack.peek();
		stk = new int[max]; //index : 0 ~ max-1
		/*
		 * 메모리 공간이 부족해 배열 생성에 실패할 경우 예외를 발생시켜 다른 메소드가
		 * 존재하지 않는 배열에 잘못 접근하는 것을 방지
		 */
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) { //새로 들어올 데이터의 자리가 배열의 길이와 같으면(인덱스 + 1이 되면)
			throw new OverflowIntStackException("배열이 가득 찼습니다.");
		}
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException("제거할 데이터가 없습니다.");
		}
		
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0) {
			throw new EmptyIntStackException("리턴할 데이터가 하나도 없습니다.");
		}
		return stk[ptr - 1];
	}
	
	public boolean isEmpty() {
		return ptr == 0;
//		if(ptr == 0) {
//			return true;
//		}
//		return false;
	}
	
	public boolean isFull() {
		return ptr == max;
//		if(ptr == max) {
//			return true;
//		}
//		return false;
	}
	
	public int indexOf(int num) {
		for(int i = stk.length - 1; i >= 0; i--) { 
			//Stack의 최상위 데이터(마지막 데이터)부터 확인(먼저 pop이 되는 데이터를 찾기 위해)
			if(stk[i] == num) {
				return i;
			}
		}
		return -1; //검색에 실패할 경우 '-1'반환
	}
	
	public void clear() { //Stack에 쌓여 있는 모든 데이터를 삭제
		ptr = 0;
	}
	
	public int capacity() { //Stack의 용량을 반환
		return max;
	}
	
	public int size() { //현재 Stack에 쌓여 있는 데이터(요소)의 수
		return ptr; 
	}
	
	public void dump() { 
		//현재 Stack 안에 있는 모든 데이터를 바닥(가장 처음에 들어온 데이터) -> 꼭대기(가장 마지막으로 들어온 데이터) 순으로 출력
		if(ptr == 0) {
			System.out.println("Stack is Empty");
		}else {
			System.out.print("[");
			for(int i = 0; i < ptr; i++) { //ptr전까지만 출력
				if(i == ptr - 1) {
					System.out.print(stk[i]);					
				}else {
					System.out.print(stk[i]+", ");
				}
			}
			System.out.println("]");
		}
	}	
}
