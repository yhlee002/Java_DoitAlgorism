package chap06_sort;

import java.util.Arrays;

/*
    [단순 삽입 정렬]
    1. 정렬되지 않은 부분에서 가장 첫 번째 키의 값을 선택
    2. 정렬된 부분 중 알맞은 위치에 삽입
 */
public class p214_Ex6_5 {
    static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            // 가장 첫번째 키를 정렬된 부분 중 알맞은 위치에 삽입
            // -> 0부터 현재 선택된 값의 위치까지를 정렬하는 것으로 여기면 됨
            int temp = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > temp) { // temp는 항상 arr[j]
                    arr[j] = arr[j - 1]; // 하나 이전의 인덱스값이 들어와야 temp값이 들어갈 자리 생김
                } else {
                    arr[j] = temp;
                }
            }
        }

        System.out.println("결과 : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 7, 8, 1, 9};
        insertionSort(arr, arr.length);
    }
}
