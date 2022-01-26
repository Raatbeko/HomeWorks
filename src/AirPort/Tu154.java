package AirPort;

public class Tu154 extends Aircraft{
    public Tu154() {
    }

    public Tu154(  String type) {
        this.id++;
        this.model = this.getClass().getSimpleName();
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tu154{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
