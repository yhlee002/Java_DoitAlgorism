package chap03_Search;

// 실습 3-8) 신체검사 데이터를 정의

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhyExamResult { // 신체 검사 결과 데이터(이름, 키, 시력)
    private String name;
    private int height;
    private double vision;

    static final Comparator<PhyExamResult> PHY_EXAM_RESULT_COMPARATOR = new HeightComparator();

    public PhyExamResult(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getVision() {
        return vision;
    }

    @Override
    public String toString() {
        return "PhyExamResult{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", vision=" + vision +
                '}';
    }

    static class HeightComparator implements Comparator<PhyExamResult> {

        @Override
        public int compare(PhyExamResult p1, PhyExamResult p2) {
            if (p1.getHeight() > p2.getHeight())
                return 1;
            else if (p1.getHeight() < p2.getHeight())
                return -1;
            else
                return 0;
        }
    }
}


public class p128_Ex3_8_retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyExamResult[] x = {
                new PhyExamResult("이나령", 162, 0.3),
                new PhyExamResult("유지훈", 168, 0.4),
                new PhyExamResult("김한결", 169, 0.8),
                new PhyExamResult("홍준기", 171, 1.5),
                new PhyExamResult("전서현", 173, 0.7),
                new PhyExamResult("이호연", 174, 1.2),
                new PhyExamResult("이수민", 175, 2.0)
        };

        System.out.println("몇 cm인 사람을 찾고 있나요?");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x, new PhyExamResult("", height, 0.0), PhyExamResult.PHY_EXAM_RESULT_COMPARATOR);

        if (idx < 0) {
            System.out.println("해당되는 사람이 없습니다.");
        } else {
            System.out.println("해당되는 사람의 데이터는 다음과 같습니다.\n" + x[idx]);
        }
    }


}
