package case_study.service.Impl;

import case_study.model.EmployeeModel;
import case_study.service.IEmployeeService;
import case_study.utils.readFile.ReadFileEmployee;
import case_study.utils.writeFile.WriteFileEmployee;

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
//        EmployeeModel employeeModel1 = null;
        for (int i=0; i<employeeModels.size(); i++){
            if (employeeModels.get(i).getEmployeeCode().equals(id)) {
                employeeModels.remove(employeeModels.get(i));
                System.out.println("Xóa thành công!");
                writeFile(employeeModels);
                return;
            }
        }
        System.out.println("Không tìm thấy mã nhân viên!");
//        if (employeeModel1 != null){
//            employeeModels.remove(employeeModel1);
//            System.out.println("Xóa thành công!");
//            writeFile(employeeModels);
//        }else {
//            System.out.println("Không tìm thấy mã nhân viên!");
//        }

    }

    @Override
    public void edit() {
    List<EmployeeModel> employeeModels1 = ReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        System.out.println("Nhập mã nhân viên muốn sửa: ");
        String id1 = scanner.nextLine();
        for (EmployeeModel employee: employeeModels1) {
            if (employee.getEmployeeCode().equals(id1)){
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
                break;
            }
        }
        System.out.println("no");
    }
}

