package chapter01.exercise;

import java.util.Scanner;

public class Q9 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a값: ");
        int a = stdIn.nextInt();

        int b;

        do {
            System.out.print("b값: ");
            b = stdIn.nextInt();

            if (a >= b)
                System.out.println("a보다 큰 값을 입력하세요!");
        } while (a >= b);

        System.out.print("b - a는 " + (b - a) + "입니다.");
    }
}
