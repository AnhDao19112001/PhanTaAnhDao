package caseStudy.Controller;

import caseStudy.Services.ICustomerService;
import caseStudy.Services.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);
    CustomerService iCustomerService = new CustomerService();
    int choose;
    public void menuCustomerManagement(){
        do {
            System.out.println("\nCustomer Management\n"+
                    "1.Display list customers\n"+
                    "2.Add new customer\n"+
                    "3.Edit customer\n"+
                    "4.Return main menu");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
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
                    System.out.println("Vui lòng nhập lại!");
            }
        }while (true);
    }

}
