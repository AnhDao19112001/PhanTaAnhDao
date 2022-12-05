package ss3.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] src1 = {28, 14, 35, 19};
        int[] src2 = {17, 40, 23};
        int[] dst = new int[src1.length + src2.length];

        System.arraycopy(src1, 0, dst, 0, src1.length);
        System.arraycopy(src2, 0, dst, src1.length, src2.length);

        System.out.println(Arrays.toString(dst));
    }
}
