package Learn08;

public class Main {

    public static interface Test {
        String showTestNumber(Integer param);
    }

    public static void main(String[] args) {
        Test test = param -> "Test number is " + param;
        System.out.println(test.showTestNumber(810));
    }
}