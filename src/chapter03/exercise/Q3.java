package chapter03.exercise;

import java.util.Scanner;

public class Q3 {

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int i = 0;
        int count = 0;

        while (i < n) {
            if (a[i] == key) {
                idx[count] = i;
                count++;
            }
            i++;
        }

        return count;
    }

    /*
    // 정답
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;								// key와 일치하는 요솟수
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                idx[count++] = i;
        return count;
    }
    */

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];
        int[] idx = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();
        int count = searchIdx(x, num, ky, idx);

        if (count == 0)
            System.out.println("그 값의 요소가 없습니다.");
        else {
            for (int i = 0; i < count; i++)
                System.out.println("그 값은 x[" + idx[i] + "]에 있습니다.");
            System.out.println("그 값과 일치하는 요솟수는 총 " + count + "개 입니다.");
        }
    }

}
