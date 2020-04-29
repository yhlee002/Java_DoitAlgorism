package chap04_Queue;

//Generic Queue 생성

class EmptyQueueException extends Exception{
}
class OverflowException extends Exception{
}

class Gqueue<E>{
	//큐의 용량, 데이터 수, 프런트 요소 커서, 리어 요소 커서, 큐의 본체
	int max;
	int num;
	int front;
	int rear;
	E[] que;
	
	public Gqueue(int capacity){
		front = rear = num = 0;
		max = capacity;
		que = (E[])new Object [max];
	}
	
	//enque
	public E enque(E e) throws OverflowException {
		if(num >= max) {
			throw new OverflowException();
		}
		que[rear++] = e; //rear + 1
		num++; //num + 1
		if(rear == max) {
			rear = 0;
		}
		return e;
	}
	
	//deque
	public E deque() throws EmptyQueueException {
		E y = que[front++];
		if(front < 0) {
			throw new EmptyQueueException();
		}
		num--;
		return y;
	}
	
	//peek
	public E peek() throws EmptyQueueException {
		if(num <= 0) {
			throw new EmptyQueueException();
		}
		return que[front];
	}
	
	//indexOf
	public int indexOf(E search) {
		for(int i = 0; i < num; i++) {
//			int idx = (front + i)%max;
			if(que[i] == search) { //링버퍼 큐의 경우 i 대신 idx 사용
				return i;//링버퍼 큐의 경우 i 대신 idx 사용
			}
		}
		return -1;
	}
	
	public void clear() {
		front = num = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
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
	
	public void dump() throws EmptyQueueException {
		System.out.print("[");
		if(num <= 0) {
			throw new EmptyQueueException();
		}
		for(int i = 0; i < num; i++) {
			if(i == num - 1) {
				System.out.print(que[(front + i)%max]);
			}else {
				System.out.print(que[(front + i)%max] + ", ");				
			}
		}
		System.out.println("]");
	}
	
	
}
public class p160_Q6 {
	public static void main(String[] args) {
		Gqueue<String> gq = new Gqueue<String>(50);
		try {
			gq.enque("younghyun");
			gq.enque("ddui");
			System.out.println("younghyun, ddui 추가");
			gq.dump();
			
			System.out.println("gq.deque() : "+gq.deque());
			System.out.println("younghyun을 dequeue");
			gq.dump();
			System.out.println();
			
		} catch (OverflowException e) {
			e.printStackTrace();
		} catch (EmptyQueueException e) {
			e.printStackTrace();
		}
		
	}
}
