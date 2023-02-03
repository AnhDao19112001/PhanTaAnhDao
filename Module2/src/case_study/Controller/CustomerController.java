package case_study.Controller;

import case_study.Service.ICustomerService;
import case_study.Service.Impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public void menuCustomerManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ICustomerService iCustomerService = new CustomerService();
            do {
                try {


                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    System.out.print("enter your choice: ");
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
                    }
                }catch (NumberFormatException e){
                    System.err.println("Input Number");
                }
            }
            while (true);
        }
    }

