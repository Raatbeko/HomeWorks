package dao.impl;

import Model.NewsModel;
import dao.NewsCategoryDao;
import dao.NewsDao;
import entity.News;
import entity.NewsCategory;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import java.util.List;

public class NewsImpl implements NewsDao {

    @Override
    public String createNewNews(News news) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            session.save(news);
            session.getTransaction().commit();
            session.close();
            return "Add successful!!!";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public NewsModel getNewsByNewsHeadLine(String newsHeadline) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            NewsCategory newsCategory = session.createQuery("select * from")
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String deleteNewById(Long id) {
        return null;
    }

    @Override
    public NewsModel changeHeadlineAndTextById(Long id, NewsModel newsModel) {
        return null;
    }

    @Override
    public List<NewsModel> searchNewsByText() {
        return null;
    }
}
