package ss13.thua_hanh.tinh_do_phuc_ta;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i=0; i < inputString.length(); i++){
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii] +=1;
        }

        int max = 0;
        char character = (char) 255;
        for (int j=0;j<255;j++){
            if (frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }

        System.out.println("The most appearing ltter is '"+ character +"'with a frequency of " + max + "times");
        System.out.println("Độ phứt tạp của thuật toán: " + (inputString.length()+255));
    }

}
