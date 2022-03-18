package service;

import dBConn.UserConn;
import models.User;
import models.UserLogs;

public class UserService {
    private UserConn userConn = new UserConn();

    public boolean addUser(User user) {
        if (user == null) throw new NullPointerException();
        else if (user.getUserName().isEmpty() ||
                user.getPassword().isEmpty() ||
                user.geteMail().isEmpty()) throw new NullPointerException("Поля не могут быть пустым!");
        return userConn.addUser(user);
    }

    public boolean addUserLogs(User user, String result) {
        if (result.isEmpty()) throw new NullPointerException("Поле неможе быть пустым!");
        return userConn.addUserLogs(user, result);
    }

//    public User getUser(Long id_user) {
//        if (id_user == null) throw new NullPointerException("Поле не может быть пустым!");
//        return userConn.getUser(id_user);
//    }

    public int getCountFailLogs(User user) {
        if (user == null) throw new NullPointerException("Поле не может быть пустым!");
        return userConn.getCountFailLogs(user);
    }

    public boolean deleteFailEntryLogins(User user, int num) {
        if (user == null || num == 0) throw new NullPointerException("Поле не может быть пустым!");
        return userConn.deleteFailEntryLogins(user, num);
    }

    public void unlockingUser(User user, boolean unlock){
        if (user == null )throw new NullPointerException("Поле не может быть пустым!");
        userConn.unlockingUser(user,unlock);
    }

    public boolean deleteUser(Long id){
        if (id == 0) throw new NullPointerException("Поле не может быть пустым!");
        return userConn.deleteUser(id);
    }


}
