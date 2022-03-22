package chap06_sort;

import java.util.Arrays;

/*
   버블 정렬(Ex6-2)의 비교, 교환 과정을 자세히 출력하는 프로그램 작성

   cf. 비교한 후 교환할 때는 '+', 교환하지 않을 경우에는 '-'
   패스 1
   1 6 4 3 7 8-9
   1 6 4 3 7-8 9
   1 6 4 3-7 8 9
   1 6 4+3 7 8 9
   ...
   패스 2
   ...
 */

public class p206_Q3 {
  static int[] swap(int[] arr, int i) {
    int temp = arr[i - 1];
    arr[i - 1] = arr[i];
    arr[i] = temp;

    return arr;
  }

  static void print(int[] arr, int i, boolean flag) {
    String mark = "-";
    if (flag) mark = "+";

    for (int j = 0; j < arr.length; j++) {
      if (j == i) {
        System.out.printf("%1s%d", mark, arr[j]);
      } else {
        System.out.printf("%2d", arr[j]);
      }
    }
    System.out.println();
  }

  static int[] bubbleSort(int[] arr, int size) {
    for (int k = 0; k < size - 1; k++) {
      int chg = 0;
      System.out.println("패스" + (k + 1));
      for (int i = size - 1; i > k; i--) { // i번 째 패스는 인덱스 'i'까지의 값이 고정되는 점을 이용
        boolean flag = false;
        if (arr[i - 1] > arr[i]) flag = true;
        print(arr, i, flag);
        if (flag) {
          arr = swap(arr, i);
          chg++;
        }
      }
      if (chg == 0) break;
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 6, 4, 3, 7, 8, 9};
    arr = bubbleSort(arr, arr.length);
    System.out.println("결과 : " + Arrays.toString(arr));
  }
}
