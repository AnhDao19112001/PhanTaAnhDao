package case_study.service.Impl;

import case_study.model.CustomerModel;
import case_study.service.ICustomerService;
import case_study.utils.readFile.ReadFileCustomer;
import case_study.utils.writeFile.WriteFileCustomer;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    final String PATH_CUSTOMER = "D:\\Codegym\\Module2\\src\\case_study\\data\\customer.csv";
    Scanner scanner = new Scanner(System.in);

    public void writeFile(List<CustomerModel> customerModelList) {
        WriteFileCustomer.writeFileCustomer(PATH_CUSTOMER, customerModelList);
    }

    @Override
    public void display() {
        List<CustomerModel> customerModels = ReadFileCustomer.readFileCustomer(PATH_CUSTOMER);
        for (CustomerModel customer : customerModels) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        List<CustomerModel> customers = ReadFileCustomer.readFileCustomer(PATH_CUSTOMER);
        CustomerModel customer = new CustomerModel();
        System.out.println("Vui lòng điền thông tin sau:");
        System.out.println("Mã khách hàng:");
        customer.setCustomerCode(scanner.nextLine());
        System.out.println("Họ và tên:");
        customer.setName(scanner.nextLine());
        System.out.println("Ngày sinh:");
        customer.setdOB((scanner.nextLine()));
        System.out.println("Giới Tính: ");
        customer.setGender(scanner.nextLine());
        System.out.println("số chứng minh nhân dân:");
        customer.setIdCard(scanner.nextLine());
        System.out.println("số điện thoại: ");
        customer.setPhoneNumber(scanner.nextLine());
        System.out.println("email: ");
        customer.setEmail(scanner.nextLine());
        System.out.println("Loại khách: ");
        customer.setTypeOfGuest(scanner.nextLine());
        System.out.println("Địa chỉ: ");
        customer.setAddress(scanner.nextLine());
        customers.add(customer);
        writeFile(customers);
    }

    @Override
    public void edit() {
        List<CustomerModel> customers = ReadFileCustomer.readFileCustomer(PATH_CUSTOMER);
        System.out.println("Nhập vào mã khách hàng muốn sửa:");
        String id = scanner.nextLine();
        for (CustomerModel customer : customers) {
            if (customer.getCustomerCode().equals(id)) {
                System.out.println("Nhập lại mã khách hàng mới: ");
                customer.setCustomerCode(scanner.nextLine());
                System.out.println("Nhập lại họ tên khách hàng mới: ");
                customer.setName(scanner.nextLine());
                System.out.println("Nhập lại ngày tháng năm khách hàng mới: ");
                customer.setdOB(scanner.nextLine());
                System.out.println("Nhập lại giới tính khách hàng mới: ");
                customer.setGender(scanner.nextLine());
                System.out.println("Nhập lại số CMND mới khách hàng mới: ");
                customer.setIdCard(scanner.nextLine());
                System.out.println("Nhập lại số điện thoại khách hàng mới: ");
                customer.setPhoneNumber(scanner.nextLine());
                System.out.println("Nhập lại email khách hàng mới: ");
                customer.setEmail(scanner.nextLine());
                System.out.println("Nhập lại loại khách hàng mới: ");
                customer.setTypeOfGuest(scanner.nextLine());
                System.out.println("Nhập lại địa chỉ khách hàng mới: ");
                customer.setAddress(scanner.nextLine());
                writeFile(customers);
                System.out.println("Đã thêm thành công!");
                break;
            }
        }
    }
}
