package chap05_recursive;

/*
    분기 한정법 - 8룩(Rook) 문제
    8X8 체스판에서 각 열과 행에 1개의 퀸 배치 (Ex5_7에 '각 행에 1개의 퀸' 조건 추가)
 */
public class p191_Ex5_8 {
    static int[] pos = new int[8]; // 해당 열의 퀸이 위치한 행
    static boolean[] flag = new boolean[8]; // 해당 행에 퀸의 배치 유무

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
    }

    static void set(int n) {
        for (int j = 0; j < 8; j++) {
            if (flag[j]) continue;

            pos[n] = j;
            if (n == 7) {
                print();
            } else {
                flag[j] = true;
                set(n + 1);
                flag[j] = false; // 가장 큰 줄기(첫번째 열)가 끝날 때는 해당 열의 퀸에 대해 flag 초기화시켜줄 것

            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
