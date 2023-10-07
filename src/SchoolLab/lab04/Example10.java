package SchoolLab.lab04;

public class Example10 {
    static abstract class Animal{
        abstract void shout();
    }
    static class Dog extends Animal{

        @Override
        void shout() {
            System.out.println("汪汪");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}
