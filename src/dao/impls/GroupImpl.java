package dao.impls;

import dao.BaseDao;
import dao.GroupDao;
import entity.Group;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

public class GroupImpl extends BaseDao implements GroupDao {
    @Override
    public Group getGroupById(Group group) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            return session.get(Group.class, group.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
