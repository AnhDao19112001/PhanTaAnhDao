package CaseStudyTrinh.Controller;

import CaseStudyTrinh.Service.IEmployeeManager;
import CaseStudyTrinh.Service.Impl.EmployeeImpl;

import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    IEmployeeManager iEmployeeManager = new  EmployeeImpl();
    int choice = 0;
    public void displayEmployeeManager(){
        do {
            try{
                System.out.println("Employee Management\n" +
                        "1.Display list employees\n"+
                        "2.Add new employee\n" +
                        "3.Delete employee\n" +
                        "4.Edit employee\n" +
                        "5.Return main menu");
                System.out.println("Please enter your selection: ");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        iEmployeeManager.display();
                        break;
                    case 2:
                        iEmployeeManager.add();
                        break;
                    case 3:
                        iEmployeeManager.delete();
                        break;
                    case 4:
                        iEmployeeManager.edit();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Your selection is not available, please re-enter!");
                }
            }catch (NumberFormatException e){
                System.err.println("Please enter the number!");
            }
        }while (true);
    }
}
