package case_study.Controller;
import case_study.Service.IEmployeeService;
import case_study.Service.Impl.EmployeeService;
import java.util.Scanner;

public class EmployeeController {
    Scanner scanner = new Scanner(System.in);
    int choose;
    IEmployeeService iEmployeeService = new EmployeeService();
    public void menuEmployeeManagement() {
        do {
            try {
            System.out.println("\nEmployee Management\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Delete employee\n"+
                    "5.Return main menu");


                System.out.println("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

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
                    iEmployeeService.delete();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng nhập lại!");
            }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        } while (true);
    }
}
