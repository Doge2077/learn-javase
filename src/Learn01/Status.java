package Learn01;

public enum Status {
    RUNNING("跑步步"), STUDY("学习习"), SLEEP("睡觉觉");

    private String name;  // 枚举的成员变量

    Status(String name) {  // 覆盖原有构造方法（默认为 private, 只能内部使用）
        this.name = name;
    }

    public String getName(){  // 获取封装的成员变量
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
