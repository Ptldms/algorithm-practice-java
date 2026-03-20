package chapter01.exercise;

import java.util.Scanner;

public class Q10 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요: ");
        int n = stdIn.nextInt();

        // 내 방법
        /*int count = 0;

        for (int i = 10; n != 0; i *= 10) {
            int sub = n % i;
            n -= sub;
            count++;
        }*/

        // 답
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println("그 수는 " + count + "자리입니다.");
    }
}
