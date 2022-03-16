package chap05_recursive;

// Ex5-9의 print 메소드를 수정해 전각 기호 '■'와 '□'를 사용해 퀸의 배치 상황을 출력(print 메소드만 상이)
public class p196_Q8 {
    static int[] pos = new int[8];
    static boolean[] aFlag = new boolean[8];
    static boolean[] bFlag = new boolean[15];
    static boolean[] cFlag = new boolean[15];

    // 1) 비재귀 함수로 구현한 방식
    static void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pos[i] == j) {
                    System.out.printf("%2d", "■");
                } else {
                    System.out.printf("%2d", "□");
                }
            }
        }
    }

    // 2) 재귀 함수로 구현한 방식
    static int x = 0;
    static int y = 0;

    static void print2() {
        while (x++ < 8) {
            while (y++ < 8) {
                if (pos[x] == y) {
                    System.out.printf("%2d", "■");
                } else {
                    System.out.printf("%2d", "□");
                }

                print2();
            }
        }
    }

    // 아래의 set() 메소드와 main() 메소드는 Ex5-9와 동일
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
