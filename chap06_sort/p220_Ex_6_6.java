package chap06_sort;

/*
  ShellSort(단순 삽입 정렬의 장점 + 단점 보완)
  [단순 삽입 정렬의 장단점]
  1. 장점 : 정렬을 마쳤거나 정렬을 마친 상태에 가깝다면 아주 빠르게 진행된다.
  2. 단점 : 위치가 많이 떨어져있으면 삽입(이동)해야 하는 횟수가 많아진다.
  [특징]
  1. 증분값을 사용해 전체 배열을 그룹으로 나누어 각 그룹의 같은 순서의 값끼리 정렬하는 것을 반복(h /= 2)
 */

import java.util.Arrays;

public class p220_Ex_6_6 {

  static int[] insertion(int[] arr) {
    int n = arr.length;
    for (int h = n / 2; h > 0; h /= 2) { // 증분값
      for (int i = h; i < n; i++) { // i 인덱스에 있는 값과 그로부터 h(증분값) 만큼 앞에 존재하는 값을 비교하기 위함
        int temp = arr[i];
        int j; // 아래 for문이 종료될 시점에는 1) 0보다 작거나 2) 0보다 크면서 temp값보다는 작음
        for (j = i - h; j >= 0 && arr[j] > temp; j -= h) { // i 인덱스와 비교대상인 값들
          arr[j + h] = arr[j]; // 원래 있던 인덱스의 다음 인덱스(원래 인덱스 + 증분값)으로 값 복사
          System.out.println(Arrays.toString(arr));
        }

        arr[j + h] = temp;
        System.out.println(Arrays.toString(arr));
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {22, 5, 11, 32, 120, 68, 70};
    System.out.println("정렬 전 배열\n" + Arrays.toString(arr));
    System.out.println("--------------------------------------");
    arr = insertion(arr);
    System.out.println("--------------------------------------");
    System.out.println("오름차순 정렬 후\n" + Arrays.toString(arr));
  }
}
