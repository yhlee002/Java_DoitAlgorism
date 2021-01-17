package chap01;

public class p36 {
    static void Ex1_7() {
        System.out.println("----------- 곱셈표 -----------");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ex1_7();

    }
}
