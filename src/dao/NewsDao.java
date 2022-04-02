package dao;

import models.NewsModel;
import entity.NewsEntity;

import java.util.List;

public interface NewsDao {
    String createNewNews(NewsEntity news);

    NewsModel getNewsByNewsHeadLine(String newsHeadline);

    String deleteNewById(Long id);

    NewsModel changeHeadlineAndTextById(Long id,NewsModel newsModel);

    List<NewsModel> searchNewsByText(String  text);
}
