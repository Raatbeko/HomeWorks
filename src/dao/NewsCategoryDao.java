package dao;

import entity.NewsCategory;

import java.util.List;

public interface NewsCategoryDao {
    String addCategory(NewsCategory category);

    NewsCategory updateCategoryByName(String lastname, String newName);

    List<NewsCategory> getAllCategory();
}
