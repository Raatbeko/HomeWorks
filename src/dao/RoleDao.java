package dao;

import entity.Role;
import entity.User;

import java.util.List;

public interface RoleDao {
    String insert(Role role);

    String update(Role role);

    List<Role> getAll();

    String delete(Role role);
}
