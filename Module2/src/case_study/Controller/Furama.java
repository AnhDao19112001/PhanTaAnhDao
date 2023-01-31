package case_study.Controller;

import java.util.Scanner;

public class Furama {
    public static void displayMainMenu(){
        BookingController bookingController = new BookingController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        PromotionController promotionController = new PromotionController();
        EmployeeController employeeController = new EmployeeController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nManagement of the Furama resort\n"+
                    "1. Employee Management\n"+
                    "2. Customer Management\n"+
                    "3. Facility Management\n"+
                    "4. Booking Management\n"+
                    "5. Promotion Management\n"+
                    "6. Exit");
            int choose = 0;
            try {
                System.out.println("Xin mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose){
                case 1:
                    employeeController.menuEmployeeManagement();
                    break;
                case 2:
                    customerController.menuCustomerManagement();
                    break;
                case 3:
                    facilityController.menuFacilityManagement();
                    break;
                case 4:
                    bookingController.menuBookingManagement();
                    break;
                case 5:
                    promotionController.menuPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của quý khách không có, vui lòng chọn lại!");
            }
        }while (true);
    }
}
