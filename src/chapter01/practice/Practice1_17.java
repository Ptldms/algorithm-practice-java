package chapter01.practice;

import java.util.Scanner;

public class Practice1_17 {
    // Q14
    public static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleLU(int n) {
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n - i + 1; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }

    public static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleRB(int n) {
        for (int i = n; i != 0; i--) {
            System.out.print(" ".repeat(i));
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        // 실습 1-17
        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        // Q14
        // triangleLB(n);
        // triangleLU(n);
        // triangleRU(n);
        triangleRB(n);
    }
}
