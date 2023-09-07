package Learn08;

public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("I feel gooooooooooood :)");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();                   // 调用父类的 finalize() 方法
        FinalizeEscapeGC.SAVE_HOOK = this;  // 重新连接
        System.out.println("finalize() method executed!");
    }

    public static void main(String[] args) throws Throwable {

        // 创建对象 link start!
        SAVE_HOOK = new FinalizeEscapeGC();

        for (int i = 0; i < 5; i++) {
            // 断开连接
            SAVE_HOOK = null;
            System.out.println("God ! Please! no ! Please do something! Save me!");
            System.gc();
            // 因为Finalizer方法优先级很低，暂停0.5秒，以等待它
            Thread.sleep(500);
            if (SAVE_HOOK != null) {
                SAVE_HOOK.isAlive();
            } else {
                System.out.println("Wasted :(");
            }
        }
    }
}
