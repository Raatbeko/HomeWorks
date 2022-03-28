package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    String insert(User user);

    String update(User user);

    List<User> getAll();
    String delete(User user);
}
