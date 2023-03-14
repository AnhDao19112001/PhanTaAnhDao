package s11.bai_tap.Map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi cam kiem tra: ");
        String string = sc.nextLine();

        String[] arr = string.toLowerCase().split(" ");
        for (String key : arr) {
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                int count = treeMap.get(key);
                treeMap.put(key, count + 1);
            }
        }
        System.out.println(treeMap);

        Set<String> stringSet = treeMap.keySet();
        System.out.println("\nso lan xuat hien cua moi phan tu trong chuoi la: ");
        for (String key : stringSet) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
