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
        rectCirc.shapes.add(new Rectangle(x+7, y+57, 35, 80));

//        rectCirc.shapes.add(new Rectangle(x-10, y+50+150, 35, 40));
//        rectCirc.shapes.add(new Rectangle(x+30, y+50+150, 35, 40));

        // jambe
        rectCirc.shapes.add(new Rectangle(x-10, y+57+80, 35,40 ));
        rectCirc.shapes.add(new Rectangle(x+30, y+57+80, 35,40));
// pied
        rectCirc.shapes.add(new Rectangle(x-10, y+57+80+20, 35,20 ));
        rectCirc.shapes.add(new Rectangle(x+30, y+57+80+20, 35,20 ));

        return rectCirc;
    }
}
