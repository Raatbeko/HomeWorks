package dao.impl;

import Model.NewsModel;
import dao.NewsDao;
import entity.News;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoImpl implements NewsDao {

    @Override
    public String createNewNews(News news) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            session.save(news);
            session.getTransaction().commit();
            session.close();
            return "Add successful!!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public NewsModel getNewsByNewsHeadLine(String newsHeadlines) {
        NewsModel newsModel = new NewsModel();
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();

            List<News> news = session.createQuery("from entity.News where newsHeadline =:newsHeadLines",News.class).setParameter("newsHeadLines",newsHeadlines).list();
            newsModel.setNewsHeadline(news.get(0).getNewsHeadline());
            newsModel.setNewsText(news.get(0).getNewsText());
            session.getTransaction().commit();
            session.close();
            return newsModel;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String deleteNewById(Long id) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            session.delete(id);
            session.getTransaction().commit();
            session.close();
            return "Delete successful!!!";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public NewsModel changeHeadlineAndTextById(Long id, NewsModel newsModel) {
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            News news = session.get(News.class,id);
            news.setNewsHeadline(newsModel.getNewsHeadline());
            news.setNewsText(newsModel.getNewsText());
            session.update(news);
            session.getTransaction().commit();
            session.close();
            return newsModel;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<NewsModel> searchNewsByText(String text) {
        List<NewsModel> newsModels = new ArrayList<>();
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            List<News> news = session.createQuery("select d.newsHeadline from entity.News d where d.newsHeadline like :text ",News.class).setParameter("text",text).list();
            for (News news1 : news) {
                NewsModel newsModel = NewsModel.
                        builder().
                        newsHeadline(news1.getNewsHeadline()).
                        newsText(news1.getNewsText()).
                        build();
                newsModels.add(newsModel);
            }
            session.getTransaction().commit();
            session.close();
            return newsModels;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}