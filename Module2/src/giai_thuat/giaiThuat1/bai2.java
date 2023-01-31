package giai_thuat.giaiThuat1;

import java.util.Scanner;

// tính tổng các ước số
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();
        int sum=0;
        int i;
        System.out.println("Tổng" +
                "lll ước chung của number là: ");
        for ( i = 1; i <= number ; ) {
            if (number % i == 0){
                sum +=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
