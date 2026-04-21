package chapter05.practice;

// Practice 5-5

import java.util.Scanner;

public class RecurX2 {
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        recur(x);
    }
}

/*
꼬리 재귀는 쉽게 제거할 수 있으나,
재귀의 제거(앞쪽에서 호출하는 재귀 메서드)는 제거하기가 쉽지 않음.
앞 쪽 재귀가 다 이루어지고 난 후 뒤 내용이 실행이 되어야하므로
'잠시 저장'이 필요함.
그래서 이를 구현하기 위해 stack을 활용함.
*/
