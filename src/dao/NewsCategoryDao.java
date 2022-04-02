package dao;

import entity.NewsCategory;
import enums.Category;

import java.util.List;

public interface NewsCategoryDao {
    NewsCategory getCategory(Category category);
    String addCategory(NewsCategory category);

    NewsCategory updateCategoryByName(Category lastname, Category newName);

    List<NewsCategory> getAllCategory();
}
