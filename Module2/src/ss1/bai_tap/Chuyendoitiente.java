package ss1.bai_tap;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n= scaner.nextInt();
        int primeNumb = 1;

        while (primeNumb < n) {
            int count = 0;
            for (int i=1; i<=primeNumb; i++) {
                if (primeNumb%i==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(primeNumb);
            }
            primeNumb++;
        }
    }
}
