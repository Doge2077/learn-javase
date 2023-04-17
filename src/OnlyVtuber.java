public class OnlyVtuber {
    // 单例类的实现
    private static OnlyVtuber ovtb;

    private String name;

    private OnlyVtuber(){  // 不允许外部使用 new 关键字实例化对象
        this.name = "Liyusendesu";
    }

    public static OnlyVtuber getInstance(){  // 需要使用类内方法来生成对象并返回
        if(ovtb == null) ovtb = new OnlyVtuber();
        return ovtb;
    }

    public static OnlyVtuber getOvtb() {
        return ovtb;
    }

    public String getName() {
        return name;
    }
}
