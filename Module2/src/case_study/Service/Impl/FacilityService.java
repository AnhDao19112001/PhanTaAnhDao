package case_study.Service.Impl;

import case_study.Model.FacilityModel;
import case_study.Model.Room;
import case_study.Model.Villa;
import case_study.Service.IFacilityService;
import case_study.Utils.ReadFile.ReadFileRoom;
import case_study.Utils.ReadFile.ReadFileVilla;
import case_study.Utils.WriteFile.WriteFileRoom;
import case_study.Utils.WriteFile.WriteFileVilla;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    final String PATH_ROOM = "D:\\Codegym\\Module2\\src\\case_study\\data\\room.csv";
    final String PATH_VILLA = "D:\\Codegym\\Module2\\src\\case_study\\data\\villa.csv";
    public void writeFileRoom(Map<Room, Integer> roomIntegerMap){
        WriteFileRoom.writeFireRoom(PATH_ROOM,roomIntegerMap);
    }
    public void writeFileVilla(Map<Villa, Integer> villaIntegerMap){
        WriteFileVilla.writeFileVilla(PATH_VILLA,villaIntegerMap);
    }
    @Override
    public void displayListFacility() {
        Map<FacilityModel, Integer> readFacility = new LinkedHashMap<>();
        Map<Room, Integer> roomIntegerMap = ReadFileRoom.readFileRoom(PATH_ROOM);
        readFacility.putAll(roomIntegerMap);
        Map<Villa, Integer> villaIntegerMap = ReadFileVilla.readFileVilla(PATH_VILLA);
        readFacility.putAll(villaIntegerMap);
        for (Map.Entry<FacilityModel, Integer> mapFacility: readFacility.entrySet()) {
            System.out.println(mapFacility.getKey().toString()+ "," + mapFacility.getValue());
        }
    }

    @Override
    public void displayListFacilityMaintenance() {
        Map<FacilityModel,Integer> readFacility = new LinkedHashMap<>();
        Map<Villa, Integer> villaIntegerMap = ReadFileVilla.readFileVilla(PATH_VILLA);
        readFacility.putAll(villaIntegerMap);
        Map<Room, Integer> roomIntegerMap = ReadFileRoom.readFileRoom(PATH_ROOM);
        readFacility.putAll(roomIntegerMap);
        for (Map.Entry<FacilityModel, Integer> map : readFacility.entrySet()) {
            if (map.getValue() >= 5) {
                System.out.println(map.getKey().toString() + "," + map.getValue());
            }
        }
    }

    @Override
    public void addRoom() {
        Map<Room, Integer> roomIntegerMap = ReadFileRoom.readFileRoom(PATH_ROOM);
        Room room = new Room();
        System.out.println("Vui lòng điền thông tin sau: ");
        System.out.println("mã dịch vụ:");
        room.setId(scanner.nextLine());
        System.out.println("Tên dịch vụ:");
        room.setName(scanner.nextLine());
        System.out.println("Diện tích sử dụng:");
        room.setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Chi phí thuê:");
        room.setCosts(Double.parseDouble(scanner.nextLine()));
        System.out.println("Số lượng người tối đa:");
        room.setAmount(scanner.nextLine());
        System.out.println("Kiểu thuê:");
        room.setRentalType(scanner.nextLine());
        System.out.println("Dịch vụ miễn phí đi kèm: ");
        room.setFreeService(scanner.nextLine());
        roomIntegerMap.put(room, 0);
        writeFileRoom(roomIntegerMap);
    }

    @Override
    public void addVilla() {
        Map<Villa, Integer> villaIntegerMap = ReadFileVilla.readFileVilla(PATH_VILLA);
        Villa villa = new Villa();
        System.out.println("Vui lòng điền thông tin sau : ");
        System.out.println("Mã dịch vụ:");
        villa.setId(scanner.nextLine());
        System.out.println("Tên dịch vụ :");
        villa.setName(scanner.nextLine());
        System.out.println("Diện tích sử dụng :");
        villa.setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Chi phí thuê :");
        villa.setCosts(Double.parseDouble(scanner.nextLine()));
        System.out.println("Số lượng người tối đa:");
        villa.setAmount(scanner.nextLine());
        System.out.println("Kiểu thuê:");
        villa.setRentalType(scanner.nextLine());
        System.out.println("Tiêu chuẩn phòng:");
        villa.setRoom(scanner.nextLine());
        System.out.println("Diện tích hồ bơi:");
        villa.setPoolArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Sô tầng:");
        villa.setNumberOfFloors(scanner.nextLine());
        villaIntegerMap.put(villa, 0);
        writeFileVilla(villaIntegerMap);
    }
}
