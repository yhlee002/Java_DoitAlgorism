package chap04_Queue;

//실습 4-3) 링 버퍼로 큐를 구현하는 프로그램 작성(int형 데이터를 저장한다고 가정)
class OverflowIntQueueException extends Exception {
	public OverflowIntQueueException(String msg) {
		super(msg);
	}
}

class EmptyIntQueueException extends Exception {
	public EmptyIntQueueException(String msg) {
		super(msg);
	}
}

class IntQue { //p148 Ex4-3(A-D)
	private int max; //큐의 용량
	private int front; //첫번째 요소의 커서
	private int rear;
	private int num;
	private int[] que;
	
	public IntQue(int capacity) {
		front = rear = num = 0; 
		//front와 rear가 모두 0인 경우는 두 가지로 나뉜다. 큐가 비어있는 경우와 큐가 가득찬 경우가 그것으로, 이를 구분하기 위해 num이 필요하다.
		max = capacity;
		que = new int[max];
	}
	
	public int enQue(int x) throws OverflowIntQueueException {
		if(num >= max) { // 현재 데이터의 수가 용량과 같거나 그 이상일 경우 예외 throw
			throw new OverflowIntQueueException("Queue is already full!!");
		}
		que[rear++] = x;
		num++;
		if(rear == max) { //0에서 시작하기 때문에 단순하게 max와 같아질 때라고 하는게 아닌지
			rear = 0;
		}
		return x;
	}
	
	public int deQue() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException("Queue is empty!!");
		}
		int x = que[front++]; //deque에 의해 최초의 데이터가 삭제되면, 인덱스를 하나씩 당기는 것이 아니라 시작 인덱스를 하나 미룸
		num--;
		if(front == max) {
			front = 0;
		}
		return x; //++되기 전의 que[front]값
		//아래와 같이 쓰지 못하는 이유 : front가 하나 증가하기 전의 값(큐를 빠져나가는 값)을 리턴해야 하므로.
		//리턴은 코드의 가장 마지막에 와야 하므로 그 전에 front++가 끝나버리면 그 전 값을 리턴할 수가 없기 때문
//		front++;
//		num++;
//		if(front == max)
//			front = 0;
//		return que[front];
	}
	public int peek() throws EmptyIntQueueException { //Queue에서의 peek() : 가장 최초의 값을 들여다봄(Stack에서는 가장 최후의 값을 들여다봄)
		//Queue와 Stack 모두 공통적으로 peek은 가장 먼저 제거될(pop 혹은 deque 될) 값을 들여다 보는 기능 수행 
		if(num <= 0) {
			throw new EmptyIntQueueException("Can't peek!! Queue is empty");
		}
		
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) { //단순히 큐에 속한 데이터의 수만큼 반복한다는 의미
			int idx = (front + i) % max; //max가 되기 전까진 계속해서 자기 자신이 나머지가 됨
			//max와 같아지면(용량이 다 차는 것이 아닌, 인덱스의 끝까지 다 차고 다시 값이 들어오면) rear는 다시 0부터 시작-> idx의 값은 0이 된다.
			//인덱스는 항상 front, front+1, front+2,..., 0만 반복할 수 밖에 없다
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
	
	public void dump() {//Queue의 모든 데이터를 front -> rear순으로 모두 출력
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

public class p148_Ex4_3{
	
}
