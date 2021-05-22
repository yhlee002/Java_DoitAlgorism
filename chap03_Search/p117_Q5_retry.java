package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이진 검색시 가장 먼저 가운데에 존재하는 인덱스부터 검색하기 때문에 검색값과 일치하는 '가장 앞의 값의 인덱스'를 찾을 수 없다.
 * 이를 위해 이진 검색 중 값을 찾게 되면 이로부터 앞으로 한 인덱스씩 이동하며 검색하도록 한다.
 */
public class p117_Q5_retry {
    private static int binSearch2(int[] a, int key) {
        Arrays.sort(a);
        System.out.println("정렬된 배열 a = " + Arrays.toString(a));

        int pl = 0;
        int pr = a.length - 1;
        int matchingFirst = 0;
        for (int i = 0; i < a.length; i++) {
            int pc = (pl + pr) / 2;
            if (key == a[pc]) {
                matchingFirst = pc;

                while (pc > 0) { // 일치하는 값이 존재할 경우 앞으로 인덱스를 옮겨가며 순차 검색
                    --pc;
                    if (key == a[pc]) {
                        matchingFirst = pc;
                    }
                }
                return matchingFirst;

            } else if (key < a[pc]) {
                pr = pc - 1;
            } else {
                pl = pc + 1;
            }
        }
        return -1; // 일치하는 값 X
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {1, 0, 2, 4, 6, 5, 3, 3, 3, 3, 6, 7, 7, 2, 3};
        System.out.println("검색하고자하는 값을 입력하세요.");
        int key = sc.nextInt();

        int result = binSearch2(a, key);
        if (result == -1) {
            System.out.println("매칭되는 값이 없습니다.");
        } else {
            System.out.println("검색하신 값(" + key + ")과 매칭되는 값 중 가장 앞에 존재하는 인덱스는 " + result + "");
        }

        sc.close();
    }
}
