package ss12.bai_tap.Product.View;

import ss12.bai_tap.Product.Model.Product;

public interface IProductService {
    void addProduct(Product product);

    void displayProduct();

    void updateProduct(int id, Product product);

    void removeProduct(int id);

    void searchProduct(String name);

    void sortAscending();

    void sortDescending();
}
