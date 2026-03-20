package chapter01.exercise;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int sum = ((1 + n) * n) / 2;
        System.out.println(sum);
    }

}
