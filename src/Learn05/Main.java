package Learn05;

import Learn05.impl.Show;
import Learn05.impl.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Main {
    public static void main(String[] args) {
        String Claim = "Test number is ";
        Claim = "Yeah~ The number is ";
        Test test = param -> Claim + param;
        System.out.println(test.showTestNumber(2333));
    }
}