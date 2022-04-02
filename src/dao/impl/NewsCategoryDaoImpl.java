package dao.impl;

import dao.NewsCategoryDao;
import entity.NewsCategoryEntity;
import enums.Category;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import java.util.List;

public class NewsCategoryDaoImpl implements NewsCategoryDao {
    @Override
    public NewsCategoryEntity getCategory(Category category) {
        return null;
    }

    @Override
    public String addCategory(NewsCategoryEntity category) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            session.save(category);
            session.getTransaction().commit();
            session.close();
            return "Added successful";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public NewsCategoryEntity updateCategoryByName(Category lastname, Category newName) {
        try{
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            List<NewsCategoryEntity> newsCategories  =  session.createQuery("from entity.NewsCategoryEntity where newsCategory =:lastname", NewsCategoryEntity.class).
                    setParameter("lastname",lastname).list();
            if (newsCategories != null) {
                NewsCategoryEntity newsCategory = newsCategories.get(0);
                newsCategory.setNewsCategory(newName);
                session.update(newsCategory);
                session.getTransaction().commit();
                session.close();
                return newsCategory;
            }else {
                return null;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<NewsCategoryEntity> getAllCategory() {
        List<NewsCategoryEntity> categories;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            categories =  session.createQuery("from entity.NewsCategoryEntity", NewsCategoryEntity.class).list();
            session.getTransaction().commit();
            session.close();
            return categories;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
