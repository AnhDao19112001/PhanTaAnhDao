package giai_thuat.giaiThuat1;

import java.util.Scanner;

//Cho người dùng nhập vào 2 số từ bàn phím và lựa chọn phép tính ở menu. Hiển thị ra kết quả
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số thứ 2: ");
        int num2 = scanner.nextInt();
        int choose;

        do {
            System.out.println("Chọn phép tính: \n" +
                    "1. Phép tính cộng.\n" +
                    "2. Phép tính trừ.\n" +
                    "3. Phép tính nhân.\n" +
                    "4. Phép tính chia");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Kết quả phép tính cộng: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Kết quả phép tính trừ: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Kết quả phép tính nhân: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Kết quả phép tính chia: " + (num1 / num2));
            }
        }while (true);
    }
    }
