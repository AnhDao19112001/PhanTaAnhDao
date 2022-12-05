//package ss3;
//import java.util.Scanner;
//public class ThemPhanTuVaoMang {
//        public static void main(String[] args) {
//            int size = 20; // Suc chua cua mang
//            int[] arr = new int[size];
//            arr[0] = 1;
//            arr[1] = -1;
//            arr[2] = 6;
//            arr[3] = 5;
//            arr[4] = 3;
//            int n = 5; // So luong phan tu trong mang hien tai
//            int x = 10;
//            System.out.print("Truoc khi them: ");
//            for (int i = 0; i < n; i++)
//                System.out.print(arr[i] + " ");
//            // Inserting key
//            n = insert(arr, size, n, x);
//            System.out.print("\nSau khi them: ");
//            for (int i = 0; i < n; i++)
//                System.out.print(arr[i] + " ");
//        }
//        static int insert(int[] arr, int size, int n, int x) {
//            // Neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
//            if (n >= size) {
//                return n;
//            }
//            // them X vao vi tri cuoi cua mang
//            arr[5] = x;
//            return n + 1; // tang so luong phan tu cua mang them 1
//        }
//    }
package ss3;
import java.util.Arrays;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length + 1];
        for (int i = 0; i < array.length-1; i++) {
            System.out.printf("Nhập array[%d]: ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử cần chèn vào mảng: ");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index < 0 || index > array.length) {
            System.out.println("không chèn được phần tử vào mảng!");
        } else {
            for (int i = array.length-1; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = number;
            System.out.println("Mảng sau khi chèn: ");
            System.out.println(Arrays.toString(array));
        }
    }
}