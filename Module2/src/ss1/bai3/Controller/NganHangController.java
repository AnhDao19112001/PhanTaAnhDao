package ss1.bai3.Controller;

import ss1.bai3.Service.INganHangSerive;
import ss1.bai3.Service.NganHangServiceImpl;

import java.util.Scanner;

public class NganHangController {
    INganHangSerive iNganHangSerive = new NganHangServiceImpl();
    public void danhSachNganHang(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            try {


                System.out.println("\n-----Hệ thống quản lý việc gửi sổ tiết kiệm-----\n" +
                        "1.Hiển thị người dùng đăng ký\n" +
                        "2.Thêm người đăng ký\n" +
                        "3.Tìm kiếm người đăng ký\n" +
                        "4.Thoát");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        iNganHangSerive.display();
                        break;
                    case 2:
                        iNganHangSerive.add();
                        break;
                    case 3:
                        iNganHangSerive.search();
                        break;
                    case 4:
                        System.exit(0);
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập lại!");
            }
        }while (true);
    }
}
