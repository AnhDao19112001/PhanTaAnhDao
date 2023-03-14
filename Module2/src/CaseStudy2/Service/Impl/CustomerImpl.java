package CaseStudy2.Service.Impl;

import CaseStudy2.Model.CustomerManager;
import CaseStudy2.Service.ICustomerManager;
import CaseStudy2.Util.ReadWriteFile;

import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements ICustomerManager {
    Scanner scanner = new Scanner(System.in);
    final String PATH_CUSTOMER = "D:\\Codegym\\Module2\\src\\CaseStudyTrinh\\Data\\customer.csv";
    public void writeFile(List<CustomerManager> customerManagerList){
        ReadWriteFile.writeFile(PATH_CUSTOMER, customerManagerList);
    }
    @Override
    public void display() {
        List<CustomerManager> customerManagers = ReadWriteFile.readFile(PATH_CUSTOMER);
        for (CustomerManager customer: customerManagers) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        List<CustomerManager> customerManagers = ReadWriteFile.readFile(PATH_CUSTOMER);
        CustomerManager customerManager = new CustomerManager();
        System.out.println("");
    }

    @Override
    public void edit() {

    }
}
