package chapter01.exercise;

public class Q8 {
    static int sumof(int a, int b) {
        int sum = 0;
        int temp = a;

        if (b < a) {
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i ++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumof(3, 5));
        System.out.println(sumof(6, 4));
    }
}
