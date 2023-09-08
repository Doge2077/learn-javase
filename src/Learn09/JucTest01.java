package Learn09;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class JucTest01 {

    public static void main(String[] args) {
        long outAns1 = 0;
        long outAns2 = 0;
        Thread thread1 = new Thread(() -> {
            long ans1 = 0;
            for (int i = 1; i <= 1000; i ++) {
                ans1 += i % 2 == 0 ? i : 0;
            }
            System.out.println("ans1 = " + ans1);
        });

        Thread thread2 = new Thread(() -> {
            long ans2 = 0;
            for (int i = 1; i <= 1000; i ++) {
                ans2 += i % 2 == 0 ? 0 : i;
            }
            System.out.println("ans2 = " + ans2);
        });

        thread1.start();
        thread2.run();
    }


}
