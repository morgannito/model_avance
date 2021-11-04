import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import dessin.*;

public class DrawingApp extends Canvas {
    JFrame frame;
    Rectangle rectangle ;
    Circle circle ;
    int coinflip;
    ArrayList<Shape> list_shape = new ArrayList<>();

    public static void main(String[] args) {
        new DrawingApp();
    }

    public DrawingApp() {
        coinflip = 1;
        this.initFrame();
    }

    void initFrame() {

        frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setPreferredSize(new Dimension(400, 400));
        frame.add(this, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        frame.add(buttonPanel, BorderLayout.PAGE_END);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener((ActionEvent e) -> {
            list_shape.clear();
            System.out.println("Clear shapes");
            refresh();
        });
        buttonPanel.add(clearButton);
        DrawingApp drawingApp = this;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse pressed at " + e.getX() + " " + e.getY());
                if (coinflip == 1){
                    list_shape.add(new Rectangle(e.getX(),e.getY(),100,100));
                    coinflip = 2;
                }else{
                    list_shape.add(new Circle(e.getX(),e.getY(),100));
                    coinflip = 1;
                }
                System.out.println(list_shape);
                drawingApp.refresh();
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    void refresh() {
        this.update(this.getGraphics());
    }

    public void paint(Graphics g) {
        for (Shape dessin : list_shape) {
            dessin.draw(g);
        }
    }
}

