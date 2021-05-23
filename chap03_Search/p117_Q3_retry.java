package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

/*Q3) 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의
 * 맨 앞부터 순서대로 저장하고, 일치한 요솟수를 반환하는 메소드를 작성하세요.
 * ex) 요솟수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고, key가 9면
 * 배열 idx에 {1, 3, 7}을 저장하고 3을 반환합니다.
 * static searchIdx(int[] a, int n, int key, int[] idx)
 */

/** 문제에서 변수 'idx'의 타입으로 int타입 배열이 고정되어 있는 것이 아니라면 List 사용이 훨씬 좋을 것으로 여겨짐 */
public class p117_Q3_retry {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[j] = i;
                j++;
            }
        }
        System.out.println("배열 idx : " + Arrays.toString(idx));
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수를 입력하세요.");
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] idx = new int[num];

        System.out.println("배열의 요소를 입력하세요.");
        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("찾고자 하는 값을 입력하세요.");
        int key = sc.nextInt();

        int result = searchIdx(a, num, key, idx);
        System.out.println("매칭되는 값의 수는 \'" + result + "개\' 입니다.");
    }
}
