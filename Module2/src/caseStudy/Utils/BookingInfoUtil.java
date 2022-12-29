package caseStudy.Utils;

import caseStudy.Models.Customer;
import caseStudy.Models.Facility;
//import caseStudy.Models.Link;
import caseStudy.Services.impl.CustomerService;
import caseStudy.Services.impl.FacilityService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookingInfoUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

//    public static String getCustomerId() {
//        new CustomerService().display();
//        List<Customer> customerList = ReadWriteCustomerFileUtils.readCustomerFile(Link.PATH_CUSTOMER.getPath());
//        System.out.print("Nhập mã khách hàng: ");
//        String customerId;
//
//        do {
//            customerId = SCANNER.nextLine();
//            for (Customer customer : customerList) {
//                if (customerId.equals(customer.getId())) {
//                    return customerId;
//                }
//            }
//
//            System.out.println("Mã khách hàng khồng tồn tại, vui lòng nhập lại!");
//        } while (true);
//    }
//
//    public static String getServiceIdBooking() {
//        new FacilityService().display();
//        Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_VILLA.getPath());
//        Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_ROOM.getPath());
//
//        System.out.print("Nhập mã dịch vụ: ");
//        String serviceId;
//
//        do {
//            serviceId = SCANNER.nextLine();
//
//            for (Facility villa : villaList.keySet()) {
//                if (serviceId.equals(villa.getServiceId())) {
//                    villaList.put(villa, villaList.get(villa) + 1);
//                    ReadWriteFacilityFileUtil.writeFacilityFile(Link.PATH_VILLA.getPath(), villaList);
//
//                    if (villaList.get(villa) + 1 > 4) {
//                        System.out.println("Cơ sở cần được kiểm tra bảo dưỡng các trang thiết bị!");
//                    }
//                    return serviceId;
//                }
//            }
//
//            for (Facility room : roomList.keySet()) {
//                if (serviceId.equals(room.getServiceId())) {
//                    roomList.put(room, roomList.get(room) + 1);
//                    ReadWriteFacilityFileUtil.writeFacilityFile(Link.PATH_ROOM.getPath(), roomList);
//
//                    if (roomList.get(room) + 1 > 4) {
//                        System.out.println("Cơ sở cần được kiểm tra bảo dưỡng các trang thiết bị!");
//                    }
//                    return serviceId;
//                }
//            }
//
//            System.out.println("Mã dịch vụ khồng tồn tại, vui lòng nhập lại!");
//        } while (true);
//    }
//
//    public static String getServiceIdContract() {
//        new FacilityService().display();
//        Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_VILLA.getPath());
//
//        System.out.print("Nhập mã dịch vụ Villa: ");
//        String serviceId;
//
//        do {
//            serviceId = SCANNER.nextLine();
//
//            for (Facility villa : villaList.keySet()) {
//                if (serviceId.equals(villa.getServiceId())) {
//                    villaList.put(villa, villaList.get(villa) + 1);
//                    ReadWriteFacilityFileUtil.writeFacilityFile(Link.PATH_VILLA.getPath(), villaList);
//
//                    if (villaList.get(villa) + 1 > 4) {
//                        System.out.println("Cơ sở cần được kiểm tra bảo dưỡng các trang thiết bị!");
//                    }
//                    return serviceId;
//                }
//            }
//            System.out.println("Mã dịch vụ khồng tồn tại, vui lòng nhập lại!");
//        } while (true);
//    }
}
