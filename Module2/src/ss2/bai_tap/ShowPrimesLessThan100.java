package ss2.bai_tap;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int primeNumb = 1;
        int i;
        System.out.println("Các SNT nhỏ hơn 100 là: ");
        while (primeNumb < 100) {
            int count = 0;
            for (i=1; i<=primeNumb; i++) {
                if (primeNumb%i==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(primeNumb);
            }
            primeNumb++;
        }
    }
}