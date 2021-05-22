package chap03_Search;

import java.util.Arrays;

/**
 * Q4 재작성(책에 제시된 예시가 아닌 값을 입력받는 방식으로 변경)
 */

public class p117_Q4_retry {
    private static void scanSearch(int[] a, int n, int key) {
        Arrays.sort(a);

        // ' |0 1 2 ...'
        System.out.printf("%2s", "|");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-2d", a[i]);
        }
        System.out.println();

        // '------ ...'
        for (int i = 0; i < n + 1; i++) {
            System.out.printf("%2s", "--");
        }
        System.out.println();

        int pl = 0;
        int pr = n - 1;
        for (int i = 0; i < n; i++) {
            int pc = (pl + pr) / 2;

            // ' |<- .. + .. ->'
            // ' |'
            System.out.printf("%2s", "|");

            // '<-'
            for (int j = 0; j < (2 * pl); j++) {
                System.out.printf(" ");
            }
            System.out.printf("%2s", "<-");

            // ' +'
            for (int j = 0; j < 2 * (pc - pl) - 2; j++) { // '- 2'를 하는 이유 : '<-' 때문
                System.out.printf(" ");
            }
            System.out.printf("%s", "+");

            // '->'
            for (int j = 0; j < 2 * (pr - pc) - 2; j++) { // '- 2 * 2'를 하는 이유 : '<-'와 ' +' 때문
                System.out.printf(" ");
            }
            System.out.printf("%s", "->");

            System.out.println();

            // ' | x y z ...'
            System.out.printf("%2s", "|");
            for (int x : a) {
                System.out.printf("%-2d", x);
            }

            System.out.println();

            if (key == a[pc]) {
                System.out.println("해당 값(" + key + ")은 \'인덱스 [" + i + "]\'에 있습니다.");
                break;
            } else if (key < a[pc]) {
                pr = pc - 1;
            } else { // key > a[pc]
                pl = pc + 1;
            }
        }
    }

    private static void scanSearch2(int[] a, int n, int key) {
        Arrays.sort(a);

        // ' | 0 1 2 ...'
        System.out.printf("%2s", "|");
        for (int i = 0; i < n; i++) {
            System.out.printf("%2d", a[i]);
        }
        System.out.println();

        // '------ ...'
        for (int i = 0; i < n + 1; i++) {
            System.out.printf("%2s", "--");
        }
        System.out.println();

        int pl = 0;
        int pr = n - 1;
        for (int i = 0; i < n; i++) {
            int pc = (pl + pr) / 2;

            // ' | <- .. + .. ->'
            // ' |'
            System.out.printf("%2s", "|");

            // ' <-'
            for (int j = 0; j < (2 * pl) + 1; j++) { // ' + 1'을 하는 이유 : '<-'앞의 한 칸을 비우기 위해(숫자들 정렬과 관련)
                System.out.printf(" ");
            }
            System.out.printf("%2s", "<-");

            // ' +'
            for (int j = 0; j < 2 * (pc - pl) - 2; j++) { // '- 2'를 하는 이유 : '<-' 때문
                System.out.printf(" ");
            }
            System.out.printf("%s", "+");

            // '->'
            for (int j = 0; j < 2 * (pr - pc) - 2; j++) { // '- 2 * 2'를 하는 이유 : '<-'와 ' +' 때문
                System.out.printf(" ");
            }
            System.out.printf("%s", "->");

            System.out.println();

            // ' | x y z ...'
            System.out.printf("%2s", "|");
            for (int x : a) {
                System.out.printf("%2d", x);
            }

            System.out.println();

            if (key == a[pc]) {
                System.out.println("해당 값(" + key + ")은 \'인덱스 [" + i + "]\'에 있습니다.");
                break;
            } else if (key < a[pc]) {
                pr = pc - 1;
            } else { // key > a[pc]
                pl = pc + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 9}; // 7. pl = 0, pc = 3, pr = 6
        int key = 8;

        scanSearch(arr, arr.length, key);
        scanSearch2(arr, arr.length, key);
    }
}
