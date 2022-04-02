package dao.impl;

import dao.NewsCategoryDao;
import entity.NewsCategory;
import enums.Category;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import javax.persistence.Query;
import java.util.List;

public class NewsCategoryDaoImpl implements NewsCategoryDao {
    @Override
    public NewsCategory getCategory(Category category) {
        return null;
    }

    @Override
    public String addCategory(NewsCategory category) {
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
    public NewsCategory updateCategoryByName(Category lastname, Category newName) {
        try{
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            List<NewsCategory> newsCategories  =  session.createQuery("from entity.NewsCategory where newsCategory =:lastname",NewsCategory.class).
                    setParameter("lastname",lastname).list();
            if (newsCategories != null) {
                NewsCategory newsCategory = newsCategories.get(0);
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
    public List<NewsCategory> getAllCategory() {
        List<NewsCategory> categories;
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            categories =  session.createQuery("from entity.NewsCategory",NewsCategory.class).list();
            session.getTransaction().commit();
            session.close();
            return categories;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
