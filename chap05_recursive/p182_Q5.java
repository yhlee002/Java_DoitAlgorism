package chap05_recursive;

import java.util.Scanner;

// 재귀함수의 재귀 제거
public class p182_Q5 {
    static void recur3(int n) throws OverflowIntStackException, EmptyIntStackException {
        IntStack stack = new IntStack(100);
        IntStack stepStack = new IntStack(100);

        int step = 1;
        while (true) {
            if (n > 0) {
                stack.push(n);
                stepStack.push(step);

                if (step == 1) {
                    n -= 1;
                } else if (step == 2) {
                    n -= 2;
                    step = 0; // step값으로 '2'를 스택에 쌓고 나면 이 값은 do-while문에서 3으로 넘어가게 됨을 고려
                }
                continue;
            }

            /*
            [do-while문 사용에 유의]
            1. 최소 한번씩은 동작시켜 step 증가
            2. 증가된 step이 3일 경우에는 n 출력
            3. step이 3인 경우 다음 n의 step 3이 동작되는 기존 재귀 함수의 특성 고려
            */
            do {
                n = stack.pop();
                step = stepStack.pop() + 1; // step : 1 -> 2 -> 3

                if (step == 3) {
                    System.out.println(n);
                    if (stack.isEmpty()) return;
                }
            } while (step == 3);
        }
    }

    public static void main(String[] args) throws OverflowIntStackException, EmptyIntStackException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자를 입력하세요.");
            int n = sc.nextInt();
            recur3(n);
        }


    }
}
