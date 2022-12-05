package ss3;

import java.util.Scanner;

public class TongCacSoOCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dòng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cột: ");
        int col = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử của hàng " + (i + 1) + " cột " + (j + 1));
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Nhập cột cần tính tổng: ");
        int colNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colNum];
        }
        System.out.println(sum);
    }
}