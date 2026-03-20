package chapter01.practice;

public class Practice1_2 {
    static int max3(int a, int b, int c) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println(max3(1, 3, 2));
    }
}
