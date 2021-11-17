package Factory;

import Dessin.Shape;

public interface ShapeFactory {
    Shape makeShape(int x, int y);
}
