package chapter05.practice;

// Practice 5-9

public class QueenBB {
    static boolean[] flag = new boolean[8];
    static int[] pos = new int[8];

    static void print() {
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false) {
                pos[i] = j;
                if (i == 7)
                    print();
                else {
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;  // 다음 경우의 수를 탐색하기 위해 상태를 되돌림.
                }
            }
        }
    }
}

/*
* Branching and Bounding Method: Branching(분기 조작) + Bounding(한정 조작)
* Branching: 분기 조작 또는 가지 뻗기
* Bounding: 필요하지 않은 분기를 없애 불필요한 조합을 줄이는 방법 (ex. flag)
* */