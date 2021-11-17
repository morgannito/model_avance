package Dessin;
import java.awt.*;
import java.util.List;

public class Circle implements Shape {

    int x ;
    int y ;
    int radius;

    public Circle(int x, int y, int radius) {
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

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw(Graphics g) {
        g.fillOval(x, y, 100, 100);
    }

    @Override
    public List<Shape> getChildren() {
        return null;
    }
}
