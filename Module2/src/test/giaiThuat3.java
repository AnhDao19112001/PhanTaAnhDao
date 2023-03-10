package test;
// viết chương trình tính giai thừa của 1 số được nhập vào.
public  class giaiThuat3 {
    public static void giaiThua(int num){
        int S = 1;
        for (int i = 1; i <= num; i++) {
            S *= i;
        }
        System.out.println(S);
    }
    public static void main(String[] args) {
        giaiThua(8);
    }
}
