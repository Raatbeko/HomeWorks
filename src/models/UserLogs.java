package models;

import java.time.LocalDateTime;

public class UserLogs {
    private long id;
    //OneToOne
    private User user;
    private LocalDateTime loginTime;
    private LocalDateTime updateTime;
    private int counter;
    private String LoginResult;

    public UserLogs() {
    }

    public UserLogs(User user, LocalDateTime loginTime, String loginResult) {
        this.user = user;
        this.loginTime = loginTime;
        LoginResult = loginResult;
    }

    public UserLogs(User user, LocalDateTime loginTime, LocalDateTime updateTime, int counter, String loginResult) {
        this.user = user;
        this.loginTime = loginTime;
        this.updateTime = updateTime;
        this.counter = counter;
        LoginResult = loginResult;
    }

    public UserLogs(long id, User user, LocalDateTime loginTime, LocalDateTime updateTime, int counter, String loginResult) {
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

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getLocalDateTime() {
        return loginTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.loginTime = localDateTime;
    }

    public String getLoginResult() {
        return LoginResult;
    }

    public void setLoginResult(String loginResult) {
        LoginResult = loginResult;
    }
}
