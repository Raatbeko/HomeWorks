package dao.impl;

import dao.EventTypeDao;
import entity.Event;
import entity.EventType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class EventTypeDaoImpl implements EventTypeDao {
    @Override
    public String insert(EventType event) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(event);
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
    public String update(EventType event) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(event);
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
    public List<EventType> getAll() {
        List<EventType> eventd = new ArrayList<>();
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            eventd = session.createQuery("SELECT*FROM event_type",EventType.class).getResultList();
            transaction.commit();
            session.close();
            return eventd;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    @Override
    public String delete(EventType event) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(event);
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
