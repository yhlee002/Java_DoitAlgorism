package chap06_sort;

import java.util.Arrays;

// 요소의 이동 횟수를 계산할 수 있도록 Ex6-6과 Ex6-7을 수정한 프로그램 작성(입력 기능 생략)
public class p223_Q9 {
  static void shellSortV1(int[] arr) {
    int n = arr.length;
    int cnt = 0;
    for (int h = n / 2; h > 0; h /= 2) {
      for (int i = h; i < n; i++) {
        int j;
        int temp = arr[i];
        for (j = i - h; j >= 0 && arr[j] > temp; j -= h) {
          arr[j + h] = arr[j];
        }
        arr[j + h] = temp;
        cnt++;
      }
    }
    System.out.println("V1 결과 : " + Arrays.toString(arr));
    System.out.println("비교 횟수 : " + cnt);
  }

  static void shellSortV2(int[] arr) {
    int n = arr.length;
    int h = 1;
    int cnt = 0;
    for (; h < n / 9; h = h * 3 + 1) {
    }

    for (; h > 0; h /= 3) {
      for (int i = h; i < n; i++) {
        int j;
        int temp = arr[i];
        for (j = i - h; j >= 0 && arr[j] > temp; j -= h) { // j >= 0 && arr[j] > temp -> arr[j]가 temp보다 크다는 조건이 가능하기 위해서는 j가 0보다 작으면 안되므로 순서에도 신경쓴 것
          arr[j + h] = arr[j];
        }
        arr[j + h] = temp;
        cnt++;
      }
    }
    System.out.println("V2 결과 : " + Arrays.toString(arr));
    System.out.println("비교 횟수 : " + cnt);
  }

  public static void main(String[] args) {
    int[] arr = {7, 22, 5, 11, 32, 120, 68, 70, 58, 25, 43, 75, 23, 99, 45, 76};
    shellSortV1(arr);
    shellSortV2(arr);
  }
}
