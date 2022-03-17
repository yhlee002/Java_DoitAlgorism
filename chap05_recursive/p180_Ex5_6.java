package chap05_recursive;

import java.util.Scanner;

/*
    하노이의 탑 : 3개의 원반 고리가 존재.
    이 고리 사이에서 하나씩 원반을 옮기되, 작은 원반 위에 큰 원반을 쌓을 수 없음을 염두
    [알아야 할 점]
    원반의 개수와 상관없이 항상 가장 아래에 있는 하나의 원반과 그 위의 원반들의 이동으로 세분화됨
    아래 모식도에서 세부적인 이동(첫 번째 원반과 두 번째 원반의 이동)은 생략되어 있음. 총 7번의 이동이 실행됨

    1       2       3           1       2       3           1       2       3
    □
   □□□                  ->                      □      ->                   □      ->
  □□□□□                       □□□□□            □□□                □□□□□    □□□

    1       2       3
            □
           □□□
          □□□□□

 */
public class p180_Ex5_6 {
    static void move(int n, int x, int y) {
        if (n > 1)
            move(n - 1, x, 6 - x - y);


        System.out.println("1개의 원반을 " + x + "번째 고리에서 " + y + "번째 고리로 이동");

        if (n > 1)
            move(n - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        move(n, 1, 3);
    }
}
