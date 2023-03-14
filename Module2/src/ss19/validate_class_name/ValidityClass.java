package ss19.validate_class_name;

import java.util.Scanner;

public class ValidityClass {
    private static final String REGEX_PHONE =  "^[(][0-9]{2}[)][-][(](0)[0-9]{9}[)]$";

    public static void main(String[] args) {
        System.out.println("Nhập số điện: ");
        Scanner scanner =new Scanner(System.in);
        String numPhone = scanner.nextLine();
        System.out.println(numPhone.matches(REGEX_PHONE));
    }
}
