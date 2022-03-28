package dao.impl;

import dao.UserLogsDao;

import entity.UserLogs;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class UserLogsDaoImpl implements UserLogsDao {
    @Override
    public String insert(UserLogs userLogs) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(userLogs);
            transaction.commit();
            session.close();
            result = "Запись создана/обновлена успешно";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = null;
        }
        return result;
    }

    @Override
    public String update(UserLogs userLogs) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(userLogs);
            transaction.commit();
            session.close();
            result = "Запись создана/обновлена успешно";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = null;
        }
        return result;
    }

    @Override
    public List<UserLogs> getAll() {
        List<UserLogs> eventd = new ArrayList<>();
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            eventd = session.createQuery("SELECT*FROM user_logs",UserLogs.class).getResultList();
            transaction.commit();
            session.close();
            return eventd;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    @Override
    public String delete(UserLogs userLogs) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(userLogs);
            transaction.commit();
            session.close();
            result = "Запись удалена/обновлена успешно";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = null;
        }
        return result;
    }
}
