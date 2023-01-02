package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int doDaimang = Integer.parseInt(sc.nextLine());
        int arr[] = new int[doDaimang];
        for (int i = 0; i < doDaimang; i++) {
            System.out.print("Nhập số tại vị trí[" + i + "] ");
            int ele = Integer.parseInt(sc.nextLine());
            arr[i] = ele;
        }
        System.out.println("Nhập số X cần tìm: ");
        int numb = sc.nextInt();
        for (int i = 0; i < doDaimang; i++) {
            if (numb == arr[i]) {
                System.out.println("Vị trí của X: " + i);
                for (int j = i; j < doDaimang - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[doDaimang - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
