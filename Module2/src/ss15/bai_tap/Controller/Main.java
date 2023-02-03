package ss15.bai_tap.Controller;

import ss15.bai_tap.exception.IllegalRightTriangleException;

import java.util.Scanner;

public class Main {
    public Main(double firstEdge, double secondEdge, double thirdEdge) throws IllegalRightTriangleException {
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
            throw new IllegalRightTriangleException("Cạnh của tam giác phải > 0");
        } else if (firstEdge + secondEdge <= thirdEdge || firstEdge + thirdEdge <= secondEdge || secondEdge + thirdEdge <= firstEdge) {
            throw new IllegalRightTriangleException("Cạnh của tam giác phải thõa mãn điểu kiện a + b > c");
        } else {
            System.out.println("Hợp lệ!");
        }
    }

    public static void main(String[] args) {
        double firstEdge;
        double secondEdge;
        double thirdEdge;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        do {
                try {
                    System.out.println("Nhập canh thứ nhất: ");
                    firstEdge = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập canh thứ hai: ");
                    secondEdge = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập cạnh thứ ba: ");
                    thirdEdge = Double.parseDouble(scanner.nextLine());
                    System.out.println("Cạnh thứ nhất :" + firstEdge);
                    System.out.println("Cạnh thứ hai :" + secondEdge);
                    System.out.println("Cạnh thứ ba :" + thirdEdge);
                    Main main = new Main(firstEdge, secondEdge, thirdEdge);
                    check = false;
                } catch (IllegalRightTriangleException e) {
                    System.out.println(e.getMessage());
                    check=true;
                }
        }while (check);

    }
}
