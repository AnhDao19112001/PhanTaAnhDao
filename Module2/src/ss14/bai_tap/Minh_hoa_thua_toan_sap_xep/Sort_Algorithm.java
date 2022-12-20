package ss14.bai_tap.Minh_hoa_thua_toan_sap_xep;

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

        for (int i = 0; i < array.length; i++) {
            int pos = array[i]; // Cho biến tạm bằng giá trị ban dầu của i, tị i=1 thì temp = 3;
            System.out.println("Array " + Arrays.toString(array) + "pos= " + pos);
            int x = i;
            for (; x > 0 && pos < array[x - 1]; x--) {
                array[x] = array[x - 1]; //Thõa mãn điều kiện thì sẽ đổi chỗ, mảng hiện tại ở i=1 là []
                System.out.println("Array " + Arrays.toString(array) + "pos= " + pos);
            }
            array[x] = pos; // tại i=1 thì arr[0] = ..., mảng iện tại array[]
            System.out.println("Array " + Arrays.toString(array) + "pos= " + pos);
        }
        System.out.println(Arrays.toString(array));
    }
}

