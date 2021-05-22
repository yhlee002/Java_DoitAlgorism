package chap03_Search;

import java.util.Scanner;

public class p115_Q2_retry {
    /**
     * Q2 재작성(책에 제시된 예시가 아닌 값을 입력받는 방식으로 변경)
     * 선형 검색(보초법 사용 X)의 스캐닝 과정 상세 출력
     *
     * 맨 윗줄, 두번째 줄(---+---...)은 한 줄 출력만(총 실행 횟수가 아닌 총 인덱스 표현)
     * 두 가지 반복문이 큰 하나의 반복문 안에서 실행되어야 함
     * 1) System.out.printf("%4s %2n", "|", "*"); 형태로 현재 실행되는 인덱스를 표시하기 위한 '*' 출력
     * 2) System.out.printf("%3d|"); 한번과 요솟수만큼 System.out.printf("%3d", a[i]);가 반복되는 반복문 1
     */

    public static void scanSeqSearch(int[] a, int key) {
        // '   |   0   1   2   3 ...'
        System.out.printf("%4s", "|");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();

        // '---+---- ...'
        System.out.printf("%3s+", "-");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%s", "----");
        }
        System.out.println();

        // '   | *'
        // '  0| x  y  z  ...
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4s", "|");
            for (int k = 0; k < 2 + (i * 4); k++) {
                System.out.print(" ");
            }
            System.out.printf("%s", "*");
            System.out.println();

            System.out.printf("%3d|", i);
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%3d ", a[j]);
            }
            System.out.println();

            if (a[i] == key) {
                result = i;
                break;
            }
        }
        System.out.println(key + "는(은) a[" + result + "]에 있습니다.");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 요솟수를 입력하세요.");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("배열의 요소를 입력하세요.");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("검색하고자 하는 값을 입력하세요.");
        int key = sc.nextInt();

        scanSeqSearch(a, key);
    }
}
