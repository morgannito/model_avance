package Dessin;

import java.awt.*;
import java.util.List;

public interface Shape {
    void draw(Graphics g);
    List<Shape> getChildren();
}
