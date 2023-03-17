package vn.codegym.repository;

import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements IProductRepository {
    private static Map<Integer, Product> productMap = new HashMap<>();
    static {
        productMap.put(1, new Product(1,"Hăng cải",20000.0,"bla bla","burh burh"));
        productMap.put(2, new Product(2,"Hăng cải",20000.0,"bla bla","dark dark"));
        productMap.put(3, new Product(3,"Hăng cải",20000.0,"bla bla","burh burh"));
        productMap.put(4, new Product(4,"Hăng cải",20000.0,"bla bla","lmao lmao"));
        productMap.put(5, new Product(5,"Hăng cải",20000.0,"bla bla","burh burh"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findByName(String name) {
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()){
            if (name.equals(entry.getValue().getName())){
                return entry.getValue();
            }
        }
        return null;
    }
}
