package chap05_recursive;

// 8퀸 문제 - 각 열, 행, 대각선으로 퀸끼리 공격할 수 없도록 (이동할 수 없도록) 배치
public class p194_Ex5_9 {
    static int[] pos = new int[8];
    static boolean[] aFlag = new boolean[8]; // 각 행의 퀸이 위치한 열
    static boolean[] bFlag = new boolean[15]; // 우상향 대각선 - 각 칸을 0 ~ 14의 고유한 위치로 인식(x + y의 합)
    static boolean[] cFlag = new boolean[15]; // 우하향 대각선 - 각 칸을 0 ~ 14의 고유한 위치로 인식(x - y + 7의 합)

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
    }

    static void set(int n) {
        for (int j = 0; j < 8; j++) {
            if (!aFlag[j] && !bFlag[n + j] && !cFlag[n - j + 7]) {
                pos[n] = j;

                if (n == 7) {
                    print();
                } else {
                    aFlag[j] = bFlag[n + j] = cFlag[n - j + 7] = true;
                    set(n + 1);
                    aFlag[j] = bFlag[n + j] = cFlag[n - j + 7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
