package test;

import java.util.Scanner;

public class tongUocChan {
    public static void main(String[] args) {
        int sum_even = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập n = ");
            n = scanner.nextInt();
        }while(n <= 0);

        for(int i = 1; i <= n; i++) {
            if(n%i == 0 && i%2 == 0) {
                sum_even += i;
            }
        }
        System.out.println("Tổng ước chẵn từ 1 đến " + n + ": " + sum_even);
        scanner.close();
    }
}
