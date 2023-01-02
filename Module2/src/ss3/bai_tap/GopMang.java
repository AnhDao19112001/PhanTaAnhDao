package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng 1: ");
        int length1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[length1];
        System.out.print("Nhập độ dài mảng 2: ");
        int length2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[length2];
        int[] arr3 = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            System.out.print("Nhập số tại vị trí[" + i + "] của mảng 1 ");
            int ele = Integer.parseInt(sc.nextLine());
            arr1[i] = ele;


            arr3[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            System.out.print("Nhập số tại vị trí[" + i + "] của mảng 2 ");
            int ele = Integer.parseInt(sc.nextLine());
            arr2[i] = ele;
            arr3[i + length1] = arr2[i];
        }
        System.out.println("Mảng được gộp là: " + Arrays.toString(arr3));
    }
}
