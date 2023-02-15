package case_study.Controller;

import case_study.Service.IBookingService;
import case_study.Service.Impl.BookingService;

import java.util.Scanner;

public class BookingController {
    IBookingService iBookingService = new BookingService();
    Scanner scanner = new Scanner(System.in);
    int choice;
    public void menuBookingManagement() {
        do {
            System.out.println("1. Add new booking.\n"+
                    "2. Display list booking.\n"+
                    "3. Return.");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iBookingService.addBooking();
                    break;
                case 2:
                    iBookingService.display();
                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
