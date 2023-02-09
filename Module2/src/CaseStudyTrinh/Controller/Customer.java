package CaseStudyTrinh.Controller;

import CaseStudyTrinh.Service.ICustomerManager;
import CaseStudyTrinh.Service.Impl.CustomerImpl;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    ICustomerManager iCustomerManager = new CustomerImpl();
    public void displayCustomerManager(){
        do {
            try {
                System.out.println("1. Display list customer.\n" +
                        "2. Add new customer.\n" +
                        "3. Edit customer.\n" +
                        "4. Return main menu.");
                System.out.println("Please enter your selection: ");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        iCustomerManager.display();
                        break;
                    case 2:
                        iCustomerManager.add();
                        break;
                    case 3:
                        iCustomerManager.edit();
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Your selection has no please re-enter!");
                }
            }catch (NumberFormatException e){
                System.err.println("Please enter the number!");
            }
        }while (true);
    }
}
