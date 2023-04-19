public class Main {
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
//        System.out.println(s1 == s3);

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

        

    }
}