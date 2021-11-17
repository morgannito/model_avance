package Factory;
import Dessin.Circle;
import Dessin.Shape;

public class CircleFactory implements ShapeFactory{
    int radius = 50;
    @Override
    public Shape makeShape(int x, int y) {
        return new Circle(x, y,radius);
    }
}
