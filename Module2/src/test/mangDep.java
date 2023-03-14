package test;

import java.util.Arrays;
import java.util.Scanner;

public class mangDep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập length: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử vào mảng");
            int temp = Integer.parseInt(scanner.nextLine());
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        boolean kt = false;
        for (int i=0; i<arr.length;i++){
            int count=0;
            for (int j=0;j<i;j++){
                count += arr[j];
            }
            int count1=0;
            for (int j = i+1; j <arr.length ; j++) {
                count1 += arr[j];
            }
            if (count == count1){
                kt = true;
                break;
            }
        }
        System.out.println(kt);
    }
}

