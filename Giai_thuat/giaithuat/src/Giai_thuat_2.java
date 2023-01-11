import java.util.Scanner;

//Nhập 2 xâu ký tự và in ra ký tự trùng lặp
public class Giai_thuat_2 {
    public static String timKiTuChung(String str1, String str2) {
        StringBuilder str3 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    str3.append(str1.charAt(i));
                    str2 = str2.substring(0, j) + str2.substring(j + 1);
                    break;
                }
            }
        }
        return str3.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1:");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi 2:");
        String str2 = sc.nextLine();
        System.out.println("Ký tự chung của 2 chuỗi là: "+timKiTuChung(str1, str2));
    }
}
