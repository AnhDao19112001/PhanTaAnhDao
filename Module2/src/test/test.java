package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n, num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        num = scanner.nextInt();
        n = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(" ");
            }
            for (int a = 0; a <= n; a++) {
                System.out.println("*");
            }
            for (int b = num - i; b >= 1; b--) {
                System.out.println("*");
            }
            n--;
        }
        for (int i = 2; i <= num; i++) {
            for (int j = num - i + 1; j >= 1; j--) {
                System.out.println(" ");
            }
            for (int c = 1; c <= i; c++) {
                System.out.println("*");
            }
            for (int d = i - 1; d >= 1; d--) {
                System.out.println("*");
            }
        }
    }
}



