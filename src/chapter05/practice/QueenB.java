package chapter05.practice;

// Practice 5-8

public class QueenB {
    static int[] pos = new int[8];

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            pos[i] = j;
            if (i == 7)
                print();
            else
                set(i + 1);
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}

/*
* Divide and Conquer Method: 문제를 작게 나누고 세분된 작은 문제의 풀이를 결합해 전체 문제를 풀이하는 기법
* 문제를 작게 나눌 때는 작은 문제의 풀이에서 원래 문제의 풀이가 쉽게 도출될 수 있도록 설계해야 함.
* */