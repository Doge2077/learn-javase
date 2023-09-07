package Learn08;

public class ObjectAllocationExample {
    private static final int OBJECT_COUNT = 1000000;

    public static void main(String[] args) {
        for (int i = 0; i < OBJECT_COUNT; i++) {
            Object obj = new Object();
            System.out.println("Object allocated at: " + getObjectAllocationLocation(obj));
        }
    }

    private static String getObjectAllocationLocation(Object obj) {
        return obj.getClass().getSimpleName() + "@" + Integer.toHexString(obj.hashCode());
    }
}
