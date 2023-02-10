import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm: ");
        String date = scanner.nextLine();
        // validate
            LocalDate myObj = LocalDate.parse(date);
            System.out.println(myObj);
        }
    }



