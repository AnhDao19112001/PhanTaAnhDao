package s11.bai_tap.Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> elementQueue = new LinkedList<>();
        Stack<String> elementStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string.");
        String string = scanner.nextLine().toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            elementQueue.offer(string.charAt(i) + "");
            elementStack.push(string.charAt(i) + "");
        }
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            String queueChar = elementQueue.poll();
            String stackChar = elementStack.pop();
            if (!queueChar.equals(stackChar)) {
                flag = false;

                break;
            }
        }
        if (flag) {
            System.out.println("Your string is palindrome.");
        } else {
            System.out.println("Your string isn't palindrome.");
        }
    }

}
