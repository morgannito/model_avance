package Factory;
import Dessin.*;

public class GroupFactory implements ShapeFactory {
    private int width, height, radius;
    public GroupFactory(int width, int height, int radius) {
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    @Override
    public Shape makeShape(int x, int y) {
        GroupShape rectCirc = new GroupShape();
        rectCirc.shapes.add(new Creeper(x, y, 2));
        rectCirc.shapes.add(new Rectangle(x+7, y+55, 50, 150));
        return rectCirc;
    }
}
