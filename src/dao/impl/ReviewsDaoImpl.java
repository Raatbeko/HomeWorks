package dao.impl;

import dao.ReviewsDao;
import entity.Event;
import entity.Reviews;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class ReviewsDaoImpl implements ReviewsDao {
    @Override
    public String insert(Reviews review) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(review);
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
    public String update(Reviews review) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(review);
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
    public List<Reviews> getAll() {
        List<Reviews> reviews = new ArrayList<>();
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            reviews = session.createQuery("SELECT*FROM reviews",Reviews.class).getResultList();
            transaction.commit();
            session.close();
            return reviews;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    @Override
    public String delete(Reviews review) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(review);
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
