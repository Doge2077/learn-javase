package Learn05;

import Learn05.impl.Show;
import Learn05.impl.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 5, 9, 3, 2, 8, 1, 0, 6};
        Arrays.sort(array, (o1, o2) -> o1.compareTo(o2));
        System.out.println(Arrays.toString(array)); //按从小到大的顺序排列
    }
}