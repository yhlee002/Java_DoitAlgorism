package chap03_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Q5) 이진검색을 하되, key와 일치하는 값이 존재하면 처음 일치한 값에서 하나씩 앞으로 가며 확인

/**
 * ## 오답 수정(21.05.22) ##
 *
 * 기존 코드 : arr[pc]의 값이 key값과 일치할 때 인덱스를 하나씩 앞으로 이동하며 가장 앞의 값을 찾는 과정에서
 * 값이 일치할 때마다 ArrayList에 값을 추가하였으나, 이 ArrayList를 다시 정렬하여 가장 작은 수(가장 앞의 인덱스)를 찾는 과정 생략
 * --> Collections.sort(ArrayList<> list)을 통해 정렬;
 */

public class p117_Q5 {
    public static ArrayList<Integer> search(int[] arr, int key) {
        int pl = 0;
        int pr = arr.length - 1;
        ArrayList<Integer> a = new ArrayList<Integer>();

        while (pl <= pr) {
            int pc = (pl + pr) / 2;

            if (arr[pc] == key) {
                int i;
                a.add(pc);
                for (i = pc - 1; i >= 0; i--) {
                    if (arr[i] == key) {
                        a.add(i);
                    }
                }
                Collections.sort(a);
                return a;
            } else if (arr[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 6, 3, 4, 1, 7, 5, 7, 7, 3, 2, 10, 5, 6, 8, 9};
        Arrays.sort(arr);

        System.out.println("찾으려는 key를 입력하세요.");
        int key = sc.nextInt();

        ArrayList<Integer> result = search(arr, key);
        if (result != null) {
            System.out.println("[참고] key는 a의 인덱스" + result + "에 있습니다.");
            System.out.println("[결과] 가장 앞에 속한 인덱스는 " + result.get(0) + "입니다.");
        } else {
            System.out.println("[결과] 찾으시는 값이 배열에 존재하지 않습니다.");
        }
        sc.close();
    }
}
