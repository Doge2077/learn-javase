package Learn02;

public class meClass {

    String name;

    public meClass(String name) {
        this.name = name;
    }

    public class innerClass{  // 成员内部类

        public void show(){
            System.out.println("This is innerClass in the meClass");
        }

        public void show_name(){  // 成员内部类可以访问到外层变量
            System.out.println(name);
        }




    }

}
