package chapter01.practice;

import java.util.Scanner;

public class Practice1C_1 {
    static int med3_ver1(int a, int b, int c) {
        if(a >= b)
            if(b >= c)
                return b;
            else if(c >= a)
                return a;
            else
                return c;
        else if(a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
    }

    static int med3_ver2(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3_ver1(a, b, c) + "입니다.");
    }
}
