package Dessin;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class GroupShape implements Shape {
    public List<Shape> shapes = new ArrayList<>();
    public GroupShape() {

    }
    GroupShape(GroupShape copyGroup) {
        this.shapes.addAll(copyGroup.shapes);
    }

    @Override
    public void draw(Graphics g) {
        for (Shape d : shapes) d.draw(g);
    }

    @Override
    public List<Shape> getChildren() {
        return shapes;
    }

}




