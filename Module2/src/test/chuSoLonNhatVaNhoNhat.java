package test;

import java.util.Arrays;
import java.util.Scanner;

public class chuSoLonNhatVaNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử vào mảng: ");
            int item = Integer.parseInt(scanner.nextLine());
            array[i] = item;
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Chữ số lớn nhất là: " + max);
        System.out.println("Chữ số nhỏ nhất là: " + min);
    }
}
