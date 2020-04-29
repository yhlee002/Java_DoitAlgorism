package chap04_Queue;

//Q4) 큐를 구현하는 프로그램 작성(cf.Queue : FIFO) *FIFO(First In First Out)
public class p146_Q4 {
	private int max; //큐 용량
	private int num; //현재 데이터 수
	private int[] que; //큐 본체
	//데이터를 꺼내는 쪽 : 프런트(front), 데이터를 넣는 쪽 : 리어(rear) *리어는 마지막 요소의 인덱스 보다 1많다.
	
	public p146_Q4(int capacity){
		max = capacity;
		que = new int[max];
		num = 0;
	}
	
	public void enqueue(int x) {
		que[num++] = x;
	}
	
	public void dequeue() {
		--num;
		for(int i = 0; i < num; i++) { //num을 위에서 하나 줄였으니, 'num - 1' 이 아닌 'num'전까지
			que[i] = que[i+1];
		}
	}
	
}
