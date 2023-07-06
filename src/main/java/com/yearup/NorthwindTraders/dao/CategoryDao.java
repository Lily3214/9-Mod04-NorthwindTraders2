package com.yearup.NorthwindTraders.dao;

import com.yearup.NorthwindTraders.models.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category categoryId(int categoryId);
}
