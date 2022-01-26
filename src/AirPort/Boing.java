package AirPort;

public class Boing extends Aircraft{

    public Boing() {
    }

    public Boing( String type) {
        this.id++;
        this.model = this.getClass().getSimpleName();
        this.type = type;
    }

    @Override
    public String toString() {
        return "Boing{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
