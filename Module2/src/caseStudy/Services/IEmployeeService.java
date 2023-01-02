package caseStudy.Services;

import caseStudy.Models.Employee;

public interface IEmployeeService {

    void display();

    void add();

    void edit();

    Employee findID(String id);
}
