package Learn02;

public class reClass {

    String name;

    public void show_name(){
        System.out.println(name);
    }


    public reClass(String name) {
        this.name = name;
    }

    public class innerClass{

        String name;

        public void show_name(){
            System.out.println(name);
        }

        public void show_thisname(){
            System.out.println(this.name);
        }

        public void show_outerthisname(){
            System.out.println(reClass.this.name);
        }

        public void use_show_name(){
            this.show_name();
        }

        public void use_super_show_name(){
            reClass.this.show_name();
        }

    }
}
