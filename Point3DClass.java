package Point2D;

import org.w3c.dom.ls.LSOutput;

public class Point3DClass extends Point2DClass{
    private float z;

        public Point3DClass (float x, float y, float z) {
        this.x=x;
        this.y=y;
        this.z=z;


    }
        public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public String toString(){
            return "This is a number " + getX();

    }
    public static void main(String args[]) {
            Point3DClass number =new Point3DClass(10,25,85);
        System.out.println(number);
        }

}
