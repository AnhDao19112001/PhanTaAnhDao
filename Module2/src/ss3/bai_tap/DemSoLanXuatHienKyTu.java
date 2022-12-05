package ss3.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        String str = "phantaanhdao";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự: ");
        char c = scanner.nextLine().charAt(0); // nhap gia tri c
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) { // neu gia tri dau = c
                count++; // tang bien dem
            }
        }
        System.out.println(count);
    }
}
