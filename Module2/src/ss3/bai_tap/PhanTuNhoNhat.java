package ss3.bai_tap;
import java.util.Scanner;
public class PhanTuNhoNhat {
        public static void main(String[] args) {

            double[] numberArr = { 12.3, -4, 10, 4.24, 2, 71, -2, -6 };

            double max = numberArr[0];

            System.out.println("\n\nCác phần tử trong mảng là: ");
            for(double i : numberArr){
                System.out.print(i + ", ");
            }

            for (double num: numberArr) {
                if(max < num)
                    max = num;
            }
            System.out.printf("\nSố lớn nhất trong mảng là: %.2f", max);
        }
    }

