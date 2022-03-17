package chap06_sort;

import java.util.Arrays;

// 버블 정렬 코드 개선하기 - 순서를 바꾸지 않아도 될 때는 비교, 교환 X 하는 코드를 다시 개선
public class p207_Ex6_3 {
  static void swap(int[] arr, int i) {
    int temp = arr[i - 1];
    arr[i - 1] = arr[i];
    arr[i] = temp;
  }

  static int[] bubbleSort(int[] arr, int size) {
    int k = 0;
    while (k < size - 1) {
      int last = size - 1;
      for (int j = size - 1; j > k; j--) {
        if (arr[j - 1] > arr[j]) {
          swap(arr, j);
          last = j;
        }
      }
      k = last;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 6, 4, 3, 7, 8, 9};
    arr = bubbleSort(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }
}
