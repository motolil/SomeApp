package com.somecompany.dao;

import com.somecompany.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FoodDAOSample implements FoodDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        Product product1 = new Product("Сосиски", 150);
        products.put(1, product1);

    }
    @Override
    public List<Product> allProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void add(Product product) {
        products.put(AUTO_ID.getAndIncrement(), product);
    }

    @Override
    public void delete(Product product) {
        products.remove(product.getName());
    }

    @Override
    public void edit(Product product) {
        products.put(product.getCost(), product);
    }

}