package ss12.bai_tap.Product.Controller;

import ss12.bai_tap.Product.Model.Product;
import ss12.bai_tap.Product.Sevice.IProductService;
import ss12.bai_tap.Product.View.ProductService;

import java.util.Scanner;

public class MainProductService {
    private static IProductService productService = (IProductService) new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quan ly san pham");
        System.out.println("1. Them san pham");
        System.out.println("2. Sua san pham");
        System.out.println("3. Xoa san pham");
        System.out.println("4. Hien thi danh sach san pham");
        System.out.println("5. Tim kiem san pham theo ten");
        System.out.println("6. Sap xep san pham tang dan");
        System.out.println("7. Quan ly san pham giam dan");
        System.out.println("8. Thoat");
        System.out.println("Chon so de thuc hien cac buoc tren");
        do {
            int selection = Integer.parseInt(scanner.nextLine());
            switch (selection){
                case 1:
                    System.out.println("Nhap id san pham: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap ten san pham: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhap gia san pham: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    ProductService.addProduct(new Product(id,name,price));
                    break;
                case 2:
                    System.out.println("Nhap id san pham can sua: ");
                    int fixID=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap id moi cua san pham: ");
                     id =Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap ten moi cua san pham: ");
                     name =scanner.nextLine();
                    System.out.println("Nhap gia moi cua san pham: ");
                    price=Integer.parseInt(scanner.nextLine());
                    ProductService.updateProduct(fixID,new Product(id,name,price));
                    break;
                case 3:
                    System.out.println("Nhap id san pham");
                    id=Integer.parseInt(scanner.nextLine());
                    ProductService.removeProduct(id);
                    break;
                case 4:
                    ProductService.displayProduct();
                    break;
                case 5:
                    System.out.println("Nhap ten san pham");
                    name=scanner.nextLine();
                    ProductService.searchProduct(name);
                    break;
                case 6:
                    ProductService.sortAscending();
                    break;
                case 7:
                    ProductService.sortDescending();
                case 8:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
