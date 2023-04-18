public class statusVtuber extends Vtubers{

    private Status status;

    public statusVtuber(String name, int age, String sex) {
        super(name, age, sex);
    }

    public statusVtuber() {
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
