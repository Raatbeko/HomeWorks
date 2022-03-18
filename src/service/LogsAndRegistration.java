package service;

import models.UserModel;

public interface LogsAndRegistration {
    boolean addUserAndLogs(UserModel user);

    String logsUser(String name ,String pass);
}
