package caseStudy.Services.impl;

import caseStudy.Models.Employee;
import caseStudy.Services.IEmployeeService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
//        String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String level, String position, int salary
        System.out.println("Name");
        String name = scanner.nextLine();
        System.out.println("Date Of Birth");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Gender");
        String gender = scanner.nextLine();
        System.out.println("Id Card");
        String idCard = scanner.nextLine();
        System.out.println("Phone");
        String phone = scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Level");
        String level = scanner.nextLine();
        System.out.println("Position");
        String position = scanner.nextLine();
        System.out.println("Salary");
        String salary = scanner.nextLine();
    }

    @Override
    public void edit() {

    }

    @Override
    public Employee findID(String id) {
        for (int i = 0; i<employeeList.size();i++){
            if (employeeList.get(i).getId().equals(id) ){
                return employeeList.get(i);
            }
        }
        return null;
    }
}
