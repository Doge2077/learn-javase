package SchoolLab.lab02;

public class Student {
    private String name;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student() {

    }

}
