package Learn07;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class WeakReferenceGC {
    public static void main(String[] args) {
        Object hardReference = new Object();
        SoftReference<Object> softReference = new SoftReference<>(new Object());
        WeakReference<Object> weakReference = new WeakReference<>(new Object());
        WeakReference<Object> weakUseReference = new WeakReference<>(weakReference);
//        Object hardUseReference = weakUseReference.get();

        System.gc();

        System.out.println("HardReference Obj = " + hardReference);
        System.out.println("SoftReference Obj = " + softReference.get());
        System.out.println("WeakReference Obj = " + weakReference.get());
//        System.out.println("HardUseReference Obj = " + hardUseReference);
        System.out.println("WeakUseReference Obj = " + weakUseReference.get());

    }
}
