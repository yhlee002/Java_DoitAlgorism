package chap04_Queue;

import java.util.Arrays;

/*
 * deck 생성
 * [deck] : 양방향 대기열(deque/double ended queue)은 시작과 끝 지점에서 양쪽으로
 * 데이터를 인큐하거나 디큐하는 자료구조.
 * *여전히 링버퍼의 형태로 구현
 */
//양방향 대기열을 구현하는 클래스 IntDeque 생성, 이 때 자료형은 int형을 저장
class OverflowIntDequeException extends Exception{
}
class EmptyIntDequeException extends Exception{
}
class Deq{
	private int num;
	private int front; //제일 앞쪽 커서
	private int rear; //제일 뒤쪽 커서
	private int max; //용량
	private int[] deq;
	
	public Deq(int capacity) {
		front = rear = num = 0; //rear를 마지막 인덱스로 생각해야 하는지?
		max = capacity;
		deq = new int[max];
		
	}
	/*
	 * 	0					max - 1
	 * 	---------------------------------------------
	 * 	|											|
	 * 	---------------------------------------------
	 * front, rear								max - 1
	 * <-방향 enque : frontEnque(deque는 반대방향)
	 * ->방향 enque : rearEnque(deque는 반대방향)
	 * 
	 */
	
	public int frontEnque(int x) throws OverflowIntDequeException {
		//덱의 front에 인큐하면서 front의 값은 점점 줄어들고(앞으로 길어지기 때문),
		//원소의 개수는 늘어남(num++)
		if(num >= max) {
			throw new OverflowIntDequeException();
		}
		if(--front < 0) {
			front = max - 1; 
		}
		deq[front] = x;
		num++;
		return x;
	}
	
	public int frontDeque() throws EmptyIntDequeException {
		if(num <= 0) {
			throw new EmptyIntDequeException();
		}
		if(front++ == max) {
			front = 0;
		}
		int y = deq[front];
		num--;
		return y;
	}
	
	public int rearEnque(int x) throws OverflowIntDequeException {
		if(num >= max) {
			throw new OverflowIntDequeException();
		}
		deq[rear++] = x;
		if(rear == max) {
			rear = 0;
		}
		num++;
		return x;
	}
	
	public int rearDeque() throws EmptyIntDequeException {
		if(--rear < 0) {
			rear = max - 1;
		}
		num--;
		if(num < 0) {
			throw new EmptyIntDequeException();
		}
		return deq[rear];
	}
	
	
	public void dump() throws EmptyIntDequeException {
		if(num <= 0) {
			throw new EmptyIntDequeException();
		}
		System.out.print("[");
		for(int i = 0; i < num; i++) {
			int idx = (front + i)%max;
			if(i == num - 1) {
				System.out.print(deq[idx]);
			}else {
				System.out.print(deq[idx]+", ");
			}
		}
		System.out.println("]");
	}
	
	public int peekFront() throws EmptyIntDequeException{ // front의  가장 최근값을 peek
		if(num <= 0) {
			throw new EmptyIntDequeException();
		}
		return deq[front];
	}
	
	public int peekRear() throws EmptyIntDequeException { // rear의 가장 최근값을 peek
		if(num <= 0) {
			throw new EmptyIntDequeException();
		}
		if(rear == 0) {
			return deq[max - 1];
		}
		return deq[rear - 1];
	}
	
	public int size() {
		return num;
	}
	
	public int capacity() {
		return max;
	}
	
	public boolean isEmpty() {
		if(num == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(num == max) {
			return true;
		}
		return false;
	}
	
	public void clear() {
		front = rear = num = 0;
	}
	
	public int indexOf(int x) { //front부터 선형 검색
		for(int i = 0; i < num; i++) {
			int idx = (i + front)%max;
			if(deq[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	public int search(int x) { //front로부터 몇번째인지
		for(int i = 0; i < num; i++) {
			int idx = (i + front)%max;
			if(deq[idx] == x) {
				return i + 1;
			}
		}
		return 0;
	}
	//배열 상황을 보기 위한 임시 메소드
	public void getArray() {
		System.out.println("[현재 배열 상태] : "+Arrays.toString(deq));
		System.out.println("[현재 front] : "+front);
		System.out.println("[현재 rear] : "+rear);
		System.out.println("[현재 num] : "+num);
	}
}


public class p160_Q7 {
	public static void main(String[] args) {
		//Dequeue(덱, 데크)
		Deq deq = new Deq(5);
		try {
			deq.frontEnque(10); 
			System.out.println("deq.frontEnque(10) 후 dump()");
			deq.dump();
			deq.getArray();
			
			System.out.println("deq.frontEnque(20) : "+deq.frontEnque(20)); //[10, 0, 0, 0, 20]
			System.out.println("deq.frontEnque(20) 후 dump()");
			deq.dump();
			deq.getArray();
			
			System.out.println("deq.rearDeque() : "+deq.rearDeque()); //[10, 0, 0, 0, 0]? 
			System.out.println("deq.rearDeque()후 dump()");
			deq.dump();
			deq.getArray();
			
			System.out.println("deq.peekFront() : "+deq.peekFront());
			System.out.println("deq.peekRear() : "+deq.peekRear());
			
			System.out.println("deq.rearEnque(30) : "+deq.rearEnque(30));
			deq.dump();
			deq.getArray();
			
			System.out.println();
		} catch (OverflowIntDequeException e) {
			e.printStackTrace();
		} catch (EmptyIntDequeException e) {
			e.printStackTrace();
		}
		
		
	}
}
