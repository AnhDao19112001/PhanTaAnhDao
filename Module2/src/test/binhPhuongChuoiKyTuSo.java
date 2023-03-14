package test;

import java.util.Scanner;

public class binhPhuongChuoiKyTuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cuối dãy ");
        int lastNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lastNumber; i++) {
            if (checkNum(i))
                System.out.print(i+"\t");
        }
    }

    public static boolean checkNum(int number){
        double sprt = Math.sqrt(number);
        return sprt == (int)sprt;
    }
}
