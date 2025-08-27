import javax.swing.*;
import java.awt.*;

public class CarDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color for car body
        g.setColor(Color.BLUE);
        
        // Draw the main body of the car (rectangle)
        g.fillRect(100, 150, 300, 100);

        // Draw the top part of the car (roof)
        g.fillRect(160, 100, 180, 50);

        // Set color for windows
        g.setColor(Color.CYAN);
        
        // Draw windows (rectangles)
        g.fillRect(170, 110, 60, 40); // Left window
        g.fillRect(270, 110, 60, 40); // Right window

        // Set color for wheels
        g.setColor(Color.BLACK);
        
        // Draw wheels (circles)
        g.fillOval(130, 230, 50, 50); // Left wheel
        g.fillOval(320, 230, 50, 50); // Right wheel

        // Set color for headlights
        g.setColor(Color.YELLOW);
        
        // Draw headlights
        g.fillOval(90, 170, 20, 20); // Left headlight
        g.fillOval(390, 170, 20, 20); // Right headlight
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Drawing");
        CarDrawing car = new CarDrawing();

        frame.add(car);
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
