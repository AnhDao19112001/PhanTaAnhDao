package case_study.Service.Impl;

import case_study.Model.EmployeeModel;
import case_study.Service.IEmployeeService;
import case_study.Utils.ReadFile.ReadFileEmployee;
import case_study.Utils.WriteFile.WriteFileEmployee;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    final String PATH_EMPLOYEE = "D:\\Codegym\\Module2\\src\\case_study\\data\\employee.csv";

    public void writeFile(List<EmployeeModel> employeeModelList){
        WriteFileEmployee.writeFile(PATH_EMPLOYEE,employeeModelList);
    }
    @Override
    public void display() {
        List<EmployeeModel> employeeModels1 = ReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        for (EmployeeModel employeeModel: employeeModels1) {
            System.out.println(employeeModel);
        }
    }

    @Override
    public void add() {
        List<EmployeeModel> employeeModels = ReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        EmployeeModel employee = new EmployeeModel();
        System.out.println("Vui lòng điền thông tin sau: ");
        System.out.println("mã nhân viên");
        employee.setEmployeeCode(scanner.nextLine());
        System.out.println("Họ và tên: ");
        employee.setName(scanner.nextLine());
        System.out.println("Ngày sinh:");
        employee.setdOB((scanner.nextLine()));
        System.out.println("Giới Tính: ");
        employee.setGender(scanner.nextLine());
        System.out.println("số chứng minh nhân dân: ");
        employee.setIdCard(scanner.nextLine());
        System.out.println("số điện thoại: ");
        employee.setPhoneNumber(scanner.nextLine());
        System.out.println("email: ");
        employee.setEmail(scanner.nextLine());
        System.out.println("Trình độ: ");
        employee.setLevel(scanner.nextLine());
        System.out.println("Vị trí: ");
        employee.setPosition(scanner.nextLine());
        System.out.println("Lương: ");
        employee.setWage(scanner.nextLine());
        employeeModels.add(employee);
        writeFile(employeeModels);
    }

    @Override
    public void delete() {
    List<EmployeeModel> employeeModels = ReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        System.out.println("Nhập mã cần xóa: ");
        String id = scanner.nextLine();
        EmployeeModel employeeModel1 = null;
        for (EmployeeModel employee: employeeModels) {
            if (employee.getEmployeeCode() == id){
                employeeModel1 = employee;
                break;
            }
        }
        if (employeeModel1 != null){
            employeeModels.remove(employeeModel1);
            System.out.println("Xóa thành công!");
            writeFile(employeeModels);
        }
        System.out.println("Không tìm thấy mã nhân viên!");
    }

    @Override
    public void edit() {
    List<EmployeeModel> employeeModels1 = ReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        System.out.println("Nhập mã nhân viên muốn sửa: ");
        String id1 = scanner.nextLine();
        for (EmployeeModel employee: employeeModels1) {
            if (employee.getEmployeeCode() == id1){
                System.out.println("Nhập lại mã nhân viên mới: ");
                employee.setEmployeeCode(scanner.nextLine());
                System.out.println("Nhập lại tên: ");
                employee.setName(scanner.nextLine());
                System.out.println("Nhập lại ngày tháng năm sinh: ");
                employee.setdOB(scanner.nextLine());
                System.out.println("Nhập lại giới tính: ");
                employee.setGender(scanner.nextLine());
                System.out.println("Nhập lại số CCCD: ");
                employee.setIdCard(scanner.nextLine());
                System.out.println("Nhập số điện thoại: ");
                employee.setPhoneNumber(scanner.nextLine());
                System.out.println("Nhập Email: ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Nhập trình độ học vấn: ");
                employee.setLevel(scanner.nextLine());
                System.out.println("Nhập vị trí làm việc: ");
                employee.setPosition(scanner.nextLine());
                System.out.println("Nhập lương: ");
                employee.setWage(scanner.nextLine());
                writeFile(employeeModels1);
                return;
            }
        }
        System.out.println("Không tìm thấy mã nhân viên!");
    }
}

