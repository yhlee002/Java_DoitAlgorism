package chap04_Queue;

//Q4) 큐를 구현하는 프로그램(IntAryQueue) 작성(cf.Queue : FIFO) *FIFO(First In First Out)
public class p146_Q4 {
    static class IntAryQueue {
        private int max; //큐 용량
        private int num; //현재 데이터 수(= 다음 데이터가 들어올 인덱스. = rear와 같은 값)
        private int[] que; //큐 본체
        //데이터를 꺼내는 쪽 : 프런트(front), 데이터를 넣는 쪽 : 리어(rear) *리어는 마지막 요소의 인덱스 보다 1많다.

        public IntAryQueue(int capacity) {
            max = capacity;
            que = new int[max];
            num = 0;
        }

        public void enqueue(int x) {
            que[num++] = x;
        }

        public void dequeue() {
            --num;
            for (int i = 0; i < num; i++) { // 'num - 1' 이 아닌 'num'전까지 반복하는 것은 가장 마지막 데이터는 앞으로 당기지 않기 때문
                que[i] = que[i + 1];
            }
        }

        public int peek() {
            return que[num - 1];
        }

        public int capacity() {
            return max;
        }

        public int size() {
            return num;
        }

        public void clear() {
            num = 0;
        }

        public int indexOf(int x) {
            for (int i = 0; i < num; i++) {
                if (que[i] == x) {
                    return i;
                }
            }
            return -1;
        }

        // stack, queue 모두에서 dump 메소드는 최초에 저장된 데이터부터 가장 마지막에 저장된 데이터까지를 순차적으로 출력
        public void dump() {
            System.out.print("[");
            for (int i = 0; i < num; i++) {
                if (i != num - 1) {
                    System.out.print(que[i] + ", ");
                } else {
                    System.out.print(que[i]);
                }
            }
            System.out.println("]");
        }

    }

    public static void main(String[] args) {
        IntAryQueue que = new IntAryQueue(10);
        que.enqueue(1);
        que.enqueue(2);
        que.dump();
        que.enqueue(3);
        que.dump();
        que.dequeue();
        que.dump();
    }

}
