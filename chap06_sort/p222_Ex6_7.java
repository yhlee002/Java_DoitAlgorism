package chap06_sort;

/*
  ShellSort 개선(증분값은 서로 배수가 되지 않아야 함)
    - 증분값이 서로 배수가 되면, 증분값이 1/2된 상태로 그룹을 형성할 경우
      이전 증분값일 때의 그룹과 구성 요소가 바뀌지 않기 때문에 효율적인 정렬을 수행할 수 없다.
    - 문제 조건 : 증분값은 1, 4, 13, 40, 121, ... (3n + 1)이 되도록 하고, 너무 크지 않도록 n/9를 넘지 않도록 한다.
    - 빠르긴 하지만 여전히 멀리 떨어진 값을 비교하기 때문에 안정적이지 못하다.
 */


import java.util.Arrays;

public class p222_Ex6_7 {
  static void shellSort(int[] arr) {
    int n = arr.length;
    int h;
    for (h = 1; h < n / 9; h = h * 3 + 1) {
    }
    
    int cnt = 0; // 비교 횟수
    for (; h > 0; h /= 3) { // h값을 '(h - 1)'을 3으로 나누는 것이 아닌 'h'를 3으로 나누는 것이 특이점
      for (int i = h; i < n; i++) {
        int temp = arr[i];
        int j;
        for (j = i - h; j >= 0 && arr[j] > temp; j -= h) {
          arr[j + h] = arr[j];
        }
        arr[j + h] = temp;
        cnt++;
      }
    }

    System.out.println(Arrays.toString(arr));
    System.out.println("비교 횟수 : " + cnt);
  }

  public static void main(String[] args) {
    int[] arr = {7, 22, 5, 11, 32, 120, 68, 70, 58, 25, 43, 75, 23, 99, 45, 76};
    shellSort(arr);
  }
}
