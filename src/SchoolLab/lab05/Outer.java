package SchoolLab.lab05;

public class Outer {
    String Str = "河南工程学院";

    class Inner{
        String Str = "计算机学院";
        String Linking() {
            String Str = "软件工程专业";
            return Str + this.Str;
        }
    }
}
