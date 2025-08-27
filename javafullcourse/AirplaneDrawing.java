import javax.swing.*;
import java.awt.*;

public class AirplaneDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color to light blue (sky)
        this.setBackground(Color.CYAN);

        // Draw the airplane body
        g.setColor(Color.GRAY);
        g.fillRoundRect(100, 100, 250, 60, 30, 30); // Main body

        // Draw the wings
        g.setColor(Color.DARK_GRAY);
        g.fillRect(140, 130, 100, 20); // Left wing
        g.fillRect(210, 130, 100, 20); // Right wing

        // Draw the airplane tail
        int[] xPoints = {330, 350, 330}; // X-coordinates
        int[] yPoints = {100, 90, 120}; // Y-coordinates
        g.fillPolygon(xPoints, yPoints, 3); // Tail fin

        // Draw the airplane windows
        g.setColor(Color.WHITE);
        for (int i = 0; i < 5; i++) {
            g.fillOval(120 + (i * 40), 110, 15, 15);
        }

        // Draw the airplane nose (front part)
        g.setColor(Color.GRAY);
        g.fillArc(85, 100, 30, 60, 90, 180); // Nose shape

        // Draw a cloud
        g.setColor(Color.WHITE);
        g.fillOval(250, 50, 50, 30);
        g.fillOval(270, 40, 50, 30);
        g.fillOval(290, 50, 50, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Airplane Drawing");
        AirplaneDrawing airplane = new AirplaneDrawing();

        frame.add(airplane);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
