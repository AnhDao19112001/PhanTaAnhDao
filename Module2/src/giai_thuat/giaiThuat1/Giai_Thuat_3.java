package giai_thuat.giaiThuat1;

import java.util.Scanner;

// Hiển thih ra số cuối cùng của dãy số nguyên tố
public class Giai_Thuat_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int count = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i =0;i<=n;i++){
            if(i%1==0 ){
                count++;
            }
        }
        if (count == 2){
            System.out.println();
        }
    }
}
