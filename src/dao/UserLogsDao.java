package dao;

import models.UserLogsModel;
import models.UserModel;

public interface UserLogsDao {
    boolean addUserLogs(UserModel user, String result);

   UserLogsModel getUserLogsByUserID(Long user_id);

    boolean updateUserLogs(Long userId, String checkFailOrSuccess);

    int countLog(Long userId);
}
