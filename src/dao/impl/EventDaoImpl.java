package dao.impl;

import dao.EventDao;
import entity.Event;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtils;

import java.util.List;

public class EventDaoImpl implements EventDao {
    @Override
    public String insert(Event event) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(event);
            Event event1 = session.get(Event.class,event.getId());
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
    public String update(Event event) {
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
    public List<Event> getAll() {
        List<Event> eventd ;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            eventd = session.createQuery("SELECT*FROM event",Event.class).getResultList();
            transaction.commit();
            session.close();
            return eventd;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    @Override
    public String delete(Event event) {
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
