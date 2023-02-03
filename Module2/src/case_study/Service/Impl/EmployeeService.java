package case_study.Service.Impl;

import case_study.Model.EmployeeModel;
import case_study.Service.IEmployeeService;
import case_study.Utils.Exception.ExceptionHandling;
import case_study.Utils.ReadFile.ReadFileEmployee;
import case_study.Utils.WriteFile.WriteFileEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    public static List<EmployeeModel> employeeModels = new ArrayList<>();
    final String PATH_EMPLOYEE = "Module2\\src\\case_study\\data\\employee.csv";

    public void writeFile(List<EmployeeModel> employeeModelList){
        WriteFileEmployee.writeFile(PATH_EMPLOYEE, employeeModelList);
    }
    @Override
    public void display() {
        List<EmployeeModel> employeeModels1 = ReadFileEmployee.readFile(PATH_EMPLOYEE);
        for (EmployeeModel employeeModel: employeeModels1) {
            System.out.println(employeeModel);
        }
    }

    @Override
    public void add() {
        List<EmployeeModel> employees = ReadFileEmployee.readFile(PATH_EMPLOYEE);
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
        employee.setWage(scanner.nextInt());
        employees.add(employee);
        writeFile(employees);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit(String id) {

    }
}

