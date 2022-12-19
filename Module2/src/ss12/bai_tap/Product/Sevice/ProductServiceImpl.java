package ss12.bai_tap.Product.Sevice;

import ss12.bai_tap.Product.Model.Product;
import ss12.bai_tap.Product.View.ProductService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService{
    private IProductService repository = (IProductService) new ProductService();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void displayProduct() {
        repository.displayProduct();
    }

    @Override
    public void updateProduct(int id, Product product) {
        repository.updateProduct(id, product);
    }

    @Override
    public void removeProduct(int id) {
        repository.removeProduct(id);
    }

    @Override
    public void searchProduct(String name) {
        repository.searchProduct(name);
    }

    @Override
    public void sortAscending() {
        repository.sortAscending();
    }

    @Override
    public void sortDescending() {
        repository.sortDescending();
    }
    }

