package chapter03.exercise;

import java.util.Scanner;

public class Q4 {

    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        System.out.print("   |");
        for (int i = 0; i < n; i++)
            System.out.printf("%3d", i);
        System.out.println("\n---+----------------------");

        while (pl <= pr) {
            int pc = (pl + pr) / 2;

            System.out.println("   |" + " ".repeat(pl * 3 + 1) + "<-" + " ".repeat((pc - pl) * 3 - 1) + "+" + " ".repeat((pr - pc) * 3 - 1) + "->");
            System.out.printf("%3d|", pc);
            for (int i = 0; i < n; i++)
                System.out.printf("%3d", a[i]);

            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

            System.out.println("\n   |");
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();
        int idx = binSearch(x, num, ky);

        System.out.println();
        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
    }

}
