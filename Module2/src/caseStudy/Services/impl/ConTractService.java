package caseStudy.Services.impl;

import caseStudy.Models.Booking;
import caseStudy.Models.Contract;
//import caseStudy.Models.Link;
import caseStudy.Services.IContractService;
import caseStudy.Utils.BookingInfoUtil;
import caseStudy.Utils.ReadWriteBookingFileUtil;
import caseStudy.Utils.ReadWriteContractFileUtil;
//import caseStudy.Utils.RegexExceptionUtil;
import caseStudy.exception.DateInvalidException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class ConTractService implements IContractService {
    @Override
    public void addContracts() {

    }

    @Override
    public void displayContracts() {

    }

    @Override
    public void editContracts() {

    }
//    private static final Scanner SCANNER = new Scanner(System.in);
//    @Override
//    public void add() {
//        Queue<Contract> contractList = ReadWriteContractFileUtil.readContractFile(Link.PATH_CONTRACT.getPath());
//
//        String numberContract;
//        numberContract = "CT-" + (contractList.size() + 1);
//        System.out.println("Số hợp đồng: " + numberContract);
//
//        TreeSet<Booking> bookingList = ReadWriteBookingFileUtil.readBookingFile(Link.PATH_BOOKING.getPath());
//
//        String bookingId;
//        if (bookingList.isEmpty()) {
//            bookingId = "BK-1";
//        } else {
//            String[] arr = bookingList.last().getBookingId().split("-");
//            bookingId = "BK-" + (Integer.parseInt(arr[1]) + 1);
//        }
//        System.out.println("\nMã đặt chỗ: " + bookingId);
//
//        System.out.print("Nhập số tiền đặt cọc (VNĐ): ");
//        int depositMoney = RegexExceptionUtil.getNumberGreaterThan0();
//
//        System.out.print("Nhập tổng số tiền thanh toán (VNĐ): ");
//        int sumMoney = 0;
//        while (sumMoney <= depositMoney) {
//            sumMoney = RegexExceptionUtil.getNumberGreaterThan0();
//
//            if (sumMoney <= depositMoney) {
//                System.out.println("Số tiền tổng phải lớn hơn số tiền cọc trước, vui lòng nhập lại!");
//            }
//        }
//
//        String customerId = BookingInfoUtil.getCustomerId();
//
//        contractList.add(new Contract(numberContract, bookingId, depositMoney, sumMoney, customerId));
//        ReadWriteContractFileUtil.writeContractFile(Link.PATH_CONTRACT.getPath(), contractList);
//        System.out.println("Thêm mới hợp đồng thành công!");
//
//        System.out.print("Nhập ngày bắt đầu: ");
//        String startDay;
//        while (true) {
//            try {
//                startDay = RegexExceptionUtil.getDateFormat();
//                if (new SimpleDateFormat("dd/MM/yyyy").parse(startDay).getTime() < new Date().getTime()) {
//                    throw new DateInvalidException("Ngày bắt đầu phải không nhỏ hơn ngày hiện tại, vui lòng nhập lại!");
//                }
//
//                break;
//            } catch (ParseException e) {
//                e.printStackTrace();
//            } catch (DateInvalidException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.print("Nhập ngày kết thúc: ");
//        String endDay;
//        while (true) {
//            try {
//                endDay = RegexExceptionUtil.getDateFormat();
//                if (new SimpleDateFormat("dd/MM/yyyy").parse(endDay).getTime() <= new SimpleDateFormat("dd/MM/yyyy").parse(startDay).getTime()) {
//                    throw new DateInvalidException("Ngày kết thúc phải lớn hơn ngày bắt đầu, vui lòng nhập lại!");
//                }
//
//                break;
//            } catch (ParseException e) {
//                e.printStackTrace();
//            } catch (DateInvalidException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        String serviceId = BookingInfoUtil.getServiceIdContract();
//
//        String serviceName;
//        if (serviceId.contains("VL")) {
//            serviceName = "Villa";
//        } else {
//            serviceName = "House";
//        }
//
//        bookingList.add(new Booking(bookingId, startDay, endDay, customerId, serviceId, serviceName));
//        ReadWriteBookingFileUtil.writeBookingFile(Link.PATH_BOOKING.getPath(), bookingList);
//        System.out.println("Thêm mới đặt chỗ thành công!");
//    }
//
//    @Override
//    public void display() {
//        Queue<Contract> contractList = ReadWriteContractFileUtil.readContractFile(Link.PATH_CONTRACT.getPath());
//        System.out.println("\nDanh sách hợp đồng: ");
//        while (!contractList.isEmpty()) {
//            System.out.println(contractList.poll());
//        }
//    }
//
//
//    @Override
//    public void edit() {
//        Queue<Contract> contractList = ReadWriteContractFileUtil.readContractFile(Link.PATH_CONTRACT.getPath());
//
//        System.out.print("\nNhập mã số hợp đồng cần chỉnh sửa: ");
//        String idEdit = SCANNER.nextLine();
//        boolean isExist = false;
//
//        for (Contract contract : contractList) {
//            if (idEdit.equals(contract.getNumberContract())) {
//                System.out.println("Hợp đồng muốn chỉnh sửa: ");
//                System.out.println(contract);
//                System.out.println("Bạn có chắc muốn chỉnh sửa hay không?\n" +
//                        " 1. Nhấn phím '1' nếu là CÓ.\n" +
//                        " 2. Nhấn phím khác nếu là KHÔNG.");
//                String chooseYesNo = SCANNER.nextLine();
//
//                if (chooseYesNo.equals("1")) {
//                    System.out.print("Nhập số tiền đặt cọc (VNĐ): ");
//                    int depositMoney = RegexExceptionUtil.getNumberGreaterThan0();
//
//                    System.out.print("Nhập tổng số tiền thanh toán (VNĐ): ");
//                    int sumMoney = 0;
//                    while (sumMoney <= depositMoney) {
//                        sumMoney = RegexExceptionUtil.getNumberGreaterThan0();
//
//                        if (sumMoney <= depositMoney) {
//                            System.out.println("Số tiền tổng phải lớn hơn số tiền cọc trước, vui lòng nhập lại!");
//                        }
//                    }
//
//                    String customerId = BookingInfoUtil.getCustomerId();
//
//                    contract.setDepositMoney(depositMoney);
//                    contract.setSumMoney(sumMoney);
//                    contract.setCustomerId(customerId);
//                    ReadWriteContractFileUtil.writeContractFile(Link.PATH_CONTRACT.getPath(), contractList);
//                    System.out.println("Chỉnh sửa hợp đồng thành công!");
//
//                    TreeSet<Booking> bookingList = ReadWriteBookingFileUtil.readBookingFile(Link.PATH_BOOKING.getPath());
//                    for (Booking booking : bookingList) {
//                        if (booking.getBookingId().equals(contract.getBookingId())) {
//                            booking.setCustomerId(customerId);
//                            ReadWriteBookingFileUtil.writeBookingFile(Link.PATH_BOOKING.getPath(), bookingList);
//                            System.out.println("Cập nhật đặt chỗ thành công!");
//                            break;
//                        }
//                    }
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
