package ss1.bai3.Service;

import ss1.bai3.Model.NganHangModel;
import ss1.bai3.Util.ReadNganHang;
import ss1.bai3.Util.WriteNganHang;

import java.util.List;
import java.util.Scanner;

public class NganHangServiceImpl implements INganHangSerive {
    private final String PATH_NGANHANG = "D:\\Codegym\\Module2\\src\\ss1\\bai3\\File\\so_tiet_kiem.csv";
    Scanner scanner = new Scanner(System.in);

    public void writeFile(List<NganHangModel> nganHangModelList) {
        WriteNganHang.writeFile(nganHangModelList, PATH_NGANHANG);
    }
        @Override
        public void add () {
            List<NganHangModel> nganHangModelList1 = ReadNganHang.readFile(PATH_NGANHANG);
            NganHangModel nganHangModel = new NganHangModel();
            System.out.println("Nhập id khách hàng: ");
            nganHangModel.setId(scanner.nextLine());
            System.out.println("Nhập mã khách hàng: ");
            nganHangModel.setMaKhachHang(scanner.nextLine());
            System.out.println("Nhập tên khách hàng: ");
            nganHangModel.setTenKhachHang(scanner.nextLine());
            System.out.println("Nhập số tiền:");
            nganHangModel.setSoTien(scanner.nextLine());
            System.out.println("Nhập kỳ hạn: ");
            nganHangModel.setKyHan(scanner.nextLine());
            System.out.println("Nhập lãi suất: ");
            nganHangModel.setLaiSuat(scanner.nextLine());
            System.out.println("Nhập mã sổ tiết kiệm: ");
            nganHangModel.setMaSoTietKiem(scanner.nextLine());
            nganHangModelList1.add(nganHangModel);
            writeFile(nganHangModelList1);
        }

        @Override
        public void display () {
            List<NganHangModel> nganHangModelList1 = ReadNganHang.readFile(PATH_NGANHANG);

            for (NganHangModel nganHangModel : nganHangModelList1) {
                System.out.println(nganHangModel);
            }
        }

        @Override
        public void search () {
            List<NganHangModel> nganHangModelList1 = ReadNganHang.readFile(PATH_NGANHANG);
            System.out.println("Nhập tên cần tìm: ");
            String tenKhachHang = scanner.nextLine();
            for (NganHangModel nganHangModel : nganHangModelList1) {
                if (nganHangModel.getTenKhachHang().equals(tenKhachHang)) {
                    System.out.println(nganHangModelList1.toString());
                    return;
                }
            }
            System.out.println("Tên không có trong danh sách!");
        }

}

