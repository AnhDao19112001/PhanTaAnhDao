package ss4;

public class PhuongTinhBac2 {
    public static void main(String[] args) {

        QuadraticEquation quadraticEquation = new QuadraticEquation(3,4,5);
        System.out.println(quadraticEquation.getDiscriminant());

//        System.out.println(QuadraticEquation.getRoot1());
//
//        System.out.println(QuadraticEquation.getRoot2());

         //cach 1 dung if else.
//        double a, b, c, x1, x2, delta;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap a (a!=0) :");
//        a = sc.nextDouble();
//        System.out.println("nhap b :");
//        b = sc.nextDouble();
//        System.out.println("nhap c :");
//        c = sc.nextDouble();
//        System.out.println("Phuong trinh bac 2 co bang = " + a + "x^2" + b + "x" + c + "=0");
//        delta = Math.pow(b, 2) - 4 * a * c;
//        if(delta<0){
//            System.out.println("Phuong trinh vo nghiem");
//        }else if (delta ==0){
//            x1 = x2 = (-b)/2*a;
//            System.out.println("Phuong trinh co 1 nghiem kep la x1 = x2 =" + (-b)/2*a );
//        }else {
//            x1= -b + Math.sqrt(delta)/2*a;
//            x2 = -b - Math.sqrt(delta)/2*a;
//            System.out.println("Phuong trinh co 2 nghiem la " + x1 + "va" + x2);
//        }
    }
}
