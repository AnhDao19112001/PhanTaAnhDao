package ss12.bai_tap.Product.View;

import ss12.bai_tap.Product.Model.Product;

public class ProductService {
    private ProductService productService = new ProductService();

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public void displayProduct() {
        productService.displayProduct();
    }

    @Override
    public void updateProduct(int id, Product product) {
        productService.updateProduct(id, product);
    }

    @Override
    public void removeProduct(int id) {
        productService.removeProduct(id);
    }

    @Override
    public void searchProduct(String name) {
        productService.searchProduct(name);
    }

    @Override
    public void sortAscending() {
        productService.sortAscending();
    }

    @Override
    public void sortDescending() {
        productService.sortDescending();
    }
}
