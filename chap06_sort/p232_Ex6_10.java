package chap06_sort;

import chap05_recursive.EmptyIntStackException;
import chap05_recursive.OverflowIntStackException;
import chap05_recursive.IntStack;

import java.util.Arrays;

// QuickSort (비재귀화)
public class p232_Ex6_10 {
  static IntStack lStack = new IntStack(100);
  static IntStack rStack = new IntStack(100);

  static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  static void quickSort(int[] arr, int left, int right) throws OverflowIntStackException, EmptyIntStackException {

    lStack.push(left);
    rStack.push(right);

    while (!lStack.isEmpty()) {
      int pl = left = lStack.pop();
      int pr = right = rStack.pop();
      int piv = arr[(pl + pr) / 2];

      do {
        while (arr[pl] < piv) pl++;
        while (arr[pr] > piv) pr--;

        System.out.println("현재 상태 : " + Arrays.toString(arr));
        System.out.println("교환하려는 값 : " + arr[pl] + ", " + arr[pr]);

        if (pl <= pr) {
          swap(arr, pl++, pr--);
        }
      } while (pl <= pr);

      if (left < pr) {
        lStack.push(left);
        rStack.push(pr);
      }
      if (right > pl) {
        lStack.push(pl);
        rStack.push(right);
      }
    }
    System.out.println("결과 : " + Arrays.toString(arr));;
  }

  public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
    int[] arr = {1, 8, 7, 4, 5, 2, 6, 3, 9};
    quickSort(arr, 0, arr.length - 1);
  }
}
