package case_study.Utils.Exception;

import java.util.Scanner;

public class ExceptionHandling {
    private static Scanner scanner = new Scanner(System.in);
    public static int enterInteger(){
        int number;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >0){
                    return number;
                }
                System.out.println("Vui lòng nhập số nguyên!");
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);
    }
}
