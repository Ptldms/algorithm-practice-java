package chapter02.exercise;

import java.util.Scanner;
import java.util.Arrays;

public class Q4 {
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 요솟수: ");
        int num_a = stdIn.nextInt();
        int[] a = new int[num_a];

        for (int i = 0; i < num_a; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("b의 요솟수: ");
        int num_b = stdIn.nextInt();
        int[] b = new int[num_b];

        for (int i = 0; i < num_b; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = stdIn.nextInt();
        }

        System.out.println("배열 a: " + Arrays.toString(a));
        System.out.println("배열 b: " + Arrays.toString(b));

        copy(a, b);
        System.out.println("복사된 배열 a: " + Arrays.toString(a));
    }
}
