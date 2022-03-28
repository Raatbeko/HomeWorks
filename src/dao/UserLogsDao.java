package dao;

import entity.User;
import entity.UserLogs;

import java.util.List;

public interface UserLogsDao {
    String insert(UserLogs user);

    String update(UserLogs user);

    List<UserLogs> getAll();

    String delete(UserLogs user);
}
