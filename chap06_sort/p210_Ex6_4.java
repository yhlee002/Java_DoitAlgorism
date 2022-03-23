package chap06_sort;

import java.util.Arrays;

/*
    [단순 선택 정렬]
    1. 정렬되지 않은 부분에서 가장 작은 키의 값을 선택
    2. 아직 정렬하지 않는 부분의 가장 첫 인덱스 값과 교환
    [개선이 필요한 부분] 아래 코드에서 first 변수는 i와 항상 같기 때문에, i로 대체하면 코드가 훨씬 간결해짐
 */
public class p210_Ex6_4 {
    static void selectionSort(int[] arr, int n) {
        int first = 0; // 정렬되지 않은 수들의 첫번째 인덱스
        for (int i = 0; i < n - 1; i++) { // 패스 수 : 배열의 요솟수 - 1
            int minIdx = first;

            for (int j = first; j < n - 1; j++) {
                minIdx = arr[j] < arr[minIdx] ? j : minIdx;
            }

            int temp = arr[first];
            arr[first] = arr[minIdx];
            arr[minIdx] = temp;

            first++;
        }

        System.out.println("결과 : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 7, 8, 1, 9};
        selectionSort(arr, arr.length);
    }
}
