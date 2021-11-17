package Dessin;
import java.awt.*;
import java.util.List;

public class Creeper implements Shape{
    private int x;
    private int y;
    private int size;

    public Creeper(int x, int y, int s){
        this.x = x;
        this.y = y;
        this.size = s;
    }


    @Override
    public void draw(Graphics g) {
        /*int scale = this.size / 8;*/
        // back color and outline
        g.setColor(new Color(14, 179, 34));
        g.fillRect(this.x-(4*this.size),this.y-(4*this.size),this.size*32,this.size*32);
        g.setColor(new Color(0,0,0));
        g.drawRect(this.x-(4*this.size),this.y-(4*this.size),this.size*32,this.size*32);
        // eyes
        g.fillRect(this.x,this.y,this.size*8,this.size*8); //left
        g.fillRect(this.x+(16*this.size),this.y,this.size*8,this.size*8); //right
        // mouth
        g.fillRect(this.x+(4*this.size),this.y+(12*this.size),this.size*4,this.size*12); //left part
        g.fillRect(this.x+(8*this.size),this.y+(8*this.size),this.size*8,this.size*12); //middle part
        g.fillRect(this.x+(16*this.size),this.y+(12*this.size),this.size*4,this.size*12); //right part

    }

    @Override
    public List<Shape> getChildren() {
        return null;
    }
}