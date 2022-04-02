package dao;

import Model.NewsModel;
import entity.News;

import java.util.List;

public interface NewsDao {
    String createNewNews(News news);

    NewsModel getNewsByNewsHeadLine(String newsHeadline);

    String deleteNewById(Long id);

    NewsModel changeHeadlineAndTextById(Long id,NewsModel newsModel);

    List<NewsModel> searchNewsByText(String  text);
}
