package ss17.bai_tap.read_write_binary_file.utils;

import ss17.bai_tap.read_write_binary_file.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteProductFileUtil {
    static boolean flag = false;
    public static List<Product> readProductFile(String path) {
        File f = new File(path);
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(f);
            ObjectInputStream object = null;
            if(flag){
                object = new ObjectInputStream(file);
                productList = (List<Product>) object.readObject();
            }
           if(object != null){
               object.close();
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            flag = true;
        }
        return productList;
    }

    public static void writeProductFile(String path, List<Product> productList) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream object = new ObjectOutputStream(file);
            object.writeObject(productList);
            object.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String s) {

        return null;
    }
}
