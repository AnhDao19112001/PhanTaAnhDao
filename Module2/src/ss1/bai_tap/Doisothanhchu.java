package ss1.bai_tap;

import java.util.Scanner;

public class Doisothanhchu {
    public static void main(String[] args) {

        System.out.println("vui long nhap vao chuoi");
        Scanner so = new Scanner(System.in);
        int num = Integer.parseInt(so.nextLine());
        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("out of ability");
                break;
        }
        if (num >= 10 && num < 20) {
            int b = num % 10;
            // b la phan chia lay du
            switch (b) {
                case 0:
                    System.out.println("Ten");
                case 1:
                    System.out.println("Elevent");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }
        if (num >= 20 && num < 100) {
            int tens = num / 10;
            int ones = num % 10;
            switch (tens) {
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirty");
                    break;
                case 4:
                    System.out.println("Forty");
                    break;
                case 5:
                    System.out.println("Fifty");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        if (num >= 100 && num < 1000) {
            switch (num / 100) {
                case 1:
                    System.out.print("One hundred ");
                    break;
                case 2:
                    System.out.print("Two hundred ");
                    break;
                case 3:
                    System.out.print("Three hundred ");
                    break;
                case 4:
                    System.out.print("Four hundred ");
                    break;
                case 5:
                    System.out.print("Five hundred ");
                    break;
                case 6:
                    System.out.print("Six hundred ");
                    break;
                case 7:
                    System.out.print("Seven hundred ");
                    break;
                case 8:
                    System.out.print("Eight hundred ");
                    break;
                case 9:
                    System.out.print("Nine hundred ");
                    break;
            }
            switch (num / 10 % 10) {
                case 0:
                    switch (num % 10) {
                        case 0:
                            System.out.print("");
                            break;
                        case 1:
                            System.out.print("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.print("Seven");
                            break;
                        case 8:
                            System.out.print("Eight");
                            break;
                        case 9:
                            System.out.print("Nine");
                            break;
                    }
                    break;
                case 1:
                    switch (num % 10) {
                        case 0:
                            System.out.print("Ten");
                            break;
                        case 1:
                            System.out.print("Eleven");
                            break;
                        case 2:
                            System.out.print("Twelve");
                            break;
                        case 3:
                            System.out.print("Thirteen");
                            break;
                        case 4:
                            System.out.print("Fourteen");
                            break;
                        case 5:
                            System.out.print("Fifteen");
                            break;
                        case 6:
                            System.out.print("Sixteen");
                            break;
                        case 7:
                            System.out.print("Seventeen");
                            break;
                        case 8:
                            System.out.print("Eighteen");
                            break;
                        case 9:
                            System.out.print("Nineteen");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Fourty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            if (num / 10 % 10 > 1){
                switch (num%10){
                    case 0:
                        System.out.print("");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            }
        }
    }
}
