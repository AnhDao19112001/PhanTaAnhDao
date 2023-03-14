package ss3.bai_tap;

import java.util.Scanner;

public class TongCacSoOCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của dòng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập độ dài của cột: ");
        int col = Integer.parseInt(sc.nextLine());
        int arr2D[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập các phần tử vào vị trí [" + i + "]" + "[" + j + "] ");
                arr2D[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int result = 0;
        System.out.print("Nhập số cột cần tính tổng: ");
        int colSum = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr2D.length; i++) {
            result += arr2D[i][colSum];
        }
        System.out.print("Tổng của cột thứ: " + colSum + " là " + result);
    }
}