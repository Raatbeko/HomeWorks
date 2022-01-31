package Enums;

public enum Aweek {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");
    String onRussian;

    Aweek(String onRussian) {
        this.onRussian = onRussian;
    }

    public String getOnRussian() {
        return onRussian;
    }

    public void setOnRussian(String onRussian) {
        this.onRussian = onRussian;
    }
}
