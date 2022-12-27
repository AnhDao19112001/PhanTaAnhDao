package caseStudy.Controller;

import caseStudy.Services.IFacilityService;
import caseStudy.Services.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    public void menuFacilityManagement(){
        Scanner scanner = new Scanner(System.in);
        IFacilityService iFacilityService = new FacilityService();
        do {
            System.out.println("\\nQUẢN LÝ CƠ SỞ:\\n\" +\n" +
                    "                    \"1. Hiển thị cơ sở.\\n\" +\n" +
                    "                    \"2. Thêm mới cơ sở.\\n\" +\n" +
                    "                    \"3. Hiển thị danh sách bảo trì cơ sở.\\n\" +\n" +
                    "                    \"4. Trở về MENU chính.");
            int choose = 0;
            try {
                System.out.println("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    iFacilityService.display();
                    break;
                case 2:
                    iFacilityService.add();
                    break;
                case 3:
                    iFacilityService.displayMaintain();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        }while (true);
    }

}
