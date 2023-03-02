package Point2D;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class Point2DClass {
    float x;
    float y;

    public Point2DClass(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2DClass() {
        x = 125.568f;
        y = 258.596f;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Point2DClass number = new Point2DClass();
        System.out.println(number.y);
        System.out.println(number.x);
    }

}
