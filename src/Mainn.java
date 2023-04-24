public class Mainn {
    public static void main(String[] args) {
//        Object object = null;
//        object.toString();   //这种情况就会出现运行时异常

//        Object object = new Object();
//        Mainn main = (Mainn) object;

//        Object[] objects = new Object[Integer.MAX_VALUE];   //这里申请一个超级大数组

        int a = 1, b = 0;
//        System.out.println(div1(a, b));
//        System.out.println(div2(a, b));

        try {  // 捕获异常
            System.out.println(div1(a, b));
        } catch (ArithmeticException error){  // 必须与可能出现的异常照应，否则捕获失败仍会抛出
            error.printStackTrace();  // 打印异常信息
        };
        System.out.println("Run as usual.");
    }

    private static int div1(int a, int b){
        if(b == 0){
            throw new ArithmeticException("b is zero");  // 抛出运行时异常
        }
        else return a / b;
    }

    private static int div2(int a, int b) throws Exception {
        if(b == 0){
            throw new Exception("b is zero");  // 抛出编译时异常，需要添加到方法签名
        }
        else return a / b;
    }


}
