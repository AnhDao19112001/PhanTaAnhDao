package caseStudy.Controller;

import caseStudy.Services.IPromotionService;
import caseStudy.Services.impl.PromotionService;

import java.util.Scanner;

public class PromotionController {
    public void menuPromotionManagement(){
        Scanner scanner = new Scanner(System.in);
        IPromotionService iPromotionService = new PromotionService();
        do {
            System.out.println("\\nQUẢN LÝ KHUYẾN MÃI\\n\" +\n" +
                    "                    \"1. Hiển thị danh sách khách hàng sử dụng dịch vụ.\\n\" +\n" +
                    "                    \"2. Hiển thị danh sách khách hàng nhận được voucher.\\n\" +\n" +
                    "                    \"3. Trở về MENU chính.");
            int choose = 0;
            try {
                System.out.println("Mời bạn nhập lựa chọn");
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    iPromotionService.displayUseService();
                    break;
                case 2:
                    iPromotionService.displayGetVoucher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        }while (true);
    }
}
