package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void update(int id, Product product);
    Product findById(int id);
    void remove(int id);
    void save(Product product);
    List<Product> findByName(String name);
}
