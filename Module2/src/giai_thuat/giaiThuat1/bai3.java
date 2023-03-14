package giai_thuat.giaiThuat1;

import java.util.Scanner;

// tính trung bình cộng của ước chung lớn nhất và bội chung nhỏ nhất
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số thứ 2: ");
        int num2 = scanner.nextInt();

        int arg = 0;
        int i;
        int max = 1;
        System.out.println("Ưóc chung lớn nhất: ");
        for (i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    max = i;
                    break;
                }
            }
        }
        System.out.println(max);

        System.out.println("Bội chung nhỏ nhất: ");
        int bcnn = (num1 * num2) / max;
        System.out.println(bcnn);
        arg = (max + bcnn) / 2;
        System.out.println("Trung bình cộng là: " + arg);
    }
}

