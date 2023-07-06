package com.yearup.NorthwindTraders.dao;

import com.yearup.NorthwindTraders.controllers.ProductsController;
import com.yearup.NorthwindTraders.models.Product;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getProductId(int productId);
}
