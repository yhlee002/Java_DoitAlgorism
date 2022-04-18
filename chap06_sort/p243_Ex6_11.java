package chap06_sort;

// Merge Sort(미완성된 병합 정렬) : 전체 배열을 좌우로 한번 나눈 상태(a, b)를 가정.
// cf. 나뉘어진 배열은 이미 정렬된 상태
public class p243_Ex6_11 {
  static void merge(int[] a, int an, int[] b, int bn, int[] c) {
    int ai = 0;
    int bi = 0;
    int ci = 0;

    while (ai < an && bi < bn) c[ci++] = a[ai] < b[bi] ? a[ai++] : b[bi++];

    if (ai < an - 1) {
      c[ai] = a[ai++];
    }

    if (bi < bn - 1) {
      c[bi] = b[bi++];
    }
  }

  public static void main(String[] args) {
    int[] a = {2, 4, 6, 8, 11, 13};
    int[] b = {1, 2, 3, 4, 9, 16, 21};
    int[] c = new int[a.length + b.length];
    merge(a, a.length, b, b.length, c);
  }
}
