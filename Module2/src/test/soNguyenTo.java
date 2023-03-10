package test;

import java.util.Scanner;

public class soNguyenTo {
        public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố n: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }
//    public static void main(String[] args) {
//        int n;
//        boolean isPrime = true;
//        System.out.println("Nhập số nguyên tố: ");
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        if (n <= 1) {
//            isPrime = false;
//        }
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println(n + " là số nguyên tố.");
//        } else {
//            System.out.println(n + " không phải là số nguyên tố.");
//        }
//    }
}
