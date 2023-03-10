package test;

import java.util.Scanner;

public class doiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, daoNguoc = 0, banDau;
        System.out.println("Nhập vào số cần kiểm tra: ");
        num1 = scanner.nextInt();
        banDau = num1;
        while(num1 != 0) {
            int digit = num1 % 10;
            daoNguoc = daoNguoc * 10 + digit;
            num1 /= 10;
        }
        if(daoNguoc == banDau){
            System.out.println(banDau+ " là số đối xứng!!");
        }
        else{
            System.out.println(banDau+ " không phải là số đối xứng!!");
        }
    }
}
