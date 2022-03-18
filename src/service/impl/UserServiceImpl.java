package service.impl;

import dao.impl.UserDaoImpl;
import exceptons.FieldEmptyException;
import models.UserLogsModel;
import models.UserModel;
import service.UserService;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userConn = new UserDaoImpl();

    @Override
    public boolean addUser(UserModel user) {
        if (user == null) throw new NullPointerException();
        else if (user.getUserName().isEmpty() ||
                user.getPassword().isEmpty() ||
                user.geteMail().isEmpty()) throw new FieldEmptyException("Поля не могут быть пустым!");
        return userConn.addUser(user);
    }

    @Override
    public UserModel getUserByName(String userName) {
        if (userName.isEmpty()) throw new FieldEmptyException("Поля не могут быть пустым!");
        return userConn.getUserByName(userName);
    }

    @Override
    public UserModel getUser(Long id_user) {
        if (id_user == null) throw new FieldEmptyException("Поле не может быть пустым!");
        return userConn.getUser(id_user);
    }

    @Override
    public void unlockingUser(UserModel user, UserLogsModel userLogsModel) {
        if (user == null) throw new FieldEmptyException("Поле не может быть пустым!");
        userConn.unlockingOrBlockingUser(user, userLogsModel);
    }

    @Override
    public boolean deleteUser(Long id) {
        if (id == 0) throw new FieldEmptyException("Поле не может быть пустым!");
        return userConn.deleteUser(id);
    }


}
