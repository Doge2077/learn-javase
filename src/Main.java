import pac.neVtuber;
import pac.test01;
import static pac.test02.test;
import pac.reVtuber;
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
    }
}