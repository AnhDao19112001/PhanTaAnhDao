package ss12.bai_tap.ArrayList.Sevice;

import case_study.Service.IEmployeeService;
import ss12.bai_tap.ArrayList.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements  IProductService{
     static Scanner scanner = new Scanner(System.in);
     static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Trứng gà công nghiệp", 5000));
        productList.add(new Product(2, "Trứng gà ta", 6000));
        productList.add(new Product(3, "Xúc xích", 10000));
        productList.add(new Product(4, "Kẹo mút", 3000));
        productList.add(new Product(5, "Gà khỏa thân", 150000));
    }

    @Override
    public void add() {
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm (VNĐ): ");
        int price = Integer.parseInt(scanner.nextLine());

        productList.add(new Product(id, name, price));
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void delete() {
        System.out.println("Nhập id sản phẩm cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (Product product : productList) {
            if (product.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Xóa thành công!");
                }
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void disPlays() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String nameFind = scanner.nextLine();
        boolean isExist = false;

        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                System.out.println(product);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id sản phẩm cần chỉnh sửa: ");
        int idSet = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idSet) {
                System.out.println("Sản phẩm cần chỉnh sửa: \n" + productList.get(i));
                System.out.println("Bạn có chắc muốn sửa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo == 1) {
                    System.out.print("Nhập tên mới: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập giá mới (VNĐ): ");
                    int price = Integer.parseInt(scanner.nextLine());

                    productList.set(i, new Product(productList.get(i).getId(), name, price));
                    System.out.println("Chỉnh sửa thành công!");
                }
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void sort() {
        int choose;
        do {
            System.out.println("Sắp xếp: \n" +
                    "1. Tăng dần.\n" +
                    "2. Giảm dần.");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose != 1 && choose != 2) {
                System.out.println("Nhập lại!");
            }
        } while (choose != 1 && choose != 2);

        ProductTang productTang = new ProductTang();
        ProductGiam productGiam = new ProductGiam();
        if (choose == 1) {
            productList.sort(productTang);
            System.out.println("Sắp xếp sản phẩm theo giá tăng dần: ");
        } else {
            productList.sort(productGiam);
            System.out.println("Sắp xếp sản phẩm theo giá giảm dần: ");
        }

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
