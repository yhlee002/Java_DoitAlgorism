package chap05_recursive;
// 재귀함수(Ex5-6; 하노이의 탑 문제)의 재귀 제거
/*
    static void move(int n, int x, int y) {
        if (n > 1) move(n - 1, x, 6 - x - y);
        System.out.println("1개의 원반을 " + x + "번째 고리에서 " + y + "번째 고리로 이동시켰습니다.");
        if (n > 1) move(n - 1, 6 - x - y, y);
    }
*/
public class p182_Q7_2 {
    static IntStack nStack = new IntStack(100);
    static IntStack stepStack = new IntStack(100);
    static IntStack xStack = new IntStack(100);
    static IntStack yStack = new IntStack(100);

    static int step = 0;
    static void move(int n, int x, int y) throws OverflowIntStackException, EmptyIntStackException {
        while (true) {
            if (n > 1) {
                nStack.push (n); // [3, 2]
                stepStack.push(step); // [0, 0]

                xStack.push(x); // [1]
                yStack.push(y); // [2]

                n -= 1;
                if (step == 2) { // 여러 개를 최종 목적지에 배치
                    step = 0;
                }

                continue;
            }

            step = stepStack.pop() + 1;
            n = nStack.pop();
            x = xStack.pop();
            y = yStack.pop();

            if (step == 0) {
                y = 6 - x - y;
            }
            if (step == 1) {
                System.out.println("1개의 원반을 [" + x + "]번째 고리에서 [" + y + "]번째 고리로 이동시켰습니다.");
            } else if (step == 2) {
                x = 6 - x - y;
            }

            if (nStack.isEmpty()) return;
        }

    }

    public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
        move(3, 1, 2);
    }
}
