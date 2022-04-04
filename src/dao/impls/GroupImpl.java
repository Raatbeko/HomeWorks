package dao.impls;

import dao.BaseDao;
import dao.GroupDao;
import entity.Group;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

public class GroupImpl extends BaseDao implements GroupDao {
    @Override
    public Group getGroupById(Long id) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
           Group group = session.get(Group.class, id);
            session.getTransaction().commit();
            session.close();
            return group;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
