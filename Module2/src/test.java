import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNumb = 1;
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        while (primeNumb < n) {
            int count = 0;
            for (int i = 1; i <= primeNumb; i++) {
                if (primeNumb % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(primeNumb);
            }
            primeNumb++;
        }
    }
}


