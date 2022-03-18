package models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class UserLogsModel {
    private long id;
    //OneToOne
    private UserModel user;
    private Timestamp loginTime;
    private Timestamp updateTime;
    private int counter;
    private String LoginResult;

    public UserLogsModel() {
    }

    public UserLogsModel(UserModel user, Timestamp updateTime, String loginResult) {
        this.user = user;
        this.updateTime = updateTime;
        LoginResult = loginResult;
    }

    public UserLogsModel(UserModel user, Timestamp loginTime, Timestamp updateTime, int counter, String loginResult) {
        this.user = user;
        this.loginTime = loginTime;
        this.updateTime = updateTime;
        this.counter = counter;
        LoginResult = loginResult;
    }

    public UserLogsModel(long id, UserModel user, Timestamp loginTime, Timestamp updateTime, int counter, String loginResult) {
        this.id = id;
        this.user = user;
        this.loginTime = loginTime;
        this.updateTime = updateTime;
        this.counter = counter;
        LoginResult = loginResult;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public Timestamp getLocalDateTime() {
        return loginTime;
    }

    public void setLocalDateTime(Timestamp localDateTime) {
        this.loginTime = localDateTime;
    }

    public String getLoginResult() {
        return LoginResult;
    }

    public void setLoginResult(String loginResult) {
        LoginResult = loginResult;
    }
}
