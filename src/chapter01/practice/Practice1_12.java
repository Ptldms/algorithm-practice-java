package chapter01.practice;

import java.util.Scanner;

public class Practice1_12 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        // 실습 1-12
        /*for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.println("+");
            else
                System.out.println("-");
        }*/

        // 실습 1-13 - 이게 더 성능이 좋음.
        for (int i = 0; i < n / 2; i++)
            System.out.print("+-");

        if (n % 2 == 1)
            System.out.print("+");
    }
}
