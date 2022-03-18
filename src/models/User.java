package models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class User {
    private long id;
    private String userName;
    private String eMail;
    private String password;
    private LocalDateTime dateOfRegistration;
    private boolean isBlocked;

    public User() {
    }

    public User(long id) {
        this.id = id;
    }

    public User(long id, String userName, String eMail, String password, LocalDateTime dateOfRegistration, boolean isBlocked) {
        this.id = id;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
        this.isBlocked = isBlocked;
    }

    public User(String userName, String eMail, String password, LocalDateTime dateOfRegistration, boolean isBlocked) {
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

    public LocalDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDateTime dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
