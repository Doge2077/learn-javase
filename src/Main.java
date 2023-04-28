import Learn02.fuClass;
import Learn02.meClass;
import Learn02.reClass;
import Learn02.stClass;
import Learn02.*;
import Learn03.Vtb;
import Learn03.Vtbs;

import java.util.*;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    static int ansForge = 0;
    public static void main(String[] args) throws CloneNotSupportedException {  // clone() 向上抛异常
//        Learn01.Vtuber v1 = new Learn01.Vtuber();
//        Learn01.Vtuber v2 = new Learn01.Vtuber("hiiro", 114, "girl");
//        System.out.println(Learn01.Vtuber.vtbinfo);
//
//        test01 t = new test01();
//        System.out.println(t.name);
//
//        test();  // 静态导入的 test02 方法直接使用即可
//
//        reVtuber rev = new reVtuber();
//        System.out.println(rev.name);  // 无法访问不同包下的类的默认权限的成员变量
//
//        Learn01.Vtubers vtbs = new Learn01.Vtubers();
////        System.out.println(vtbs.name);  // 无法访问同包下的类的私有权限的成员变量
//        vtbs.show();  // 可以通过同包下类内默认权限的方法访问
//        System.out.println(vtbs.getName());  // 也可通过 getter() 方法得到
//
////        Learn01.OnlyVtuber ovtb = new Learn01.OnlyVtuber();  // private 构造方法使得类外无法通过 new 进行实例化
//        Learn01.OnlyVtuber ovtb = Learn01.OnlyVtuber.getInstance();  // 调用 getInstance() 方法实例化
//        System.out.println(ovtb.getName());
//
//        Learn01.ReVtuber rvtb = new Learn01.ReVtuber();  // 不仅调用父类的默认构造，还会调用子类的默认构造
//        rvtb.show();  // 调用子类的无参构造，也会同时调用父类的无参构造
//        System.out.println(rvtb.reborn);

//        Learn01.ReVtuber rvtb = new Learn01.ReVtuber("liyusendesu", 14, "boy", false);  // 子类调用有参构造，必须重写父类有参构造方法
//        rvtb.show();  // 再重写一下父类的 show 方法

//        Learn01.Vtubers vtb = new Learn01.ReVtuber("Lysss", 14, "girl", true);
//        Learn01.ReVtuber rvtb = (Learn01.ReVtuber) vtb;

//        Learn01.ReVtuber rvtb = new Learn01.ReVtuber("Test", 1, "boy", true);
//        System.out.println(rvtb);
//        Learn01.Vtubers vtb = (Learn01.Vtubers) rvtb;
//        System.out.println(vtb);
//
//        Learn01.Vtubers vtbs = new Learn01.ReVtuber();
//        if(vtbs instanceof Learn01.ReVtuber) System.out.println("vtbs 是 Revtuber 类的实例化");
//        if(vtbs instanceof Learn01.Vtubers) System.out.println("vtbs 是 Learn01.Vtubers 类的实例化");

//        Learn01.Vtubers vtbs = new Learn01.Vtubers("lys", 14, "boy");
////        System.out.println(vtbs.toString());  // 未重写的继承自 Object 类的toString() 方法
//        System.out.println(vtbs.toString());
//
//        neVtuber nvtb = new neVtuber("Hiiro", 114, "cat", false);  // 抽象类只能通过子类实例化来使用
//        nvtb.show();
//
//        Learn01.myVtuber mvtb = new Learn01.myVtuber();
//        Learn01.yourVtuber uvtb = new Learn01.yourVtuber();
//        mvtb.chat_eat();  // 类实现具体的接口
//        uvtb.chat_eat();

//        Learn01.moveVtuber mvtb = new Learn01.moveVtuber();
//        mvtb.moddle_walk();  // default 修饰的接口是接口类中的默认实现，实现类中不强制要求进行实现，可直接调用
//
//        Learn01.cloneVtuber cvtb = new Learn01.cloneVtuber("Hiiro", 11, "cat");
//        Learn01.cloneVtuber clone = (Learn01.cloneVtuber) cvtb.clone();
//        System.out.println(cvtb);
//        System.out.println(clone);
//        System.out.println(clone == cvtb);
//
//        Learn01.statusVtuber svtb = new Learn01.statusVtuber("Hiiro", 13, "cat");
//        svtb.setStatus(Learn01.Status.RUNNING);
////        System.out.println(svtb.getStatus());
//        System.out.println(svtb.getStatus().getName());
//        Learn01.Status.RUNNING.setName("跑跑步");
//        System.out.println(svtb.getStatus().getName());

//        int a = 10;
//        System.out.println(Integer.toString(a));

//        BigInteger x = BigInteger.valueOf(Long.MAX_VALUE); // 可以轻松表示 long 的最大范围
//        System.out.println(x);
//        BigInteger y = BigInteger.valueOf(Long.MAX_VALUE * 2);  // 溢出，因为显示地字面量仍为 Long
//        System.out.println(y);
//        BigInteger t = new BigInteger("1145141919810114514191981011451419198101145141919810");  // 想表示更大的数应当转换为字符串
//        System.out.println(t);
//        BigInteger p = new BigInteger("110", 2);  // 支持 2 进制
//        System.out.println(p);  // 输出为 10 进制
//        BigInteger i = new BigInteger("3fffffffffffffffffffffffffffffffffffffffffffffffffffff",16);  // 支持 16 进制
//        System.out.println(i);  // 输出为 10 进制
//        BigInteger j = new BigInteger("1010101012020201010121020212120202102012020120", 3);  // 支持自定义的进制 进制范围 2 ~ 36
//        System.out.println(j);
//        BigInteger k = new BigInteger("1145141919810");  // 十进制默认不加 radix 参数
//        k = k.pow(114514);
//        System.out.println(k);  // 可以看到肥肠大了

//        BigDecimal x = BigDecimal.valueOf(Double.MAX_VALUE); // 可以轻松表示 double 的最大范围
//        System.out.println(x);
//        BigDecimal y = x.multiply(x);
//        System.out.println(y);  // 可以看到后面的精度省略了
//        BigDecimal i = BigDecimal.valueOf(10);
//        BigDecimal z = i.divide(BigDecimal.valueOf(3), 100, RoundingMode.CEILING);
//        //计算 10 / 3 的结果，精确到小数点后 100 位
//        //RoundingMode 是舍入模式，就是精确到最后一位时，该怎么处理，这里 CEILING 表示向上取整
//        System.out.println(z);

//        int[] a = new int[10];  // 创建数组需要指定长度
//        int[] b = new int[(int)1e8 + 10];
//        boolean[] c = new boolean[10];
////        for(int i = 0; i < a.length; i ++) System.out.println(i + " " + a[i]);  // 默认值都为 0
//        for(int i = 0; i < c.length; i ++) System.out.println(i + " " + c[i]);  // 默认值都为 false
//        int[] a = new int[10];
//        int[] b = new int[10];
//        for(int i = 0; i < a.length; i ++){
//            a[i] = 10 - i; b[i] = a[i];
//        }
//        int[] c = a;
//        int[] d = a.clone();
////        System.out.println(a);  // 继承自 Object 类
////        System.out.println(a.toString());  // 自带 toString() 方法
////        System.out.println(a.equals(b));
////        System.out.println(a.equals(a));
////        System.out.println(a.equals(c));
//        System.out.println(a.equals(d));
////        for(int i : d) System.out.println(i);

//        int[] a = new int[10];
//        a[0] = 1;
//        int[] b = a.clone();
////        System.out.println(a.equals(b));  // 返回 false
//        Integer t = a[0]; Integer p = b[0];
//        System.out.println(t.equals(p));  // 返回 true
        // .clone() 方法默认为浅拷贝，但是只针对其中的数据，实际上数组 a, b 是两个不同的对象，a, b 数组的数据是同一个对象。

//        calc c = new calc();
////        c.test01("lys", "is", "a", "dog");  // 接收可边长参数
//        c.test02(1, 2, 3, 4, 5);  // 可边长参数最后加入

//        for(String i : args) System.out.println(i);  // cd 到 out/production/ 下加参数运行 得到命令行参数列表

//        String s1 = "lys is a dog.";
//        String s2 = "lys is a dog.";
//        String s3 = s1;
//        System.out.println(s1.equals(s2));  // 此处为 true 是因为 String 重载了 equals() 方法，比较了两个字符串的内容
//        System.out.println(s1 == s2);  // 此处为 true 是因为编译器优化了直接创建的相同的字符串对象
//        System.out.println(s1 == s3);  // 同一个对象
//

//        String s1 = new String("lys");
//        String s2 = new String("lys");
//        String s3 = s1;
//        System.out.println(s1.equals(s2));  // s1 与 s2 的内容相同 返回 true
//        System.out.println(s1 == s2);  // 使用 new 创建出来的是两个对象 返回 false
//        System.out.println(s1 == s3);  // 赋值创建的为引用对象

//        String s = "lys is a dog.";
//        System.out.println(s.length());
//        System.out.println(s.toString());
//        System.out.println(s.toUpperCase());  // 返回一个全是大写的新的字符串
//        System.out.println(s);  // 原来的未改变
//        s = s.toUpperCase();
//        System.out.println(s);  // 改变一下
//        s = s.toLowerCase();
//        System.out.println(s);  // 变回来

//        char[] a = new char[26];
//        for(int i = 0, k = 'A'; k <= 'Z'; i ++, k ++) a[i] = (char)k;
////        for(char i : a) System.out.print(i);
////        String sa = new String(a);  // 将 char 数组转化为 String
////        System.out.println(sa);
//        String sa = new String("lys is a dog");
//        char[] p = sa.toCharArray();  // 将 String 转换为 char 数组
//        System.out.println(p);

//        String s1 = "lys ";
//        String s2 = "is ";
//        String s3 = "a ";
//        String s4 = "dog .";
//        String s5 = s1 + s2 + s3 + s4;
////        System.out.println(s5);  // 实际上会被优化为下列代码
//        StringBuilder builder = new StringBuilder();  // 创建 builder 用于构造字符串
//        builder.append(s1).append(s2).append(s3).append(s4);  // 在后面拼接
////        System.out.println(builder);
//        System.out.println(builder.toString());  // 调用 toString() 方法
//        builder.delete(0, 3);  // 删除 [0, 3) 之间的字符
//        System.out.println(builder.toString());

//        String s = "oooooo";
//        System.out.println(s.matches("o+"));  // x+ 表示 char x 出现一次或多次
//        String s = "runooooooob";
//        System.out.println(s.matches("runo*b"));  // x* 表示 char x 出现任意次
//        String s = "runoonb";
//        System.out.println(s.matches("runn?oonb"));  // x? 表示 char x 出现不多与 1 次


//        meClass mc = new meClass("lys");  // 实例化外部类 meClass
//        meClass.innerClass mic = mc.new innerClass();  // 用实例化对象 mc 实例化成员内部类对象 mic
//        mic.show();  // 调用成员内部类的方法
//        mic.show_name();

//        reClass rcl = new reClass("Hiiro");
//        reClass.innerClass ricl = rcl.new innerClass();
//        ricl.show_name();  // 成员内部类与外部变量名冲突，就近原则
//        ricl.show_thisname();   //在内部类中使用this关键字，只能表示内部类对象
//        ricl.show_outerthisname();  // //如果需要指定为外部的对象，那么需要在前面添加外部类型名称
//
//        ricl.use_show_name();  // 调用了内部类类自己的方法
//        ricl.use_super_show_name();  // 调用了外部类的方法

//        stClass scl = new stClass("Hiiro");
////        stClass.innerClass sicl = scl.new innerClass();  // 不需要实例化外部类再 new
//        stClass.innerClass sicl = new stClass.innerClass();  // 直接 new 即可
//        sicl.show();
////        sicl.show_name();  // 无法访问到外部类的非静态内容
//        sicl.show_innerName();  // 静态成员内部类本身的变量不受影响
//
//        fuClass fu = new fuClass();
//        fu.show(); //调用fuClass中的show方法
//        fuClass.fuctionClass fc = new fuClass().new fuctionClass();
//        fc.show_fuClass();

//        naClass ncl = new naClass("Hiiro") {   // 匿名内部类在 new 的时候，后面加上花括号，把未实现的方法实现了
//            @Override
//            public void show() {
//                System.out.println(getS());
//            }
//        };
//
//        ncl.show();


//        naInterface nif = new naInterface() {  // 抽象接口
//            @Override
//            public void show() {
//                System.out.println("This is naInterface show()");
//            }
//        };
//
//        nif.show();
//
//        naInterface lnif = () -> System.out.println("This is naInterface lambda show()");
//
//        lnif.show();

//        nalInterface nlif = (String a) -> {  // 第一种写法
//            return "My name is " + a;
//        };
//        nalInterface nlif = (a) -> "My name is " + a;  // 参数类型可省略，只存在 return 语句可继续简化
//        nalInterface nlif = a -> "My name is " + a;  // 只有一个参数可省略 ()
//        System.out.println(nlif.show("Hiiro"));

//        caInterface cif = (a, b) -> a + b;  // lambda 表达式
//        caInterface cif = (a, b) -> Integer.sum(a, b);  // 利用 Integer 封装的 sum() 方法
//        caInterface cif = Integer::sum;  // 直接对 Integer 的 sum() 方法解引用
//        System.out.println(cif.sum(1, 2));

//        System.out.println(Math.max(1, 114));
//        System.out.println(Math.min(1, 113));
//        System.out.println(Math.pow(2, 3));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(27, 1.0/3.0));  // 开三次方
//        System.out.println(Math.sin(Math.PI / 6));  // π / 6 的正弦值
//        System.out.println(Math.asin(0.5));  // 求 arcsin 0.5 的值
//        System.out.println(Math.log(Math.E));  // ln(e) 的值
//        System.out.println(Math.log10(100));  // log10(100) 的值
//        System.out.println(Math.ceil(5.1));  // 向上取整
//        System.out.println(Math.floor(5.999));  // 向下取整
//        System.out.println(Math.random());  // 生成一个 0.0 ~ 1.0 之间的伪随机数
//        Random random = new Random();  // 默认构造，不使用随机数种子
//        Random random = new Random(10);  // 指定随机数种子
//        int t = random.nextInt();  // 返回一个随机整数值
//        int t = random.nextInt(100);  // 返回一个小于 n 的随机整数，范围是 0 到 n-1 之间
//        boolean t = random.nextBoolean();  // 返回一个随机布尔值
//        double t = random.nextDouble();  // 返回一个随机的 double 值，在 0.0（包括）到 1.0（不包括）之间。
//        System.out.println(t);

//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));  // Arrays 工具类输出数组元素

//        int[] a = new int[20];
//        Random random = new Random(10);
//        for(int i = 0; i < 20; i ++){
//            a[i] = random.nextInt(100);
//        }
////        System.out.println("a usort: " + Arrays.toString(a));
////        Arrays.sort(a);  // 默认从小到大排序
////        System.out.println("a sorted small to big: " + Arrays.toString(a));
//
//        Integer[] b = Arrays.stream(a).boxed().toArray(Integer[]::new);  // 将基本类型转换为包装类
////        Arrays.sort(b);  // 默认也是从小到大排序
////        Arrays.sort(b, Collections.reverseOrder());  // 翻转为升序
//        Arrays.sort(b, Comparator.reverseOrder());  // 排序为升序
//        System.out.println(Arrays.toString(b));

//        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(Arrays.deepToString(a));  // 输出二维数组

//        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
//        int target = 3;
//        System.out.println(besearch(arr, target));

//        int n = 10;
//        solveFroge(0, n);
//        System.out.println(ansForge);

//        Scanner cin = new Scanner(System.in);
//        String s = cin.next();
//        System.out.println(checkString(s));

////        Vtb<String> hiiro = new Vtb<String>("Hiiro", "114514", "cat");
//        Vtb hiiro = new Vtb("Hiiro", "114514", "cat");  // 此种方式定义使得类型 T 在编译期擦除
//        hiiro.show_vtbinfo();
//        System.out.println(hiiro.getValue().getClass().getTypeName());  // 但是运行仍能判断其类型，后续详解

////        Vtb<int> lys = new Vtb<int>("LYS", "Dog", 13);  // T 不能是基本类型
//        Vtb<Integer> lys = new Vtb<Integer>("LYS", "Dog", 13);
//        lys.show_vtbinfo();

//        Vtb<?> what = new Vtb<>();  // 使用通配符 ?，则 value 默认为 Object 类型
//        what.show_vtbinfo();
////        System.out.println(what.getValue().getClass().getTypeName());  // 由于 value = null 会引发空指针异常

//        Vtbs<String, Integer, Double> hiiro = new Vtbs<>("Hiiro", 114514, 19.19);  // 指定多个泛型变量
//        hiiro.show_vtbsinfo();

    }

    private static int besearch(int[] a, int key){
        int l = 0, r = a.length - 1;
        while(l <= r){
            int mid = l + r >> 1;
            if(a[mid] < key) l = mid + 1;
            else if(a[mid] > key) r = mid - 1;
            else return mid;
        }
        return -1;
    }

    private static void solveFroge(int s, int n){
        if(s == n){
            ansForge ++; return ;
        }
        if(s + 1 <= n) solveFroge(s + 1, n);
        if(s + 2 <= n) solveFroge(s + 2, n);
    }

    private static boolean checkString(String s){
        int i = 0, j = s.length() - 1;
        char[] c = s.toCharArray();
        while (i < j){
            if(c[i] != c[j]) return false;
            i ++; j ++;
        }
        return true;
    }

}