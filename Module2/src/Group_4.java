import java.util.Arrays;
import java.util.Scanner;

public class Group_4 {
    public static boolean isPrime(int k){
        boolean kt=true;
        if (k<2) {
            kt=false;
        }
        else {
            for (int i=2;i<=Math.sqrt(k);i++){
                if (k%i==0){
                    kt=false;
                    break;
                }
            }
        }
        return kt;
    }

    public static int fibo(int k){
        if (k<2) return 1;
        return fibo(k-1)+fibo(k-2);
    }
    public static void main(String[] args) {
        int arr[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Số phần tử bạn muốn: ");
        int n=Integer.parseInt(sc.nextLine());
        arr=new int[n];

        int j=1;
        int i=0;
        while (i<n){
            if (isPrime(fibo(j))){
                arr[i]=fibo(j);
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
