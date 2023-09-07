package Learn06;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    static class OOMObject {
        Long num[] = new Long[10000000];
    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
            System.out.println(list.size());
        }
    }
}