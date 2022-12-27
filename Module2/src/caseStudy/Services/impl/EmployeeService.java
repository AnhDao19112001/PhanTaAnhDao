package caseStudy.Services.impl;

import caseStudy.Services.IEmployeeService;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final Scanner sc = new Scanner(System.in);
    @Override
    public void add() {
        List<Employee> employeeList = ReadWriteEmployeeFileUtil.readEmployeeFile(Link.PATH_EMPLOYEE.getPath());

        System.out.print("\nNhập mã số nhân viên: ");
        String id;
        while (true) {
            try {
                id = SCANNER.nextLine();
                if (!id.matches("^E\\d{4}$")) {
                    throw new IdFormatException("Mã nhân viên phải đúng định dạng: EXXXX, với XXXX là các số từ 0-9!");
                }

                for (Employee employee : employeeList) {
                    if (id.equals(employee.getId())) {
                        throw new DuplicateIdException("Mã nhân viên đã tồn tại, vui lòng nhập lại!");
                    }
                }

                break;
            } catch (IdFormatException | DuplicateIdException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập tên nhân viên: ");
        String name = RegexExceptionUtil.getUpperCaseName();

        System.out.print("Nhập ngày sinh nhân viên: ");
        String dateOfBirth = RegexExceptionUtil.getAge();

        String gender = MenuUtil.getGender();

        System.out.print("Nhập số CMND/CCCD nhân viên: ");
        String idCard = RegexExceptionUtil.getIdCard();

        System.out.print("Nhập số điện thoại nhân viên: ");
        String phone = RegexExceptionUtil.getPhone();

        System.out.print("Nhập email nhân viên: ");
        String email = RegexExceptionUtil.getEmail();

        String level = MenuUtil.getLevel();

        String position = MenuUtil.getPosition();

        System.out.print("Nhập lương nhân viên (VNĐ/tháng): ");
        int salary = RegexExceptionUtil.getNumberGreaterThan0();

        employeeList.add(new Employee(id, name, dateOfBirth, gender, idCard, phone, email, level, position, salary));
        ReadWriteEmployeeFileUtil.writeEmployeeFile(Link.PATH_EMPLOYEE.getPath(), employeeList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadWriteEmployeeFileUtil.readEmployeeFile(Link.PATH_EMPLOYEE.getPath());
        System.out.println("\nDanh sách nhân viên: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadWriteEmployeeFileUtil.readEmployeeFile(Link.PATH_EMPLOYEE.getPath());
        System.out.print("\nNhập mã số nhân viên cần chỉnh sửa: ");
        String idEdit = SCANNER.nextLine();
        boolean isExist = false;

        for (Employee employee : employeeList) {
            if (idEdit.equals(employee.getId())) {
                System.out.println("Nhân viên muốn chỉnh sửa: ");
                System.out.println(employee);
                System.out.println("Bạn có chắc muốn chỉnh sửa hay không?\n" +
                        " 1. Nhấn phím '1' nếu là CÓ.\n" +
                        " 2. Nhấn phím khác nếu là KHÔNG.");
                String chooseYesNo = SCANNER.nextLine();

                if (chooseYesNo.equals("1")) {
                    do {
                        System.out.println("Chỉnh sửa thông tin nhân viên:\n" +
                                "1. Chỉnh sửa tên.\n" +
                                "2. Chỉnh sửa ngày sinh.\n" +
                                "3. Chỉnh sửa giới tính.\n" +
                                "4. Chỉnh sửa số CMND.\n" +
                                "5. Chỉnh sửa số điện thoại.\n" +
                                "6. Chỉnh sửa email.\n" +
                                "7. Chỉnh sửa trình độ.\n" +
                                "8. Chỉnh sửa vị trí.\n" +
                                "9. Chỉnh sửa lương.\n" +
                                "10. Kết thúc chỉnh sửa.");
                        int choose = 0;
                        try {
                            System.out.print("Mời bạn nhập lựa chọn: ");
                            choose = Integer.parseInt(SCANNER.nextLine());
                        } catch (NumberFormatException e) {
                            e.getStackTrace();
                        }

                        switch (choose) {
                            case 1:
                                System.out.print("Nhập tên nhân viên: ");
                                employee.setId(RegexExceptionUtil.getUpperCaseName());
                                break;
                            case 2:
                                System.out.print("Nhập ngày sinh nhân viên: ");
                                employee.setDateOfBirth(RegexExceptionUtil.getDateFormat());
                                break;
                            case 3:
                                employee.setGender(MenuUtil.getGender());
                                break;
                            case 4:
                                System.out.print("Nhập số CMND/CCCD nhân viên: ");
                                employee.setIdCard(RegexExceptionUtil.getIdCard());
                                break;
                            case 5:
                                System.out.print("Nhập số điện thoại nhân viên: ");
                                employee.setPhone(RegexExceptionUtil.getPhone());
                                break;
                            case 6:
                                System.out.print("Nhập email nhân viên: ");
                                employee.setEmail(RegexExceptionUtil.getEmail());
                                break;
                            case 7:
                                employee.setLevel(MenuUtil.getLevel());
                                break;
                            case 8:
                                employee.setPosition(MenuUtil.getPosition());
                                break;
                            case 9:
                                System.out.print("Nhập lương nhân viên (VNĐ): ");
                                employee.setSalary(RegexExceptionUtil.getNumberGreaterThan0());
                                break;
                            case 10:
                                ReadWriteEmployeeFileUtil.writeEmployeeFile(Link.PATH_EMPLOYEE.getPath(), employeeList);
                                System.out.println("Chỉnh sửa thành công!");
                                return;
                            default:
                                System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
                        }
                    } while (true);
                }

                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }
}
