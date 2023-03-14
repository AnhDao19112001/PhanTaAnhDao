package ss6.bai_tap.point2d_point3d;

public class Point3D extends Point2D {
    private float z = 0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), getZ()};
    }

    public String toString() {
        return super.toString() + ", " + getZ();
    }
}
