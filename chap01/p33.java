package chap01;

import java.util.Scanner;

public class p33 {

    static Scanner sc = new Scanner(System.in);

    //Q10) 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.(b <= a일 경우  'a보다 큰 값을 입력하세요!' 반복)
    public static void Q10() {
        System.out.println("[Q10 실행]");
        System.out.println("두 수를 입력해주세요. 두번째 수는 필히 앞의 수보다 커야합니다.");
        int a, b = 0;
        System.out.println("a의 값 : ");
        a = sc.nextInt();
        System.out.println("b의 값 : ");
        b = sc.nextInt();
        while (a >= b) {
            System.out.println("b의 값으로는 a보다 큰 값을 입력하세요!(들어온 a : " + a + ", b : " + b + ")");
            System.out.println("b의 값 : ");
            b = sc.nextInt();
        }
        System.out.println(b + " - " + a + " = " + (b - a));
    }

    //Q11) 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. ('그 수는 n자리 입니다.')
    public static void Q11() {
        System.out.println("[Q11 실행]");
        int k = 0;
        do {
            System.out.println("양의 정수를 입력하세요.입력받은 수 : " + k);
            k = sc.nextInt();
        } while (k <= 0);

        System.out.println("입력받은 수 " + k + "의 자리수는 " + Integer.toString(k).length() + "입니다.");
    }

    //실행 메소드
    public static void main(String[] args) {
        Q10();
        Q11();
    }

}
