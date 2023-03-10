package giai_thuat.giaiThuat1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//Viết hàm truyền vào một mảng 2 chiều (n x n) chứa các số nguyên bất kỳ.
//Hàm sẽ trả về 1 mảng (1 chiều ) các số nguyên tố đã được sắp xếp. Với các phần tử là các số nguyên tố xuất hiện trong mảng 2 chiều.
public class bai5 {
    public static void main(String[] args) {
        int soDong, soCot;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        int[][] arr = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
            Set<Integer> s = new TreeSet<>();
            int count;
            for (int i = 0; i < arr[i].length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    count = 0;
                    for (int k = 1; k < arr[i][j]; k++) {
                        if (arr[i][j] % k == 0) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        s.add(arr[i][j]);
                    }
                }
            }
            int[] a2 = new int[s.size()];
            int i = 0;
            for (int a : s) {
                a2[i++] = a;
            }
        System.out.println(a2);
        }
    }
