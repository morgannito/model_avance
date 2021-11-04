import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

class DrawingApp extends Canvas {
    JFrame frame;

    public static void main(String[] args) {
        new DrawingApp();
    }

    public DrawingApp() {
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
            System.out.println("Clear shapes");
            refresh();
        });
        buttonPanel.add(clearButton);

        var drawingApp = this;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse pressed at " + e.getX() + " " + e.getY());
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
        g.fillOval(150, 100, 100, 100);
        g.fillRect(150, 250, 100, 100);
    }
}
