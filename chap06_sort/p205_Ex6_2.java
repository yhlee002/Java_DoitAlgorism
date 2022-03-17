package chap06_sort;

import java.util.Arrays;

// 버블 정렬 코드 개선하기 - 순서를 바꾸지 않아도 될 때는 비교, 교환 X
public class p205_Ex6_2 {
  static void swap(int[] arr, int i) {
    int temp = arr[i - 1];
    arr[i - 1] = arr[i];
    arr[i] = temp;
  }

  static int[] bubbleSort(int[] arr, int size) {
    for (int i = 0; i < size - 1; i++) {
      int change = 0;
      for (int j = size - 1; j > i; j--) {
        if (arr[j - 1] > arr[j]) {
          swap(arr, j);
          change++; // 교환이 필요한지 확인
        }
      }
      if (change == 0) break;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 6, 4, 3, 7, 8, 9};
    arr = bubbleSort(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }
}
