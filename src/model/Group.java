package model;

public class Group {
    private int id;
    private String nameOfGroup;

    public Group() {
    }

    public Group(int id, String nameOfGroup) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                '}';
    }
}
