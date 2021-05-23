package chap04_stack;

import java.util.Arrays;

// 실습 4-1(재작성)
public class p136_Ex4_1_retry { // 스택 구현
    private int max;
    private int ptr;
    private int[] stack;

    public class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
        } // 스택이 비어 있는 상태에서 pop 하고자 할 때
    }

    public class OverflowStackException extends RuntimeException {
        public OverflowStackException() {
        } // 스택이 가득 차있는 상태에서 push 하고자 할 때
    }

    public p136_Ex4_1_retry(int capacity) { // 스택 생성자
        this.max = capacity;
        ptr = 0;
        try {
            stack = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowStackException {
        if (ptr >= max) {
            throw new OverflowStackException();
        }
        return stack[ptr++] = x;
    }

    public int pop(int x) throws EmptyStackException {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }
        return stack[--ptr];
    }

    public int peek() throws EmptyStackException { // 가장 꼭대기의(마지막에 들어온) 데이터를 엿보는 메소드(제거 X)
        if (ptr <= 0) {
            throw new EmptyStackException();
        }
        return stack[ptr - 1];
    }

    public int indexOf(int x) { // 값 검색 메소드(가장 먼저 pop 될 값부터 찾음)
        for (int i = ptr - 1; i >= 0; i++) {
            if (stack[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void clear() { // 스택 비우기(모든 데이터 삭제)
        ptr = 0;
    }

    public int capacity() { // 스택 용량 확인
        return max;
    }

    public int size() { // 데이터 수 확인
        return ptr;
    }

    public boolean isEmpty() {
        if (ptr == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (ptr == max) {
            return true;
        }
        return false;
    }

    public void dump() { // 스택의 모든 데이터를 표시
        if (ptr == 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
//            for (int i = 0; i < ptr; i++) {
//                System.out.print(stack[i] + " ");
//            }
            System.out.println(Arrays.toString(stack));
        }
    }

    public static void main(String[] args) {

    }
}
