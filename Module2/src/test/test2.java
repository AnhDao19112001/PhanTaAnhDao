package test;

public class test2 {
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
