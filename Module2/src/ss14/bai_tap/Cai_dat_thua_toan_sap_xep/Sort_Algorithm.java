package ss14.bai_tap.Cai_dat_thua_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("array[i] = " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.toString(array));

        int pos;
        int x;
        for (int i = 1; i < array.length; i++) {
            pos = array[i];
            x = i;
            while (x > 0 && pos < array[x - 1]) {
                array[x] = array[x - 1];
                x--;
            }
            array[x] = pos;
        }
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}

