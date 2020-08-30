package chap04_Queue;
/*
 * Q5) 클래스 IntQueue 에 임의의 데이터를 검색하는 메소드를 추가하세요.
 * 해당되는 데이터를 찾았을 경우 데이터의 인덱스가 아닌, 해당 데이터의 큐에서의 순서를 반환
 */


class IntQue2{
	private int max; //큐의 용량
	private int front; //첫번째 요소의 커서
	private int rear;
	private int num;
	private int[] que;
	
	public IntQue2(int capacity) {
		front = rear = num = 0; 
		
		max = capacity;
		que = new int[max];
	}
	
	//-------------------------------------Q5의 내용------------------------------------
	public int search(int x) {
		for(int i = 0; i < num; i++) {
			if(que[(i + front)%max] == x) { //front로부터 i번째인 값이 x와 같을 때
				
				return i + 1; 
			}
		}
		return -1; //0이어도 된다.(같은 값을 찾는 경우 값들은 전부 'n'번째 데이터 - 1부터 num까지 - 로 나오기 때문)
	}
	//-------------------------------------Q5의 내용------------------------------------
	
	public int enQue(int x) throws OverflowIntQueueException {
		if(num >= max) { 
			throw new OverflowIntQueueException("Queue is already full!!");
		}
		que[rear++] = x;
		num++;
		if(rear == max) { 
			rear = 0;
		}
		return x;
	}
	
	public int deQue() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException("Queue is empty!!");
		}
		int x = que[front++]; 
		num--;
		if(front == max) {
			front = 0;
		}
		return x; 
		
	}
	public int peek() throws EmptyIntQueueException { 
		if(num <= 0) {
			throw new EmptyIntQueueException("Can't peek!! Queue is empty");
		}
		
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) { 
			int idx = (front + i) % max; 
			
			if(que[idx] == x) {
				return idx; 
			}
		}
		return -1;
	}
	
	public void clear() {
		front = rear = num = 0;
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
	
	public void dump() {
		System.out.print("[");
		for(int i = 0; i < num; i++) {
			int idx = (front+i)%max; 
			if(idx == rear - 1) {
				if(rear == 0) {
					rear = que.length;
				}
				System.out.print(que[idx]);
			}else {				
				System.out.print(que[idx]+", ");
			}
		}
		System.out.println("]");
	}
}
public class p160_Q5 {
	//-1을 리턴받을 경우 "찾지 못했습니다."
	
}
