package ss17.bai_tap.read_write_binary_file.controller;

import ss12.bai_tap.ArrayList.Product.Model.Product;
import ss17.bai_tap.read_write_binary_file.service.IProductService;
import ss17.bai_tap.read_write_binary_file.service.impl.ProductService;
import ss17.bai_tap.read_write_binary_file.utils.ReadWriteProductFileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void menuController() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product());
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        do {
            System.out.println("QUẢN LÝ SẢN PHẨM:\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Hiển thị sản phẩm.\n" +
                    "3.Tìm kiếm sản phẩm.\n" +
                    "4. Thoát.");

            int choose = 0;
            try {
                System.out.println("Nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số bạn muốn.");
            }
            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.findByName();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
            }
        } while (true);
    }

}

