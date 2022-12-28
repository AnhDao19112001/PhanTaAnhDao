package caseStudy.Utils;

import java.util.Scanner;

public class MenuUtil {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String getGender(){
        System.out.println("Nhập giới tính:\n"+
                "1. Nam.\n"+
                "2. Nữ.\n"+
                "3. Giới tính thứ 3.");
        int choose = 0;
        do {
            try{
                choose = Integer.parseInt(SCANNER.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose){
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "Giới tính thứ 3";
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng nhập lại!");
            }
        }while (true);
    }
    public static String getLevel(){
        System.out.println("Nhập trình độ nhân viên:\n+" +
                "1. Trung cấp.\n"+
                "2. Cao đẳng.\n"+
                "3. Đại học.\n"+
                "4. Sau đại học.\n");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose){
                case 1:
                    return "Trung cấp";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "Đại học";
                case 4:
                    return "Sau đại học";
                default:
                    System.out.println("Lựa chọn của bạn không có, mời nhập lại!");
            }
        }while (true);
    }
    public static String getPositing(){
        System.out.println("Nhập vị trí nhân viên:\n+" +
                "1. Lễ tân.\n"+
                "2. Phục vụ.\n"+
                "3. Chuyên viên.\n"+
                "4. Giám sát.\n"+
                "5. Quản lý.\n"+
                "6. Giám đốc.");
        int choose = 0;
        do {
            try {
                choose=Integer.parseInt(SCANNER.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose){
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Chuyên viên";
                case 4:
                    return "Giám sát";
                case 5:
                    return "Quản lý";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("Lựa chọn của bạn không đúng, mời nhập lại");
            }
        }while (true);
    }
    public static String getCustomerType() {
        System.out.println("Nhập loại khách hàng:\n" +
                "1. Kim cương.\n" +
                "2. Bạch kim.\n" +
                "3. Vàng.\n" +
                "4. Bạc.\n" +
                "5. Thành viên.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    return "Kim cuong";
                case 2:
                    return "Bach kim";
                case 3:
                    return "Vang";
                case 4:
                    return "Bac";
                case 5:
                    return "Thanh vien";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng chọn lại!");
            }
        } while (true);
    }

    public static String getRentalType() {
        System.out.println("Nhập kiểu thuê:\n" +
                "1. Thuê theo năm.\n" +
                "2. Thuê theo tháng.\n" +
                "3. Thuê theo ngày.\n" +
                "4. Thuê theo giờ.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    return "Nam";
                case 2:
                    return "Thang";
                case 3:
                    return "Ngay";
                case 4:
                    return "Gio";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng chọn lại!");
            }
        } while (true);
    }

    public static String getPosition() {
        return this.getPositing();
    }
}
