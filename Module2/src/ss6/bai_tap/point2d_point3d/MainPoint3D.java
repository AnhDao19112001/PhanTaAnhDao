package ss6.bai_tap.point2d_point3d;

import java.util.Arrays;

public class MainPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println("Array of {x,y,z} = " + Arrays.toString(point3D.getXYZ()));
        System.out.printf("(%s)", point3D);

        point3D = new Point3D(1);
        System.out.println("\nArray of {x,y,z} = " + Arrays.toString(point3D.getXYZ()));
        System.out.printf("(%s)", point3D);

        point3D = new Point3D(2,3,4);
        System.out.println("\nArray of {x,y,z} = " + Arrays.toString(point3D.getXYZ()));
        System.out.printf("(%s)", point3D);

        point3D.setXYZ(5,6,7);
        System.out.println("\nArray of {x,y,z} = " + Arrays.toString(point3D.getXYZ()));
        System.out.printf("(%s)", point3D);
    }
}