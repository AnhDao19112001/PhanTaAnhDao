package ss13.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class thuat_toan_tinh_toan {
    public static int binarySearch(int[] array, int value, int right, int left){
        int middle = (left+right)/2;
        if (left<=right){
           if (array[middle]==value){
               return middle;
           } else if (array[middle]>value) {
               return binarySearch(array,value,middle-1,left);
           }else {
               return binarySearch(array, value, right, middle+1);
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("Nhập phần tử thứ: ["+ i+ "]");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập số cần tìm trong mảng: ");
        int numb = Integer.parseInt(scanner.nextLine());
        Arrays.sort(arr);
        System.out.println("Thứ tuwk của số cần tìm trong mảng "+ binarySearch(arr,numb,arr.length-1,0));
    }
}
