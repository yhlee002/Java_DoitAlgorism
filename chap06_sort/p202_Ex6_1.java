package chap06_sort;

import java.util.Arrays;

// 버블 정렬 1
public class p202_Ex6_1 {

  static void swap(int[] arr, int i) {
    int temp = arr[i - 1];
    arr[i - 1] = arr[i];
    arr[i] = temp;
  }

  static int[] bubbleSort(int[] arr, int size) {
    for(int i = 0; i < size - 2; i++) { // 배열의 크기보다 1 작게 실행(비교하는 횟수는 size - 1)
      for (int j = size - 1; j > i; j--) {
        if (arr[j - 1] > arr[j]) {
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
