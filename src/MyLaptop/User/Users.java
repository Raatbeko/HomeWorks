package MyLaptop.User;

public class Users {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private String aboutPeopleNameOrLastName;
    private String login;
    private int age;
    private String password;
    private boolean isTheAccountLocked;

    public Users() {

    }

    public Users(String aboutPeopleNameOrLastName, String login, int age, String password, boolean isTheAccountLocked) {
        this.aboutPeopleNameOrLastName = aboutPeopleNameOrLastName;
        this.login = login;
        this.age = age;
        this.password = password;
        this.isTheAccountLocked = isTheAccountLocked;
    }

    public String getAboutPeopleNameOrLastName() {
        return aboutPeopleNameOrLastName;
    }

    public void setAboutPeopleNameOrLastName(String aboutPeopleNameOrLastName) {
        this.aboutPeopleNameOrLastName = aboutPeopleNameOrLastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTheAccountLocked() {
        return isTheAccountLocked;
    }

    public void setTheAccountLocked(boolean theAccountLocked) {
        isTheAccountLocked = theAccountLocked;
    }

    @Override
    public String toString() {
        return ANSI_WHITE + "F.L:     " + ANSI_RESET + aboutPeopleNameOrLastName + ANSI_WHITE+"\nLogin:   " + ANSI_RESET + login  + ANSI_WHITE +"\nPassword " + ANSI_RESET + password + ANSI_WHITE + "\nAge:     " + ANSI_RESET + age  + ANSI_WHITE + "\nIs the account locked ? "+ ANSI_RESET + isTheAccountLocked ;
    }
}