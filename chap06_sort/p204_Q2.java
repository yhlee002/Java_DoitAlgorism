package chap06_sort;

import java.util.Arrays;

/*
 버블정렬의 비교, 교환 과정을 자세히 출력하는 프로그램 작성
 cf. 비교한 후 교환할 때는 '+', 교환하지 않을 경우에는 '-'
 1 6 4 3 7 8-9
 1 6 4 3 7-8 9
 1 6 4 3-7 8 9
 1 6 4+3 7 8 9
 */

public class p204_Q2 {
  static void swap(int[] arr, int i) {
    int temp = arr[i];
    arr[i] = arr[i + 1];
    arr[i + 1] = temp;
  }

  static int[] bubbleSort(int[] arr, int size) {
    int k = size - 1;
    for (int i = 0; i < size - 2; i++) {
      for (int j = 0; j < k; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j);
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 6, 4, 3, 7, 8, 9};
    arr = bubbleSort(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }
}
