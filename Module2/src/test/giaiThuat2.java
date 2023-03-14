package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200 (tính cả 10 và 200).
// Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy.
public class giaiThuat2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bắt đầu");
        int startNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số kết thúc");
        int endtNumber = Integer.parseInt(scanner.nextLine());
        for (int i = startNumber; i < endtNumber; i++) {
            if ((i % 7 == 0) && (i % 5 != 0)) {
                list.add(i);
            }
        }
        showList(list);
    }

    public static void showList(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                System.out.print(list.get(i) + ",");
            }
        }
    }
}
