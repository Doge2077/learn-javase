package Learn06;

public class ReferenceCountingGC {

    public static void main(String args[]) {
        String c = new String("a") + new String("b");
        System.out.println(c);
    }
}
