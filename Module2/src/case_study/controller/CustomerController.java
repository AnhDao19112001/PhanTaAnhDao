package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.Impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);
    int choice;
    ICustomerService iCustomerService = new CustomerService();
    public void menuCustomerManagement() {

        do {
            try {

                System.out.println("1.\tDisplay list customers\n" +
                        "2.\tAdd new customer\n" +
                        "3.\tEdit customer\n" +
                        "4.\tReturn main menu\n");
                System.out.print("Mời bạn nhập lựa chọn: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        iCustomerService.display();
                        break;
                    case 2:
                        iCustomerService.add();
                        break;
                    case 3:
                        iCustomerService.edit();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn của bạn không có vui lòng nhập lại!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }
        while (true);
    }
}

