package ss17.bai_tap.read_write_binary_file.service.impl;

import ss17.bai_tap.read_write_binary_file.exception.DuplicateIDException;
import ss17.bai_tap.read_write_binary_file.model.Product;
import ss17.bai_tap.read_write_binary_file.service.IProductService;
import ss17.bai_tap.read_write_binary_file.utils.ReadWriteProductFileUtil;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
private static final Scanner SCANNER = new Scanner(System.in);
private static final String PATH = "D:\\Codegym\\Module2\\src\\ss17\\bai_tap\\read_write_binary_file\\data\\text.dat";

    @Override
    public void add() {
        List<Product> productList = ReadWriteProductFileUtil.readProductFile(PATH);

        int id;
        while (true){
            try {
                System.out.println("Nhập id: ");
                id = Integer.parseInt(SCANNER.nextLine());
                for (Product product : productList){
                    if (product.getId() == id){
                        throw new DuplicateIDException("Trùng id, vui lòng nhập lại!");
                    }
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập số: ");
            }catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập tên sản phẩm: ");
        String name = SCANNER.nextLine();
        System.out.println("NHập hãng: ");
        String manufacturer = SCANNER.nextLine();

        int price;
        while (true){
            try {
                System.out.println("Nhập giá sản phẩm: ");
                price = Integer.parseInt(SCANNER.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập số: ");
            }
        }
        productList.add(new Product(id, name, manufacturer, price));
        ReadWriteProductFileUtil.writeProductFile(PATH, productList);
        System.out.println("Thêm sản phẩm thành công.");
    }

    @Override
    public void display() {
        List<Product> productList = ReadWriteProductFileUtil.readProductFile(PATH);
        if (!productList.isEmpty()){
            System.out.println("Danh sách sản phẩm: ");
            for (Product product : productList){
                System.out.println(product);
            }
        }else {
            System.out.println("Khong ton tai sap pham");
        }

    }

    @Override
    public void findByName() {
        List<Product> productList = ReadWriteProductFileUtil.readProductFile(PATH);
        System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
        String nameFind = SCANNER.nextLine();
        boolean isExit = false;
        for (Product product : productList){
            if (product.getName().toLowerCase().contains(nameFind.toLowerCase())){
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit){
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }
    }

