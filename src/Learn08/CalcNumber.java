package Learn08;

public class CalcNumber {

    public static void main(String[] args) {
        long ans = 0;
        for (int i = 1; i <= 99; i ++ ) {
            ans += i % 2 == 0 ? 0 : i;
        }
        System.out.println(ans);
    }

}
