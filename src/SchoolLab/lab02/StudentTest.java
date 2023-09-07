package SchoolLab.lab02;

public class StudentTest {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("Lys");
        student01.setGrade(100.0);

        Student student02 = new Student("Hiiro", 11.45);

        System.out.println(student01.getName() + " grade is " + student01.getGrade());
        System.out.println(student02.getName() + " grade is " + student02.getGrade());

    }
}
