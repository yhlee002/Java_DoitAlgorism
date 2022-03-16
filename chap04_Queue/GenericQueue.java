package chap04_Queue;

public class GenericQueue {

    static class EmptyQueueException extends Exception {
    }

    static class GQueue<E> {
        private int front; // 데이터가 나가는 인덱스
        private int rear; // 다음 데이터가 들어오는 인덱스
        private int num; // 데이터 수
        private int max; // 최대 데이터 수용량
        private E[] queue;

        public GQueue(int capacity) {
            this.max = capacity;
            front = rear = num = 0;
            queue = (E[]) new Object[max];
        }

        public E enqueque(E element) {
            // 큐의 용량이 가득 찼는데도 데이터가 삽입되면 Exception을 발생시킬 것이 아니라, num은 그대로, 삽입된지 가장 오래된 데이터 자리에 삽입
            if (num < max) {
                num++;
            }

            queue[rear++] = element;

            if (rear == max) {
                rear = 0;
            }

            return element;
        }

        public E dequeue() throws EmptyQueueException {
            if (num == 0) {
                System.out.println("큐가 비어 있습니다.");
                throw new EmptyQueueException();
            }

            E element = queue[front];
            front++;

            if (front == max) {
                front = 0;
            }

            num--;

            return element;
        }

        public int indexOf(E element) {
            for (int i = 0; i < num; i++) {
                int idx = (front + i) % max;
                if (queue[idx] == element) {
                    return idx;
                }
            }
            return -1;
        }

        public void dump() {
            System.out.println("[");
            for (int i = 0; i < num; i++) {
                int idx = (front + i) % max;
                System.out.print(queue[idx] + " ");
            }
            System.out.println("]");
        }

        public int size() {
            return num;
        }

        public int capacity() {
            return max;
        }

        public void clear() {
            front = rear = num = 0;
        }

    }
}
