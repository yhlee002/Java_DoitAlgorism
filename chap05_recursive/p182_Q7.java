package chap05_recursive;

// 재귀함수(Ex5-6; 하노이의 탑 문제)의 재귀 제거
/*
    static void move(int n, int x, int y) {
        if (n > 1) move(n - 1, x, 6 - x - y);
        System.out.println("1개의 원반을 " + x + "번째 고리에서 " + y + "번째 고리로 이동시켰습니다.");
        if (n > 1) move(n - 1, 6 - x - y, y);
    }
*/
public class p182_Q7 {
    static IntStack nStack = new IntStack(100);
    static IntStack xStack = new IntStack(100);
    static IntStack yStack = new IntStack(100);
    static IntStack stepStack = new IntStack(100);
    static int step = 0;

    static void move(int n, int x, int y) throws EmptyIntStackException, OverflowIntStackException {
        while (n > 0) {
            if (n > 1) {
                nStack.push(n);
                xStack.push(x);
                yStack.push(y);
                stepStack.push(step);

                n = n - 1;
                if (step == 0) {
                    y = 6 - x - y;
                } else if (step == 1) {

                } else if (step == 2) {
                    x = 6 - x - y;
                    step = 0;
                }
                continue;
            }

            do {
                n = nStack.pop(); // 2, 2
                x = xStack.pop(); // 1,
                y = yStack.pop(); // 3,
                step = stepStack.pop() + 1; // [0, 0]

                if (step == 1) {
                    System.out.println("1개의 원반을 " + x + "번째 고리에서 " + y + "번째 고리로 이동시켰습니다.");
                }
                if (nStack.isEmpty()) return;
            } while (step == 2);
        }
    }

    public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
        move(3, 1, 2);
    }
}
