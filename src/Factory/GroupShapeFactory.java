package Factory;
import Dessin.*;

public class GroupShapeFactory implements ShapeFactory {
    private int width, height, radius;

    public GroupShapeFactory(int width, int height, int radius) {
        this.width = width;
        this.height = height;
        this.radius = radius;
    }
    @Override
    public Shape makeShape(int x, int y) {
        GroupShape rectCirc = new GroupShape();
        rectCirc.shapes.add(new Rectangle(x, y, 66,55));
        rectCirc.shapes.add(new Rectangle(x+25, y, 100, 200));
        return rectCirc;
    }
}
