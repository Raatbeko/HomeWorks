package service.impl;

import dao.impl.UserLogsDaoImpl;
import exceptons.FieldEmptyException;
import models.UserLogsModel;
import models.UserModel;
import service.UserLogsService;

public class UserLogsServiceImpl implements UserLogsService {

    public final UserLogsDaoImpl userLogsDao = new UserLogsDaoImpl();

    @Override
    public boolean addUserLogs(UserModel user, String result) {
        if (result.isEmpty()) throw new FieldEmptyException("Поле неможе быть пустым!");
        return userLogsDao.addUserLogs(user, result);
    }

    @Override
    public boolean updateUserLogs(Long userId, String checkFailOrSuccess) {
        if (userId == 0 && checkFailOrSuccess.isEmpty()) throw new FieldEmptyException("Поле неможе быть пустым!");
        return userLogsDao.updateUserLogs(userId, checkFailOrSuccess);
    }

    @Override
    public int countLog(Long userId) {
        if (userId == 0) throw new FieldEmptyException("Поле неможе быть пустым!");
        return userLogsDao.countLog(userId);
    }

    @Override
    public UserLogsModel getUserLogsByUserID(Long user_id) {
        if (user_id == 0)throw new FieldEmptyException("Поле неможе быть пустым!");
        return userLogsDao.getUserLogsByUserID(user_id);
    }

}
