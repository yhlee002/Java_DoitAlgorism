package chap06_sort;

import java.util.Arrays;

// 버블정렬 역순(0 -> n-1 방향)으로 비교, 교환
public class p204_Q1 {
  static void swap(int[] arr, int i) {
    int temp = arr[i];
    arr[i] = arr[i + 1];
    arr[i + 1] = temp;
  }

  static int[] bubbleSort(int[] arr, int size) {
    int k = size - 1;
    while (k > 0) {
      for (int j = 0; j < k; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j);
        }
      }
      k--;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 6, 4, 3, 7, 8, 9};
    arr = bubbleSort(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }
}
