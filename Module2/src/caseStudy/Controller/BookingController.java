package caseStudy.Controller;

import caseStudy.Services.IBookingService;
import caseStudy.Services.IContractService;
import caseStudy.Services.impl.BookingService;
import caseStudy.Services.impl.ConTractService;

import java.util.Scanner;

public class BookingController {
    public void menuBookingManagement(){
        Scanner scanner = new Scanner(System.in);
        IBookingService iBookingService = new BookingService();
        IContractService iContractService = new ConTractService();
        do{
            System.out.println("\nBooking Management\n"+
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n");
            int choose = 0;
            try {
                System.out.println("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getStackTrace();
            }
            switch (choose){
                case 1:
                    iBookingService.addBooking();
                    break;
                case 2:
                    iBookingService.displayBooking();
                    break;
                case 3:
                    iContractService.addContracts();
                case 4:
                    iContractService.displayContracts();
                    break;
                case 5:
                    iContractService.editContracts();
                case 6:
                    return;
                default:
                    System.out.println("Vui lòng nhập lại: ");
            }
        }while (true);
    }
}
