package model;

import enums.TypeSport;

public class Trainer {
    private int id;
    private String fullName;
    private int experience;
    private TypeSport typeSport;

    public Trainer() {
    }

    public Trainer(int id, String fullName, int experience, TypeSport typeSport) {
        this.id = id;
        this.fullName = fullName;
        this.experience = experience;
        this.typeSport = typeSport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public TypeSport getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(TypeSport typeSport) {
        this.typeSport = typeSport;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", experience=" + experience +
                ", typeSport=" + typeSport +
                '}';
    }
}
