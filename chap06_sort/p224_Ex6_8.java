package chap06_sort;

/*
 Quick Sort(완전한 퀵정렬 알고리즘 X. 전체적인 비교 및 교환을 1차만 수행)
 1. 가장 첫 인덱스를 pl, 마지막 인덱스를 pr로 삼고 (pl + pr)/2 값을 피벗(pivot)으로 삼음
 2. pl과 pr을 좌우에서 교차할 때까지 인덱스를 옮겨가며 교환할 값 구함
  2-1. pl ~ 교차 지점까지는 피벗값보다 큰 수, pr ~ 교차 지점까지는 피벗값보다 작은 수일 때 멈춰서 pl값과 pr값을 변경
  2-2. 교차할 때, pl과 pr이 같은 인덱스이거나 다른 인덱스여도 값이 같을 경우에는 교환함 ex) 'pl = 3, pr = 3, arr[3] = 5'인 경우, 'pl = 3, pr = 4, arr[3] = arr[4] = 5'인 경우
  3. 정렬이 완료된 후
    3-1.피벗보다 작은 값의 그룹 : 0 ~ pr
    3-2.피벗과 값이 일치하는 그룹 : pr + 1 ~ pl - 1
    3-3.피벗보다 큰 값의 그룹 : pl ~ last
 */

import java.util.Arrays;

public class p224_Ex6_8 {
  static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  static void sort(int[] arr) {
    int pl = 0; // 0
    int pr = arr.length - 1; // arr.length - 1
    int piv = arr[(pl + pr) / 2];

    do {
      while (arr[pl] < piv) pl++;
      while (arr[pr] > piv) pr--;
      if (pl <= pr)
        swap(arr, pl++, pr--);
    } while (pl <= pr);

    System.out.println("Result : " + Arrays.toString(arr));
    System.out.println("Pivot : " + piv);
    System.out.print("피벗 값 이하의 그룹 : [");
    for (int i = 0; i < pr + 1; i++) {
      System.out.print(arr[i]);
    }
    System.out.println("]");

    System.out.print("피벗 값과 일치하는 그룹 : [");
    for (int i = pr + 1; i < pl; i++) {
      System.out.print(arr[i]);
    }
    System.out.println("]");

    System.out.print("피벗 값 이상의 그룹 : [");
    for (int i = pl; i < arr.length - 1; i++) {
      System.out.print(arr[i]);
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    int[] arr = {1, 8, 7, 4, 5, 2, 6, 3, 9};
    sort(arr);
  }
}
