package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua dong va cot (dong = cot): ");
        int row = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][row];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Nhap cac phan tu vao vi tri: [" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(sc.nextLine());
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Tong so duowng cheo chinh trong Maxtrix la:" + sum);
    }
}
