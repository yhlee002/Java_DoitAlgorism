package chap06_sort;

import chap05_recursive.EmptyIntStackException;
import chap05_recursive.IntStack;
import chap05_recursive.OverflowIntStackException;
import sun.security.util.ArrayUtil;

import java.util.Arrays;

// Ex6_10을 수정하여 푸시, 팝, 분할 과정을 출력하는 프로그램 작성
public class p235_Q11 {
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

    System.out.println("[pl, left push] -> " + left);
    System.out.println("[pr, right push] -> " + right);

    while (!lStack.isEmpty()) {
      int pl = left = lStack.pop();
      int pr = right = rStack.pop();
      int piv = arr[(pl + pr) / 2];

      System.out.println("[pl, left pop] -> " + pl);
      System.out.println("[pr, right pop] -> " + pr);

      do {
        while (arr[pl] < piv) pl++;
        while (arr[pr] > piv) pr--;

        if (pl <= pr) {
          swap(arr, pl++, pr--);
        }
      } while (pl <= pr);
      System.out.println("현재 값 -> pl : " + (pl - 1) + ", pr : " + (pr + 1) + ", piv index : " + Arrays.asList(arr).indexOf(piv));

      System.out.println("분할되는 그룹");
      System.out.print("1) 피벗 미만의 값 그룹 : [");
      String str = "";
      for (int i = left; i < pr + 1; i++) {
        str += arr[i] + ", ";
      }
      int idx = str.lastIndexOf(",");
      if (idx != -1)
        str = str.substring(0, idx);

      System.out.println(str + "]");

      System.out.print("2) 피벗과 동일한 값 그룹 : [");
      str = "";
      for (int i = pr + 1; i < pl; i++) {
        str += arr[i] + ", ";
      }
      idx = str.lastIndexOf(",");
      if (idx != -1)
        str = str.substring(0, idx);

      System.out.println(str + "]");

      System.out.print("3) 피벗 초과의 값 그룹 : [");
      str = "";
      for (int i = pl; i < right; i++) {
        str += arr[i] + ", ";
      }
      idx = str.lastIndexOf(",");
      if (idx != -1)
        str = str.substring(0, idx);

      System.out.println(str + "]");
      System.out.println("[현재 상태] : " + Arrays.toString(arr) + "\n");

      if (left < pr) {
        lStack.push(left);
        rStack.push(pr);
      }
      if (right > pl) {
        lStack.push(pl);
        rStack.push(right);
      }
    }
    System.out.println("결과 : " + Arrays.toString(arr));
    ;
  }

  public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
    int[] arr = {1, 8, 7, 4, 5, 2, 6, 3, 9};
    quickSort(arr, 0, arr.length - 1);
  }
}
