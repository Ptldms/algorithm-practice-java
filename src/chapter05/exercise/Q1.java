package chapter05.exercise;

import java.util.Scanner;

public class Q1 {
    static int factorial(int n) {
        int result = 1;

        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
