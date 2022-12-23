package ss17.bai_tap.read_write_binary_file.utils;

import ss17.bai_tap.read_write_binary_file.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteProductFileUtil {
    public static List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<>();

    }
    public static void writeProductFile(String path, List<Product> productList){
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream object = new ObjectOutputStream(file);
            object.writeObject(productList);
            object.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
