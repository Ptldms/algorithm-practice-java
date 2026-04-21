package chapter05.exercise;

import java.util.Scanner;

public class Q8 {
    static void move(int no, int x, int y) {
        IntStack noStack = new IntStack(100);
        IntStack xStack = new IntStack(100);
        IntStack yStack = new IntStack(100);
        IntStack stateStack = new IntStack(100);

        noStack.push(no);
        xStack.push(x);
        yStack.push(y);
        stateStack.push(0);

        while(!noStack.isEmpty()) {
            int currentNo = noStack.pop();
            int currentX = xStack.pop();
            int currentY = yStack.pop();
            int currentState = stateStack.pop();

            if (currentNo == 1) {
                System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", currentNo, currentX, currentY);
                continue;
            }

            if (currentState == 0) {
                noStack.push(currentNo);
                xStack.push(currentX);
                yStack.push(currentY);
                stateStack.push(1);

                noStack.push(currentNo - 1);
                xStack.push(currentX);
                yStack.push(6 - currentX - currentY);
                stateStack.push(0);
            } else if (currentState == 1) {
                System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", currentNo, currentX, currentY);
                noStack.push(currentNo);
                xStack.push(currentX);
                yStack.push(currentY);
                stateStack.push(2);
            } else if (currentState == 2) {
                noStack.push(currentNo - 1);
                xStack.push(6 - currentX - currentY);
                yStack.push(currentY);
                stateStack.push(0);
            }
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = stdIn.nextInt();

        move(n, 1, 3);
    }
}
