package dao.impl;

import dao.AddresDao;
import entity.Address;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class AddressDaoImpl implements AddresDao {

    @Override
    public String insertAddress(Address address) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(address);
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
    public String updateAddress(Address address) {
        String result;
        try {
        Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(address);
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
    public List<Address> getAll() {
        List<Address> addresses = new ArrayList<>();
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            addresses = session.createQuery("SELECT*FROM address",Address.class).getResultList();
            transaction.commit();
            session.close();
            return addresses;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    @Override
    public String delete(Address address) {
        String result;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(address);
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
