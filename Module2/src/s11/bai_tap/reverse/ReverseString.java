package s11.bai_tap.reverse;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> ReverseString = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ky: ");
        String string = sc.nextLine();
        String [] array = string.split("");

        for (int i = 0; i < array.length ; i++) {
            ReverseString.push(array[i]);
        }
        String strings = "";
        for (int i = 0; i <array.length ; i++) {
            strings = strings + ReverseString.pop();
        }
        System.out.print("Chuoi sau khi chuyen doi: " + strings);
    }
}
