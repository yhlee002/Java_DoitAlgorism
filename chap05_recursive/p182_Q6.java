package chap05_recursive;

import java.util.Scanner;

// 하노이의 탑 문제를 문자열로 기둥 이름(A, B, C)이 출력되도록 수정
public class p182_Q6 {
    static String getPillarName(int n) {
        String name = "";
        switch (n) {
            case 1:
                name = "A기둥";
                break;
            case 2:
                name = "B기둥";
                break;
            case 3:
                name = "C기둥";
                break;
        }

        return name;
    }

    static void move(int n, int x, int y) {
        if (n > 1)
            move(n - 1, x, 6 - x - y);

            System.out.println("1개의 원반을 " + getPillarName(x) + "에서 " + getPillarName(y) + "으로 이동");

        if (n > 1)
            move(n - 1, 6 - x - y, y);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        move(n, 1, 2);
    }
}
