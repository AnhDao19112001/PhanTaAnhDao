package caseStudy.Services.impl;

import caseStudy.Models.Customer;
//import caseStudy.Models.Link;
import caseStudy.Services.ICustomerService;
import caseStudy.Utils.MenuUtil;
import caseStudy.Utils.ReadWriteCustomerFileUtils;
//import caseStudy.Utils.RegexExceptionUtil;
import caseStudy.exception.DuplicateIdException;
import caseStudy.exception.IdFormatException;

import java.util.List;
import java.util.Scanner;

import static sun.plugin.javascript.navig.JSType.Link;

public class CustomerService implements ICustomerService {
    Scanner SCANNER = new Scanner(System.in);

    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }


//    @Override
//    public void add() {
//        List<Customer> customerList = ReadWriteCustomerFileUtils.readCustomerFile(Link.PATH_CUSTOMER.getPath());
//
//        System.out.print("\nNhập mã số khách hàng: ");
//        String id;
//        while (true) {
//            try {
//                id = SCANNER.nextLine();
//                if (!id.matches("^C\\d{4}$")) {
//                    throw new IdFormatException("Mã khách hàng phải đúng định dạng: CXXXX, với XXXX là các số từ 0-9, vui lòng nhập lại!");
//                }
//
//                for (Customer customer : customerList) {
//                    if (id.equals(customer.getId())) {
//                        throw new DuplicateIdException("Mã khách hàng đã tồn tại, vui lòng nhập lại!");
//                    }
//                }
//
//                break;
//            } catch (IdFormatException | DuplicateIdException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.print("Nhập tên khách hàng: ");
//        String name = RegexExceptionUtil.getUpperCaseName();
//
//        System.out.print("Nhập ngày sinh khách hàng: ");
//        String dateOfBirth = RegexExceptionUtil.getAge();
//
//        String gender = MenuUtil.getGender();
//
//        System.out.print("Nhập số CMND/CCCD khách hàng: ");
//        String idCard = RegexExceptionUtil.getIdCard();
//
//        System.out.print("Nhập số điện thoại khách hàng: ");
//        String phone = RegexExceptionUtil.getPhone();
//
//        System.out.print("Nhập email khách hàng: ");
//        String email = RegexExceptionUtil.getEmail();
//
//        String customerType = MenuUtil.getCustomerType();
//
//        System.out.print("Nhập địa chỉ khách hàng: ");
//        String address = RegexExceptionUtil.getUpperCaseName();
//
//        customerList.add(new Customer(id, name, dateOfBirth, gender, idCard, phone, email, customerType, address));
//        ReadWriteCustomerFileUtils.writeCustomerFile(Link.PATH_CUSTOMER.getPath(), customerList);
//        System.out.println("Thêm mới thành công!");
//    }
//
//    @Override
//    public void display() {
//        List<Customer> customerList = ReadWriteCustomerFileUtils.readCustomerFile(Link.PATH_CUSTOMER.getPath());
//        System.out.println("\nDanh sách khách hàng: ");
//        for (Customer customer : customerList) {
//            System.out.println(customer);
//        }
//    }
//
//    @Override
//    public void edit() {
//        List<Customer> customerList = ReadWriteCustomerFileUtils.readCustomerFile(Link.PATH_CUSTOMER.getPath());
//        System.out.print("\nNhập mã số khách hàng cần chỉnh sửa: ");
//        String idEdit = SCANNER.nextLine();
//        boolean isExist = false;
//
//        for (Customer customer : customerList) {
//            if (idEdit.equals(customer.getId())) {
//                System.out.println("Khách hàng muốn chỉnh sửa: ");
//                System.out.println(customer);
//                System.out.println("Bạn có chắc muốn chỉnh sửa hay không?\n" +
//                        " 1. Nhấn phím '1' nếu là CÓ.\n" +
//                        " 2. Nhấn phím khác nếu là KHÔNG.");
//                String chooseYesNo = SCANNER.nextLine();
//
//                if (chooseYesNo.equals("1")) {
//                    do {
//                        System.out.println("Chỉnh sửa thông tin khách hàng:\n" +
//                                "1. Chỉnh sửa tên.\n" +
//                                "2. Chỉnh sửa ngày sinh.\n" +
//                                "3. Chỉnh sửa giới tính.\n" +
//                                "4. Chỉnh sửa số CMND.\n" +
//                                "5. Chỉnh sửa số điện thoại.\n" +
//                                "6. Chỉnh sửa email.\n" +
//                                "7. Chỉnh sửa loại khách hàng.\n" +
//                                "8. Chỉnh sửa địa chỉ.\n" +
//                                "9. Kết thúc chỉnh sửa.");
//                        int choose = 0;
//                        try {
//                            System.out.print("Mời bạn nhập lựa chọn: ");
//                            choose = Integer.parseInt(SCANNER.nextLine());
//                        } catch (NumberFormatException e) {
//                            e.getStackTrace();
//                        }
//
//                        switch (choose) {
//                            case 1:
//                                System.out.print("Nhập tên khách hàng: ");
//                                customer.setId(RegexExceptionUtil.getUpperCaseName());
//                                break;
//                            case 2:
//                                System.out.print("Nhập ngày sinh khách hàng: ");
//                                customer.setDateOfBirth(RegexExceptionUtil.getDateFormat());
//                                break;
//                            case 3:
//                                customer.setGender(MenuUtil.getGender());
//                                break;
//                            case 4:
//                                System.out.print("Nhập số CMND/CCCD khách hàng: ");
//                                customer.setIdCard(RegexExceptionUtil.getIdCard());
//                                break;
//                            case 5:
//                                System.out.print("Nhập số điện thoại khách hàng: ");
//                                customer.setPhone(RegexExceptionUtil.getPhone());
//                                break;
//                            case 6:
//                                System.out.print("Nhập email khách hàng: ");
//                                customer.setEmail(RegexExceptionUtil.getEmail());
//                                break;
//                            case 7:
//                                customer.setCustomerType(MenuUtil.getCustomerType());
//                                break;
//                            case 8:
//                                System.out.print("Nhập địa chỉ khách hàng: ");
//                                customer.setAddress(RegexExceptionUtil.getUpperCaseName());
//                                break;
//                            case 9:
//                                ReadWriteCustomerFileUtils.writeCustomerFile(Link.PATH_CUSTOMER.getPath(), customerList);
//                                System.out.println("Chỉnh sửa thành công!");
//                                return;
//                            default:
//                                System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
//                        }
//                    } while (true);
//                }
//
//                isExist = true;
//                break;
//            }
//        }
//
//        if (!isExist) {
//            System.out.println("Không tìm thấy!");
//        }
//    }
}
