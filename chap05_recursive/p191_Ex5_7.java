package chap05_recursive;

// 8X8 체스판에서 각 열에 1개의 퀸을 배치
public class p191_Ex5_7 {
    static int[] pos = new int[8]; // 해당 열의 퀸이 위치한 행

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
    }

    static void set(int n) {
        for (int j = 0; j < 8; j++) {
            pos[n] = j;
            if (n == 7) {
                print();
            } else {
                set(n + 1);
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
