package dessin;

import java.awt.*;

public class Circle implements Shape {

    int x ;
    int y ;
    float radius;

    public Circle(int x, int y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public void draw(Graphics g) {
        g.fillOval(150, 100, 100, 100);
    }
}
