package dao;

import models.UserLogsModel;
import models.UserModel;

public interface UserDao {
    boolean addUser(UserModel user);

    UserModel getUserByName(String userName);

    UserModel getUser(Long id_user);

    void unlockingOrBlockingUser(UserModel user, UserLogsModel userLogsModel);

    boolean deleteUser(Long id);
}
