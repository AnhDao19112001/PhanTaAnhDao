package caseStudy.Controller;

import caseStudy.Services.IEmployeeService;
import caseStudy.Services.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public void menuEmployeeManagement() {
        Scanner scanner = new Scanner(System.in);
        IEmployeeService iEmployeeService = new EmployeeService();
        do {
            System.out.println("\nEmployee Management\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu");
            int choose = 0;
            try {
                System.out.println("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng nhập lại!");
            }
        } while (true);
    }
}