package service;

import models.UserLogsModel;
import models.UserModel;

public interface UserLogsService {
    boolean addUserLogs(UserModel user, String result);

    boolean updateUserLogs(Long userId, String checkFailOrSuccess);

    int countLog(Long userId);

    UserLogsModel getUserLogsByUserID(Long user_id);
}
