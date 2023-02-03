package case_study.Controller;

import case_study.Service.IFacilityService;
import case_study.Service.Impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    Scanner scanner = new Scanner(System.in);
    IFacilityService iFacilityService = new FacilityService();
    public void menuFacilityManagement() {
        int choice;
        do {
            System.out.println("1. Display list facility\n"+
                    "2. Add new facility\n"+
                    "3. Display list facility maintenance\n"+
                    "4. Return");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iFacilityService.displayListFacility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    iFacilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
    private void addNewFacility(){
        System.out.println("1. Thêm phòng.\n"+
                "2. Thêm villa.\n"+
                "3. Thoát.\n"+
                "4. Return.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                iFacilityService.addRoom();
                break;
            case 2:
                iFacilityService.addVilla();
                break;
            case 3:
                System.exit(0);
                break;
            case 4:
                return;
        }
    }
}
