package models;

import java.sql.Timestamp;

public class UserModel {
    private long id;
    private String userName;
    private String eMail;
    private String password;
    private Timestamp dateOfRegistration;
    private boolean isBlocked;


    public UserModel() {
    }

    public UserModel(long id, String userName, String eMail, String password,boolean isBlocked) {
        this.id = id;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.isBlocked = isBlocked;
    }

    public UserModel(String userName, String eMail, String password) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
    }

    public UserModel(long id) {
        this.id = id;
    }


    public UserModel(String userName, String eMail, String password, Timestamp dateOfRegistration, boolean isBlocked) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
        this.isBlocked = isBlocked;
    }

    public UserModel(long id, String userName, String eMail, String password, Timestamp dateOfRegistration, boolean isBlocked) {
        this.id = id;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
        this.isBlocked = isBlocked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Timestamp dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                ", isBlocked=" + isBlocked +
                '}';
    }
}
