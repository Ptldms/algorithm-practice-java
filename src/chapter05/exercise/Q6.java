package chapter05.exercise;

import java.util.Scanner;

public class Q6 {
    static void recur3(int n) {
        if (n > 0) {
            recur3(n - 1);
            recur3(n - 2);
            System.out.println(n);
        }
    }

    static void nonrecur3(int n) {
        IntStack nStack = new IntStack(100);
        IntStack stateStack = new IntStack(100);

        nStack.push(n);
        stateStack.push(0);

        while(!nStack.isEmpty()) {
            int currentN = nStack.pop();
            int state = stateStack.pop();

            if (currentN <= 0) continue;

            if (state == 0) {
                nStack.push(currentN);
                stateStack.push(1);

                nStack.push(currentN - 1);
                stateStack.push(0);
            } else if (state == 1) {
                nStack.push(currentN);
                stateStack.push(2);

                nStack.push(currentN - 2);
                stateStack.push(0);
            } else if (state == 2) {
                System.out.println(currentN);
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        recur3(x);
    }
}
