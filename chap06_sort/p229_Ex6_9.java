package chap06_sort;

import java.util.Arrays;

// QuickSort (전체 차수 반복)
// 하노이의 탑과 같이 분할 정복 알고리즘에 해당하므로 재귀적으로 표현 가능
// cf. 재귀를 위해 인자를 left, right(양 끝의 수)로 받음
public class p229_Ex6_9 {
  static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  static void quickSort(int[] arr, int left, int right) {
    int pl = left;
    int pr = right;
    int piv = arr[(pl + pr) / 2];

    do {
      while (arr[pl] < piv) pl++;
      while (arr[pr] > piv) pr--;

      if (pl <= pr) {
        swap(arr, pl++, pr--);
      }
    } while (pl <= pr);

    if (left < pr) quickSort(arr, left, pr);
    if (right > pl) quickSort(arr, pl, right);
  }

  public static void main(String[] args) {
    int[] arr = {1, 8, 7, 4, 5, 2, 6, 3, 9};
    quickSort(arr, 0, arr.length - 1);
  }
}
