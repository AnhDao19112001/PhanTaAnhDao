package s11.bai_tap.reverse;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> numberStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int number = Integer.parseInt(sc.nextLine());
        int array [] = new int[number];
        for (int i = 0; i < array.length; i++){
            System.out.println("Nhap cac phan tu [" + i + "]");
            array[i]=Integer.parseInt(sc.nextLine());
            numberStack.push(array[i]);
        }
        while(!numberStack.isEmpty()) {
            System.out.print(numberStack.pop() + "\t");
        }
    }
}
