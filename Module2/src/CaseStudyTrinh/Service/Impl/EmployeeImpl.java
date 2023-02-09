package CaseStudyTrinh.Service.Impl;

import CaseStudyTrinh.Model.EmployeeManager;
import CaseStudyTrinh.Service.IEmployeeManager;
import CaseStudyTrinh.Util.ReadWriteFileEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeImpl implements IEmployeeManager {
    Scanner scanner = new Scanner(System.in);
    final String PATH_EMPLOYEE = "D:\\Codegym\\Module2\\src\\CaseStudyTrinh\\Data\\employee.csv";

    public void writeFile(List<EmployeeManager> employeeManagerList){
        ReadWriteFileEmployee.writeFile(PATH_EMPLOYEE,employeeManagerList);
    }
    @Override
    public void display() {
        List<EmployeeManager> employeeManagers = ReadWriteFileEmployee.readFileE(PATH_EMPLOYEE);
        for (EmployeeManager employee: employeeManagers) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        List<EmployeeManager> employeeManagerList = ReadWriteFileEmployee.readFileE(PATH_EMPLOYEE);
        EmployeeManager employeeManager = new EmployeeManager();
        System.out.println("Please fill in the following information: ");
        System.out.println("First and last name: ");
        employeeManager.setName(scanner.nextLine());
        System.out.println("Date of birth: ");
        employeeManager.setDayOfBirth(scanner.nextLine());
        System.out.println("Gender: ");
        employeeManager.setGender(scanner.nextLine());
        System.out.println("Identity card: ");
        employeeManager.setIdCardPerson(Integer.parseInt(scanner.nextLine()));
        System.out.println("Phone number: ");
        employeeManager.setPhoneNumber(scanner.nextLine());
        System.out.println("Email: ");
        employeeManager.setEmail(scanner.nextLine());
        System.out.println("Employee code: ");
        employeeManager.setEmployeeID(Integer.parseInt(scanner.nextLine()));
        System.out.println("Level: ");
        employeeManager.setLevel(scanner.nextLine());
        System.out.println("Position: ");
        employeeManager.setPosition(scanner.nextLine());
        System.out.println("Employee salary");
        employeeManager.setWage(Double.parseDouble(scanner.nextLine()));
        employeeManagerList.add(employeeManager);
        writeFile(employeeManagerList);
    }

    @Override
    public void delete() {
        List<EmployeeManager> employeeManagers = ReadWriteFileEmployee.readFileE(PATH_EMPLOYEE);
        System.out.println("Enter the code to delete: ");
        int id =Integer.parseInt(scanner.nextLine());
        EmployeeManager employeeManager = null;
        for (EmployeeManager employee: employeeManagers) {
            if (employee.getEmployeeID() == id){
                employeeManager = employee;
                break;
            }
        }
        if (employeeManager != null){
            employeeManagers.remove(employeeManager);
            System.out.println("Deleted successfully!");
            writeFile(employeeManagers);
        }
        System.out.println("Employee code not found!");
    }

    @Override
    public void edit() {
    List<EmployeeManager> employeeManagerList = ReadWriteFileEmployee.readFileE(PATH_EMPLOYEE);
        System.out.println("Enter the employee code to be corrected: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (EmployeeManager employee: employeeManagerList) {
            if (employee.getEmployeeID() == id){
                System.out.println("Enter new employee code: ");
                employee.setEmployeeID(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter employee name: ");
                employee.setName(scanner.nextLine());
                System.out.println("Enter date of birth: ");
                employee.setDayOfBirth(scanner.nextLine());
                System.out.println("Enter gender: ");
                employee.setGender(scanner.nextLine());
                System.out.println("Enter ID card: ");
                employee.setIdCardPerson(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter number phone: ");
                employee.setPhoneNumber(scanner.nextLine());
                System.out.println("Enter email: ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Enter level: ");
                employee.setLevel(scanner.nextLine());
                System.out.println("Enter position: ");
                employee.setPosition(scanner.nextLine());
                System.out.println("Enter salary: ");
                employee.setWage(Double.parseDouble(scanner.nextLine()));
                writeFile(employeeManagerList);
                return;
            }
        }
    }
}
