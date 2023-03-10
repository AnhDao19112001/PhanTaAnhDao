package test;

// Nhập 1 số nguyên dương, tính S=1+2+...+n.
public class giaiThuat1 {

    public static void sum(int n) {
        int S = 0;
        for (int i = 1; i <= n; i++) {
            S += i;
        }
        System.out.println(S);
    }

    public static void sum1(int n) {
        int S = 2;
        for (int i = 1; i <= n ;i++) {
            S +=10;
        }
        System.out.println(S);
    }
    public static void sum2(float n){
        float s = (float) 0.2;
        for (float i = 1; i <= n ; i++) {
            s += 1/i;
        }
        System.out.println(s);
    }
    public static void sum3(int n){
        int s = 1;
        for (int i = 1; i <= n ; i++) {
            s = s*i;
        }
        System.out.println(s);
    }
    public static long sum4(int n){
        long s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }

    public static void main(String[] args) {

        sum(10);

        sum1(3);

        sum2(3);

        sum3(3);

        long S = 0;
        for (int i = 1; i <= 5; i++) {
            S += sum4(i);
        }
        System.out.println(S);
    }

}
