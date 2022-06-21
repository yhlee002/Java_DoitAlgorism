//package chap06_sort;
//
//import java.util.Arrays;
//
//// Quick Sort
//public class p230_Q10 {
//  static void swap(int[] arr, int x, int y) {
//    int temp = arr[x];
//    arr[x] = arr[y];
//    arr[y] = temp;
//  }
//
//  static void sort(int[] arr, int n) { // n = arr.length
//    int left = 0;
//    int right = n - 1;
//    int pl = 0;
//    int pr = n - 1;
//    int piv = arr[(pl + pr)/2];
//
//    do {
//      while (arr[pl] < piv) pl++;
//      while (arr[pr] > piv) pr--;
//
//      if (pl <= pr) {
//        swap(arr, pl++, pr--);
//      }
//    } while(pl <= pr);
//
//    if (left < pr) sort(arr, )
//
//    System.out.println("Result : " + Arrays.toString(arr));
//    System.out.println("Pivot : " + piv);
//    System.out.print("피벗 값 이하의 그룹 : [");
//    for (int i = 0; i < pr + 1; i++) {
//      System.out.print(arr[i]);
//    }
//    System.out.println("]");
//
//    System.out.print("피벗 값과 일치하는 그룹 : [");
//    for (int i = pr + 1; i < pl; i++) {
//      System.out.print(arr[i]);
//    }
//    System.out.println("]");
//
//    System.out.print("피벗 값 이상의 그룹 : [");
//    for (int i = pl; i < arr.length - 1; i++) {
//      System.out.print(arr[i]);
//    }
//    System.out.println("]");
//  }
//
//  public static void main(String[] args) {
//    int[] arr = {1, 8, 7, 4, 5, 2, 6, 3, 9};
//    sort(arr, arr.length);
//  }
//}
