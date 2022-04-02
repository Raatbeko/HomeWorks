package dao;

import entity.NewsCategoryEntity;
import enums.Category;

import java.util.List;

public interface NewsCategoryDao {
    NewsCategoryEntity getCategory(Category category);
    String addCategory(NewsCategoryEntity category);

    NewsCategoryEntity updateCategoryByName(Category lastname, Category newName);

    List<NewsCategoryEntity> getAllCategory();
}
