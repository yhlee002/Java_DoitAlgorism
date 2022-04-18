package chap06_sort;

import chap05_recursive.EmptyIntStackException;
import chap05_recursive.IntStack;
import chap05_recursive.OverflowIntStackException;

import java.util.Arrays;

// Ex6-9(재귀 버전), Ex6-10(비재귀 버전)를 요소의 개수가 적은 그룹을 먼저 나누는 메소드로 수정
public class p239_Q12 {
  static IntStack lStack = new IntStack(100);
  static IntStack rStack = new IntStack(100);

  static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  static void quickSortRecursive(int[] arr, int left, int right) {
    int pl = left;
    int pr = right;
    int piv = arr[(pl + pr) / 2];

    do {
      while (arr[pl] < piv) pl++;
      while (arr[pr] > piv) pr--;

      if (pl <= pr) swap(arr, pl++, pr--);
    } while (pl <= pr);

    if (pr - left < right - pl) {
      if (left < pr) quickSortRecursive(arr, left, pr);
      if (right > pl) quickSortRecursive(arr, pl, right);

    } else {
      if (right > pl) quickSortRecursive(arr, pl, right);
      if (left < pr) quickSortRecursive(arr, left, pr);
    }
  }

  static void quickSortNonRecursive(int[] arr, int left, int right) throws OverflowIntStackException, EmptyIntStackException {
    lStack.push(left);
    rStack.push(right);

    while (!lStack.isEmpty()) {
      int tempLeft = lStack.pop();
      int tempRight = rStack.pop();
      int pl = tempLeft;
      int pr = tempRight;
      int piv = arr[(pl + pr) / 2];

      do {
        while (arr[pl] < piv) pl++;
        while (arr[pr] > piv) pr--;

        if (pl <= pr) swap(arr, pl++, pr--);
      } while (pl <= pr);

      if (pr - tempLeft < tempRight - pl) {
        if (tempLeft < pr) {
          lStack.push(tempLeft);
          rStack.push(pr);
        }

        if (pl < tempRight) {
          lStack.push(pl);
          rStack.push(tempRight);
        }
      } else {
        if (pl < tempRight) {
          lStack.push(pl);
          rStack.push(tempRight);
        }

        if (tempLeft < pr) {
          lStack.push(tempLeft);
          rStack.push(pr);
        }
      }
    }
  }

  public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
    int[] arr = {1, 8, 7, 4, 5, 2, 6, 3, 9};
    int[] arr2 = {1, 8, 7, 4, 5, 2, 6, 3, 9};
    quickSortRecursive(arr, 0, arr.length - 1);
    quickSortNonRecursive(arr2, 0, arr2.length - 1);

    System.out.println("Ex6-9(Recursive Quick Sort) 개선 함수 결과 : " + Arrays.toString(arr));
    System.out.println("Ex6-10(Non-Recursive Quick Sort) 개선 함수 결과 : " + Arrays.toString(arr2));
  }
}
