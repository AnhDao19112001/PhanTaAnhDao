package caseStudy.Services.impl;

import caseStudy.Models.Facility;
//import caseStudy.Models.Link;
import caseStudy.Models.Room;
import caseStudy.Models.Villa;
import caseStudy.Services.IFacilityService;
import caseStudy.Utils.MenuUtil;
import caseStudy.Utils.ReadWriteFacilityFileUtil;
//import caseStudy.Utils.RegexExceptionUtil;
import caseStudy.exception.DuplicateIdException;
import caseStudy.exception.IdFormatException;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    @Override
    public void displayMaintain() {

    }

    @Override
    public void display() {

    }

    @Override
    public void add() {

    }
//    private static final Scanner SCANNER = new Scanner(System.in);
//    private Object DuplicateIdException;
//
//    private void inputFacility(Facility facility){
//        Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_VILLA.getPath());
//        Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_ROOM.getPath());
//
//        String serviceId;
//        String serviceName = null;
//        while (true) {
//            try {
//                System.out.print("Nhập mã dịch vụ: ");
//                serviceId = SCANNER.nextLine();
//                if (facility instanceof Villa) {
//                    if (!serviceId.matches("^SVVL-\\d{4}$")) {
//                        throw new IdFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng SVVL-YYYY (với Y là số từ 0-9)!");
//                    }
//
//                    for (Facility villa : villaList.keySet()) {
//                        if (serviceId.equals(villa.getServiceId())) {
//                            throw new DuplicateIdException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
//                        }
//                    }
//
//                    serviceName = "Villa";
//                }
//
//                 else {
//                    if (!serviceId.matches("^SVRO-\\d{4}$")) {
//                        throw new IdFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng SVRO-YYYY (với Y là số từ 0-9)!");
//                    }
//
//                    for (Facility room : roomList.keySet()) {
//                        if (serviceId.equals(room.getServiceId())) {
//                            throw new DuplicateIdException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
//                        }
//                    }
//
//                    serviceName = "Room";
//                }
//                break;
//            } catch (IdFormatException | DuplicateIdException e) {
//                System.out.println(e.getMessage());
//            }
//
//            System.out.print("Nhập diện tích sử dụng (m2): ");
//        double areaUse = RegexExceptionUtil.getAreaUse();
//
//        System.out.print("Nhập chi phí thuê (VNĐ): ");
//        int rentalCosts = RegexExceptionUtil.getNumberGreaterThan0();
//
//        System.out.print("Nhập số người tối đa: ");
//        int maxNumberOfPeople = RegexExceptionUtil.getMaxNumberOfPeople();
//
//        String rentalType = MenuUtil.getRentalType();
//
//        facility.setServiceId(serviceId);
//        facility.setServiceName(serviceName);
//        facility.setAreaUse(areaUse);
//        facility.setRentalCosts(rentalCosts);
//        facility.setMaxNumberOfPeople(maxNumberOfPeople);
//        facility.setRentalType(rentalType);
//    }
//
//    @Override
//    public void add() {
//        while (true) {
//            System.out.println("\nThêm mới cơ sở:\n" +
//                    "1. Thêm mới biệt thự.\n" +
//                    "2. Thêm mới nhà.\n" +
//                    "3. Thêm mới phòng.\n" +
//                    "4. Trở về MENU quản lý cơ sở.");
//            int choice = 0;
//            try {
//                System.out.print("Mời bạn nhập lựa chọn: ");
//                choice = Integer.parseInt(SCANNER.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Vui lòng nhập số!");
//            }
//
//            switch (choice) {
//                case 1:
//                    Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_VILLA.getPath());
//                    Villa villa = new Villa();
//                    inputFacility(villa);
//
//                    System.out.print("Nhập tiêu chuẩn phòng: ");
//                    String roomStandardVilla = RegexExceptionUtil.getUpperCaseFirstWord();
//
//                    System.out.print("Nhập diện tích hồ bơi (m2): ");
//                    double poolArea = RegexExceptionUtil.getAreaUse();
//
//                    System.out.print("Nhập số tầng: ");
//                    int numberOfFloorsVilla = RegexExceptionUtil.getNumberGreaterThan0();
//
//                    villa.setRoomStandard(roomStandardVilla);
//                    villa.setPoolArea(poolArea);
//                    villa.setNumberOfFloors(numberOfFloorsVilla);
//
//                    villaList.put(villa, 0);
//                    ReadWriteFacilityFileUtil.writeFacilityFile(Link.PATH_VILLA.getPath(), villaList);
//                    System.out.println("Thêm mới Biệt thự thành công!");
//                    break;
//                case 2:
//                    Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_ROOM.getPath());
//                    Room room = new Room();
//                    inputFacility(room);
//
//                    System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
//                    String freeServiceIncluded = RegexExceptionUtil.getUpperCaseFirstWord();
//
//                    room.setFreeServiceIncluded(freeServiceIncluded);
//                    roomList.put(room, 0);
//                    ReadWriteFacilityFileUtil.writeFacilityFile(Link.PATH_ROOM.getPath(), roomList);
//                    System.out.println("Thêm mới Phòng thành công!");
//                    break;
//                case 3:
//                    return;
//                default:
//                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
//            }
//        }
//    }
//
//    @Override
//    public void display() {
//        System.out.println("\nDanh sách cơ sở: ");
//
//        System.out.println("1. Danh sách biệt thự: ");
//        Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_VILLA.getPath());
//        for (Facility villa : villaList.keySet()) {
//            System.out.println(villa + " | Số lần sử dụng: " + villaList.get(villa));
//        }
//
//        System.out.println("2. Danh sách phòng: ");
//        Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_ROOM.getPath());
//        for (Facility room : roomList.keySet()) {
//            System.out.println(room + " | Số lần sử dụng: " + roomList.get(room));
//        }
//    }
//
//    @Override
//    public void displayMaintain() {
//        System.out.println("\nDanh sách bảo trì cơ sở: ");
//
//        System.out.println("1. Danh sách bảo trì biệt thự: ");
//        Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_VILLA.getPath());
//        for (Facility villa : villaList.keySet()) {
//            if (villaList.get(villa) > 4) {
//                System.out.println(villa + " | Số lần sử dụng: " + villaList.get(villa));
//            }
//        }
//
//        System.out.println("3. Danh sách bảo trì phòng: ");
//        Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(Link.PATH_ROOM.getPath());
//        for (Facility room : roomList.keySet()) {
//            if (roomList.get(room) > 4) {
//                System.out.println(room + " | Số lần sử dụng: " + roomList.get(room));
//            }
//        }
//    }
}

