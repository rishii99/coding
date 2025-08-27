import javax.swing.*;
import java.awt.*;

public class BicycleDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set color for the cycle
        g.setColor(Color.BLACK);

        // Draw wheels (circles)
        g.drawOval(50, 200, 100, 100);  // Rear wheel
        g.drawOval(250, 200, 100, 100); // Front wheel

        // Draw the frame (triangular structure)
        g.drawLine(100, 250, 200, 150); // Rear frame
        g.drawLine(200, 150, 300, 250); // Front frame
        g.drawLine(100, 250, 300, 250); // Bottom frame

        // Draw seat
        g.drawLine(180, 140, 220, 140); // Seat bar
        g.drawLine(200, 150, 200, 140); // Seat support

        // Draw handlebars
        g.drawLine(300, 250, 330, 200); // Handlebar stem
        g.drawLine(330, 200, 360, 200); // Handlebar

        // Draw pedals
        g.drawLine(200, 200, 220, 220); // Right pedal
        g.drawLine(200, 200, 180, 220); // Left pedal
    }

    // Create the frame to display the bicycle
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bicycle Drawing");
        BicycleDrawing bicycle = new BicycleDrawing();

        frame.add(bicycle);
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
