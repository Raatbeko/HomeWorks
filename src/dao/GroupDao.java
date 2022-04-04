package dao;

import entity.Group;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

public interface GroupDao {
    Group getGroupById(Long id);
}
