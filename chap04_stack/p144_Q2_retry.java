package chap04_stack;

// Q2) Generic Stack 구현 재작성
public class p144_Q2_retry {

    static class GenericStackOverflowException extends Exception {
        public GenericStackOverflowException(String msg) {
        }
    }

    static class GenericStackEmptyException extends Exception {
        public GenericStackEmptyException(String msg) {
        }
    }

    static class GStack<E> {
        private int max;
        private int ptr;
        private E[] stack;

        public GStack(int capacity) {
            this.max = capacity;
            this.ptr = 0;
            stack = (E[]) new Object[max];
        }

        public E push(E x) throws GenericStackOverflowException {
            if (ptr >= max) {
                throw new GenericStackOverflowException("스택이 가득 찼습니다.");
            }
            return stack[ptr++] = x;
        }

        public E pop(E x) throws GenericStackEmptyException {
            if (ptr <= 0) {
                throw new GenericStackEmptyException("스택이 비어 있습니다.");
            }
            return stack[--ptr];
        }

        public E peek() throws GenericStackEmptyException {
            if (ptr <= 0) {
                throw new GenericStackEmptyException("스택이 비어 있습니다.");
            }
            return stack[ptr - 1];
        }

        public void dump() {
            String str = "";
            str += "[";
            for (int i = 0; i < ptr; i++) {
                str += stack[i] + " ";
            }
            str = str.trim() + "]";
            System.out.println(str);
        }

        public void clear() {
            ptr = 0;
        }

        public int capacity() {
            return max;
        }

        public int size() {
            return ptr;
        }

        public boolean isEmpty() {
            return ptr == 0;
        }

        public boolean isFull() {
            return ptr == max;
        }

        public int indexOf(E x) {
            for (int i = ptr - 1; i >= 0; i--) {
                if (stack[i].equals(x)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
