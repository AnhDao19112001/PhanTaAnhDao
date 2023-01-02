package ss2.bai_tap;

public class ShowFirst20Primes {

    public static void main(String[] args) {
        int i=0;
        int n=2;
        int k=2;
        while (i<20){
            boolean kt=true;
            for (k=2;k<=Math.sqrt(n);k++){
                if (n%k==0){
                    kt=false;
                    break;
                }
            }
            if (kt) {
                System.out.println(n);
                n++;
                i++;
            }
            else {
                n++;
            }
        }
    }
}