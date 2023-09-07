package Learn08;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class TestReference {
    public static void main(String[] args) {
        // 创建一个强引用对象
        Object hardReference = new Object();

        // 创建一个软引用对象
        SoftReference<Object> softReference = new SoftReference<>(new Object());

        // 创建一个弱引用对象
        WeakReference<Object> weakReference = new WeakReference<>(new Object());

        // 创建一个弱引用对象，并将其引用赋给一个强引用变量
        WeakReference<Object> weakUseReference = new WeakReference<>(new Object());
        Object hardUseReference = weakUseReference.get();

//        WeakReference<Object> weakUseReference = new WeakReference<>(hardReference);
//        Object hardUseReference = weakUseReference;

        // 创建一个虚引用对象，并指定引用队列
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(new Object(), referenceQueue);

        // 执行垃圾回收
        System.gc();

        // 输出各个引用对象的状态
        System.out.println("HardReference Obj = " + hardReference);
        System.out.println("SoftReference Obj = " + softReference.get());
        System.out.println("WeakReference Obj = " + weakReference.get());
        System.out.println("HardUseReference Obj = " + hardUseReference);
        System.out.println("WeakUseReference Obj = " + weakUseReference.get());
        System.out.println("PhantomReference Obj = " + phantomReference.get());
    }
}

