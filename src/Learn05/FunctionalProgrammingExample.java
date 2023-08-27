package Learn05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalProgrammingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 使用Lambda表达式和函数式接口实现转换操作
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        // 使用函数式接口作为参数传递给其他函数
        List<Integer> squaredLengths = map(names, name -> name.length() * name.length());

        System.out.println("Name Lengths: " + nameLengths);
        System.out.println("Squared Lengths: " + squaredLengths);
    }

    // 使用函数式接口作为参数的函数
    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        return list.stream()
                .map(mapper)
                .collect(Collectors.toList());
    }
}
