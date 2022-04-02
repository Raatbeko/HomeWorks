package dao;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.Criteria;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import java.util.List;

public abstract class BaseDao<T> {

    public String insert(T obj) {
        Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(obj);
            session.getTransaction().commit();
            session.close();
            return "Запись создана успешно";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String update(T obj) {
        Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(obj);
            session.getTransaction().commit();
            session.close();
            return "Запись обновлена успешно";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<T> getAll(T obj) {
        Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
        List<T> list;
        try {
            list = (List<T>) session.createQuery("from " + obj.getClass(), obj.getClass());
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String delete(T obj) {
        Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(obj);
            session.getTransaction().commit();
            session.close();
            return "Запись удалена успешно";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
