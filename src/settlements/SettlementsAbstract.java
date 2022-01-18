package settlements;

import java.util.List;

public class SettlementsAbstract {
    private String name;
    private int count;
    private Supervisor supervisor;

    public SettlementsAbstract(String name, int count, Supervisor supervisor) {
        this.name = name;
        this.count = count;
        this.supervisor = supervisor;
    }




    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
