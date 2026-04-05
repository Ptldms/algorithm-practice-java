package chapter02.exercise;

import java.util.Scanner;
import java.util.Arrays;

public class Q5 {
    static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요솟수: ");
        int num_a = stdIn.nextInt();
        int[] a = new int[num_a];

        for (int i = 0; i < num_a; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요솟수: ");
        int num_b = stdIn.nextInt();
        int[] b = new int[num_b];

        for (int i = 0; i < num_b; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = stdIn.nextInt();
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        rcopy(a, b);
        System.out.println("역순으로 복사한 a: " + Arrays.toString(a));
    }
}
