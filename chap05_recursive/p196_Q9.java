package chap05_recursive;

// 8퀸 문제를 비재귀적으로 구현한 프로그램 작성
public class p196_Q9 {
    static IntStack xStack = new IntStack(100);
    static IntStack yStack = new IntStack(100);
    static int[] pos = new int[8];
    static boolean[] aFlag = new boolean[8];
    static boolean[] bFlag = new boolean[15];
    static boolean[] cFlag = new boolean[15];

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
    }

    static void set(int x) throws OverflowIntStackException, EmptyIntStackException {
        int y = 7;
        while (x >= 0) {
            while (y >= 0) {
                xStack.push(x);
                yStack.push(y--);
            }

            continue;
        }

        x = xStack.pop(); // 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, ... , 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7
        y = yStack.pop(); // 0, 1, 2, 3, 4, 5, 6, 7, 0, 1, ... , 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7
        while (!aFlag[y] && !bFlag[x + y] && !cFlag[x - y + 7]) {
            pos[x] = y;
            if (x == 7) {
                print();
            } else {
                aFlag[y] = bFlag[x + y] = cFlag[x - y + 7] = true;
            }

            if (xStack.isEmpty() && yStack.isEmpty()) { // y == 7?
                return;
            }

            x = 0;
            y = 7;
        }
    }

    public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
        set(0);
    }
}
