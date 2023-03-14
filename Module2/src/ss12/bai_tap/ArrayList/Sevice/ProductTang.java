package ss12.bai_tap.ArrayList.Sevice;

import ss12.bai_tap.ArrayList.Model.Product;

import java.util.Comparator;

public class ProductTang implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}

