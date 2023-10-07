package SchoolLab.lab04;

public class StudentTest {
    public static class Student{
        String name;
        short age;

        public Student(String name, short age) {
            this.name = name;
            this.age = age;
        }

        void show() {
            System.out.println("姓名：" + name + "，年龄：" + age);
        }
    }

    public static class Undergraduate extends Student {
        String degree;

        public Undergraduate(String name, short age, String degree) {
            super(name, age);
            this.degree = degree;
        }

        @Override
        void show() {
            System.out.println("姓名：" + name + "，年龄：" + age + "，专业" + degree);
        }
    }

    public static void main(String[] args) {
        Student stu1 = new Student("张三", (short) 25);
        Undergraduate stu2 = new Undergraduate("李四", (short) 23, "计算机科学与技术");
        stu1.show(); stu2.show();
    }
}
