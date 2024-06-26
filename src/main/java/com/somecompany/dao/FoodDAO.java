package com.somecompany.dao;

import com.somecompany.model.Product;

import java.util.List;

public interface FoodDAO {
    List<Product> allProducts();
    void add(Product product);
    void edit(Product product);
    void delete(Product product);

}
