package chap04_stack;

import java.util.Arrays;

/*
 * 스택 생성하기
 * pop() : 스택의 최상위(마지막)에 위치한 데이터를 추출한 후에 스택에서 삭제
 * push() : 스택의 최상위(마지막)에 데이터를 삽입
 * isEmpty() : 스택이 비었는지 확인
 * clear() : 스택에 저장된 모든 데이터를 삭제하고 스택을 초기화
 * peek() : 스택의 최상위에 위치한 데이터를 추출하되, pop가 달리 데이터 삭제X
 * 	cf.peek : "몰래 엿보다"
 * isEmpty() : 스택이 비었는지 확인
 * isFull() : 스택이 가득찼는지 확인
 * indexOf(param) : param과 동일한 값을 꼭대기부터 바닥순서대로 찾아서 반환
 * capacity() : 스택의 용량 반환
 * size() : 스택의 사이즈 확인(현재까지 쌓인 데이터의 수)
 * dump() : 스택의 모든 데이터를 바닥(가장 오래된 데이터)부터 꼭대기(가장 최근의 데이터)까지 모두 출력
 * 
 * Stack에 대한 push, pop 등 모든 작업은 Stack Pointer(아래 예시의 ptr)를 바탕으로 이루어진다.
 * 따라서 스택의 배열 요솟값을 변경할 필요없이, Stack Pointer의 값만 변경하면 된다.
 */
class IntStack{
	private int max; //스택 용량
	private int ptr; //스택 포인터(다음에 들어올 데이터의 위치) 현재 스택에 쌓여있는 요소 수로도 여길 수 있음.
	private int[] stk; //스택 본체(int값을 담음)
	
	public IntStack(int capacity) {
		this.max =capacity;
		ptr = 0; //IntStack.peek();
		stk = new int[max]; //index : 0 ~ max-1
		/*
		 * 메모리 공간이 부족해 배열 생성에 실패할 경우 예외를 발생시켜 다른 메소드가
		 * 존재하지 않는 배열에 잘못 접근하는 것을 방지
		 */
	}

	/**
	 * ptr은 0 이상, max 이하의 값일 수 밖에 없지만
	 * 혹여나 잘못된 코드로 인해 max를 초과하는 것을
	 * 방지하기 위해 등가부호('==')가 아닌 '>=' 사용 */
	public int push(int x) throws OverflowIntStackException { // push한 값 반환
		if(ptr >= max) {
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

class EmptyIntStackException extends Exception{
	public EmptyIntStackException(String msg) {
		super(msg);
	}
}

class OverflowIntStackException extends Exception{
	public OverflowIntStackException(String msg) {
		super(msg);
	}
}

public class p136_Ex4_1 {
	public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
		IntStack st = new IntStack(10);
		System.out.println("st.push(5)");
		st.push(5);//실제 배열 : [5, 0, 0, 0, 0, 0, 0, 0, 0, 0], Stack(저장된 인덱스까지만 출력되게 하는 메소드가 dump) : [5]
		System.out.println("st.pop()");
		st.pop();//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], Stack : []
		System.out.println("st.push(3) : "+st.push(3)); //[3, 0]
		System.out.println("st.push(6) : "+st.push(6)); //[3, 6]
		System.out.println("st.pop() : "+st.pop());
		//Cf.st가 속성으로 가지고 있고, 실제로 스택메모리로 사용되는 필드 stk를 출력하면 [3, 6] (dump를 사용해 스택으로 삼는 부분만 출력시 [3])
		//차후에 push를 할 경우 index 1의 값이 6이 아닌 새로운 값으로 대체되는 식으로 변하는 것.
		System.out.println("st.push(10) : "+st.push(10)); //[3, 10]
		System.out.println("st.peek() : "+st.peek()); //10
		//st 내부에 생성되있는 배열을 보는 법? : dump()
		st.dump();
		
		System.out.println("st.isEmpty() : "+st.isEmpty());
		System.out.println("st.isFull() : "+st.isFull());
	}
}
