package Factory;

import Dessin.Rectangle;
import Dessin.Shape;

public class RectangleFactory implements ShapeFactory {
    int width = 100;
    int height = 100;

    @Override
    public Shape makeShape(int x, int y) {
        return new Rectangle(x, y, width, height);
    }
}

