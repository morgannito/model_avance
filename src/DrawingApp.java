import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import Dessin.*;
import Factory.*;

public class DrawingApp extends Canvas {
    JFrame frame;
    Rectangle rectangle ;
    Circle circle ;
//    int coinflip;
    ArrayList<Shape> list_shape = new ArrayList<>();
    ShapeFactory myFactory;

    public static void main(String[] args) {
        new DrawingApp();
    }

    public DrawingApp() {
        myFactory = new RectangleFactory();
//        coinflip = 1;
        this.initFrame();
    }

    void initFrame() {

        frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setPreferredSize(new Dimension(400, 400));
        frame.add(this, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        frame.add(buttonPanel, BorderLayout.PAGE_END);

        JButton rectangleButton = new JButton("rectangle");
        rectangleButton.addActionListener((ActionEvent e) -> {
            myFactory = new RectangleFactory();
            System.out.println("Rectangle");
            refresh();
        });
        buttonPanel.add(rectangleButton);

        // Button Circle
        JButton circleButton = new JButton("Circle");
        circleButton.addActionListener((ActionEvent e) -> {
            myFactory = new CircleFactory();
            System.out.println("Circle");
            refresh();
        });
        buttonPanel.add(circleButton);

        // Button Clear
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
                Shape shape = myFactory.makeShape(e.getX(), e.getY());
                drawingApp.list_shape.add(shape);
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

