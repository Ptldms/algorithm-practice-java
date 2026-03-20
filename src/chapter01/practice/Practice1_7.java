package chapter01.practice;

import java.util.Scanner;

public class Practice1_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = stdIn.nextInt();
        int sum = 0;

        // while문
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        /*// for문
        for (int i = 1; i<=n; i++) {
            sum += i;
        }
*/
        System.out.println(i);
        System.out.println("1부터 "+ n + "까지의 합은 " + sum + "입니다.");
    }
}
