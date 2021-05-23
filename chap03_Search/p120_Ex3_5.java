package chap03_Search;

import java.util.Arrays;
import java.util.Scanner;

public class p120_Ex3_5 {
    /**
     * p120의 실습 3-5(int형 배열에서의 사용 방법)
     *
     * 요솟수, 요소들(무조건 오름차순으로 입력되도록 이전 인덱스 값보다 낮으면 다시 입력하게 함), 검색값 입력 받기
     * binarySearch 메소드를 이용해 이진 검색. 반환되는 값에 따라 결과 알려주기
     *
     * Cf. Arrays.binarySearch() : int, long 등 기본 자료형 배열에서 이진 검색을 하는 메소드.
     * [주의] 일치하는 요소가 여러 개 있을 때는 무작위의 인덱스가 반환(맨 앞 혹은 특정 인덱스 X)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하세요.");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("배열의 요소를 입력하세요.");
        for (int i = 0; i < n; i++) {
            System.out.println("[" + i + "] : ");
            if (i == 0) {
                a[i] = sc.nextInt();
            } else {
                int num = 0;
                System.out.println("[" + i + "] : ");
                num = sc.nextInt();
                while (a[i - 1] > num) {
                    System.out.println("이전 인덱스의 값(" + a[i - 1] + ")보다 큰 값을 입력해주세요.");
                    num = sc.nextInt();
                }
                a[i] = num;
            }
        }

        System.out.println("검색하고자 하는 값을 입력하세요.");
        int key = sc.nextInt();

        int result = Arrays.binarySearch(a, key);
        if (result < 0) {
            System.out.println("해당 값과 일치하는 요소를 찾을 수 없습니다.");
        } else {
            System.out.println("해당 값과 일치하는 요소의 인덱스는 \'[" + result + "]\'입니다.");
        }
    }

}
