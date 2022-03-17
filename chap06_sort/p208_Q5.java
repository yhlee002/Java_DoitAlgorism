package chap06_sort;

// 양방향 버블 정렬(bidirection bubble sort; cocktail sort, shaker sort)
/*
    다음 배열은 홀수 번째의 패스는 가장 작은 요소를 맨 앞으로 옮기고,
    짝수 번째 패스는 가장 큰 요소를 맨 뒤로 옮기는 방식을 사용하는 것이 더 적은 횟수로 정렬할 수 있다.
    int[] arr = {9, 1, 3 , 4, 6, 7, 8}
    
    Todo. start, last 변수 사용한 부분 유의하기
 */

import java.util.Arrays;

public class p208_Q5 {

    static void swap(int[] arr, int j) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
    }

    static int[] set(int[] arr, int size) {
        int proc = 0; // 비교 횟수
        int change = 0; // 교환 횟수
        int start = 0;
        int last = size - 1;

        for (int x = 0; x < size - 1; x++) {
            if ((x + 1) % 2 == 0) {
                for (int j = last; j > start; j--) {
                    if (arr[j - 1] > arr[j]) {
                        swap(arr, j);
                        change++;
                    }
                    start = j;
                    proc++;
                }
            } else {

                for (int j = start; j < size - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j + 1);
                        change++;
                    }
                    last = j;
                    proc++;
                }
            }

        }
        System.out.printf("비교 횟수 : %d, 교환 횟수 : %d\n", proc, change);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 4, 6, 7, 8};
        arr = set(arr, arr.length);
        System.out.println(Arrays.toString(arr)); // [1, 3, 4, 6, 7, 8, 9]
        /*
         start, last 변수를 사용하지 않았을 때의 비교 횟수 : 36, 교환 횟수 : 6
         start, last 변수를 사용했을 때의 비교 횟수 : 9, 교환 횟수 : 6
         */
    }
}
