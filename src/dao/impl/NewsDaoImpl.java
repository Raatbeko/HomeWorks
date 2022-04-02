package dao.impl;

import models.NewsModel;
import dao.NewsDao;
import entity.NewsEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class NewsDaoImpl implements NewsDao {

    @Override
    public String createNewNews(NewsEntity news) {
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

            List<NewsEntity> news = session.createQuery("from entity.NewsEntity where newsHeadline =:newsHeadLines", NewsEntity.class).setParameter("newsHeadLines",newsHeadlines).list();
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
            NewsEntity news = session.get(NewsEntity.class,id);
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
            List<NewsEntity> news = session.createQuery("select d.newsHeadline from entity.NewsEntity d where d.newsHeadline like :text ", NewsEntity.class).setParameter("text",text).list();
            for (NewsEntity news1 : news) {
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