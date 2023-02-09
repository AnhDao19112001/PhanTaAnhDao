package CaseStudy2.Controller;

import java.util.Scanner;

public class Furama {
    public void displayMainMenu(){
        Employee employee = new Employee();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.println("Management of the Furama resort\n" +
                        "1. Employee Management\n" +
                        "2. Customer Management\n" +
                        "3. Facility Management\n" +
                        "4. Booking Management\n" +
                        "5. Promotion Management\n" +
                        "6. Exit");
                System.out.println("Please enter options!");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        employee.displayEmployeeManager();
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    default:
                        System.out.println("Your selection is not available, please re-enter!");
                }
            }catch (NumberFormatException e){
                System.err.println("Please enter the number!");
            }
        }while (true);
    }
}
