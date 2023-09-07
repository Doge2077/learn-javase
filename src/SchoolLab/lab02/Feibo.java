package SchoolLab.lab02;

import java.util.Scanner;

public class Feibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        System.out.println(feiboNumber(x));
    }

    private static long feiboNumber(long x) {
        if (x == 1) return 0;
        if (x >= 2 && x <= 3) return 1;
        return calcFeibo(1, 1, 3, x);
    }

    private static long calcFeibo(long l, long r, long index, long x) {
        if (index == x) return r;
        return calcFeibo(r, l + r, index + 1, x);
    }
}
