package s11.bai_tap.BinarySystem;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so chuyen doi");
        int number = sc.nextInt();

        while (number > 0) {
            integerStack.push(number % 2);
            number /= 2;
        }
        System.out.println("Ket qua chuyen doi: ");
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }
}
