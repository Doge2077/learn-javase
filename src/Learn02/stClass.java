package Learn02;

public class stClass {

    String name;

    public stClass(String name) {
        this.name = name;
    }

    public static class innerClass{  // 静态成员内部类

        String innerName = "LYS";
        public void show(){
            System.out.println("This is innerClass in the stClass");
        }

//        public void show_name(){
//            System.out.println(name);  // 无法访问到外部类的非静态内容
//        }

        public void show_innerName(){
            System.out.println(innerName);
        }

    }

}
