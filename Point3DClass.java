package Point2D;

import org.w3c.dom.ls.LSOutput;

public class Point3DClass extends Point2DClass {
    private float z;

    public Point3DClass(float x, float y, float z) {
        super(x, y);
        this.z = z;


    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};

    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "This is a number " + getX();

    }
}
