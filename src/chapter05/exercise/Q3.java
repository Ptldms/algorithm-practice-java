package chapter05.exercise;

import java.util.Scanner;

public class Q3 {
    static int gcdArray(int[] a, int start, int no){
        if (no == 1)
            return a[start];
        else if (no == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
    }

    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열의 크기: ");
        int num = stdIn.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            array[i] = stdIn.nextInt();
        }

        System.out.println("최대공약수는 " + gcdArray(array, 0, num) + "입니다.");
    }
}
