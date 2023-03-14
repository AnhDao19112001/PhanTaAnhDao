package test;

import java.util.Scanner;

public class timUCLNVaBCNN {
    public static void main(String[] args) {
        int firstNumber, secondNumber, temp1, temp2, uscln, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        secondNumber = scanner.nextInt();

        temp1 = firstNumber;
        temp2 = secondNumber;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        uscln = temp1;
        sum = uscln + ((firstNumber * secondNumber) / uscln);
        System.out.println("Ước số chung lớn nhất của " + firstNumber + " và " + secondNumber + " = " + uscln);
        System.out.println("Bội số chung lớn nhất của " + firstNumber + " và " + secondNumber + " = " +
                ((firstNumber * secondNumber) / uscln));
        System.out.println("Tổng của ucln và bcnn là: " + sum);
    }
}
