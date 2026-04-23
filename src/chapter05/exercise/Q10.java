package chapter05.exercise;

public class Q10 {
    static boolean[] flag_a = new boolean[8];  // 행 방향
    static boolean[] flag_b = new boolean[15];  // / 방향
    static boolean[] flag_c = new boolean[15];  // \ 방향
    static int[] pos = new int[8];

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    /*static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag_a[j] == false && flag_b[i + j] == false && flag_c[i - j + 7] == false) {
                pos[i] = j;
                if (i == 7)
                    print();
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }*/

    static void set(int i) {
        int j;
        int[] jStack = new int[8];

        Start : while (true) {  // 다음 열로 이동
            j = 0;
            while(true) {  // 실패 시 BackTracking 반복
                while(j < 8) {  // 현재 열에서 후보 행 찾기
                    if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
                        pos[i] = j;
                        if (i == 7)
                            print();
                        else {
                            flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                            jStack[i++] = j;
                            continue Start;
                        }
                    }
                    j++;
                }
                if (--i == -1) return;
                j = jStack[i];
                flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
