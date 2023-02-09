package giai_thuat.giaiThuat1;
//Cho mảng [3,1,2,4,4,7] Tìm các số tự nhiên liên tiếp còn thiếu trong mảng.
//Giải thích như sau. Trong mảng ta thấy số nhỏ nhất là 1 lớn nhất là 7 -> đầy đủ phải là 1,2,3,4,5,6,7
// nhưng hiện tại đang thiếu số 5,6.
//Vậy suy ra các số còn thiếu là 5,6.
public class giai_thuat {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2, 3, 3, 4, 7};
        int minNum = arr[0];
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
            if (maxNum<arr[i]){
                maxNum=arr[i];
            }
        }
        boolean flag =false;
        while (minNum<maxNum){
            flag=true;
            for (int i = 0; i <arr.length ; i++) {
                if (minNum==arr[i]){
                    flag =false;
                    break;
                }
            }
            if (flag ==true){
                System.out.println(minNum);
            }
            minNum++;
        }
    }
}
