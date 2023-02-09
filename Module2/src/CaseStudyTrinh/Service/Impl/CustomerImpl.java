package CaseStudyTrinh.Service.Impl;

import CaseStudyTrinh.Model.CustomerManager;
import CaseStudyTrinh.Service.ICustomerManager;
import CaseStudyTrinh.Util.ReadWriteFileCustomer;

import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements ICustomerManager {
    Scanner scanner = new Scanner(System.in);
    final String PATH_CUSTOMER = "D:\\Codegym\\Module2\\src\\CaseStudyTrinh\\Data\\customer.csv";
    public void writeFile(List<CustomerManager> customerManagerList){
        ReadWriteFileCustomer.writeFile(PATH_CUSTOMER, customerManagerList);
    }
    @Override
    public void display() {
        List<CustomerManager> customerManagers = ReadWriteFileCustomer.readFile(PATH_CUSTOMER);
        for (CustomerManager customer: customerManagers) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        List<CustomerManager> customerManagers = ReadWriteFileCustomer.readFile(PATH_CUSTOMER);
        CustomerManager customerManager = new CustomerManager();
        System.out.println("");
    }

    @Override
    public void edit() {

    }
}