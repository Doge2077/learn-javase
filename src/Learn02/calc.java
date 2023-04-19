package Learn02;

public class calc {

    public void test01(String ... strings){
        for(String i : strings) System.out.print(i + " ");
    }

    public void test02(int a, int b, int ... num){
        System.out.println(a + b);
        int sum = 0;
        for(int i : num) sum += i;
        System.out.println(sum);
    }

}
