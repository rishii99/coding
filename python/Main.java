import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();  // Get panel width
        int height = getHeight(); // Get panel height

        // Divide screen into four regions
        int midX = width / 2;
        int midY = height / 2;

        // Draw vertical and horizontal dividing lines
        g.setColor(Color.BLACK);
        g.drawLine(midX, 0, midX, height);  // Vertical line
        g.drawLine(0, midY, width, midY);   // Horizontal line

        // Set different colors and fill shapes
        g.setColor(Color.RED);
        fillCircle(g, midX / 2, midY / 2, midX / 3);  // Filled Circle in top-left

        g.setColor(Color.BLUE);
        fillRectangle(g, midX + midX / 4, midY / 4, midX / 3, midY / 3);  // Filled Rectangle in top-right

        g.setColor(Color.GREEN);
        fillArc(g, midX / 4, midY + midY / 4, midX / 3, midY / 3, 0, 180);  // Filled Arc in bottom-left

        g.setColor(Color.ORANGE);
        fillEllipse(g, midX + midX / 4, midY + midY / 4, midX / 3, midY / 4);  // Filled Ellipse in bottom-right
    }

    // Method to fill a circle
    private void fillCircle(Graphics g, int x, int y, int radius) {
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    // Method to fill a rectangle
    private void fillRectangle(Graphics g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }

    // Method to fill an arc
    private void fillArc(Graphics g, int x, int y, int width, int height, int startAngle, int arcAngle) {
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }

    // Method to fill an ellipse
    private void fillEllipse(Graphics g, int x, int y, int width, int height) {
        g.fillOval(x, y, width, height);
    }

    // Main method to create frame and add panel
    public static void main(String[] args) {
        JFrame frame = new JFrame("Four Region Shapes");
        Main panel = new Main(); // Using Main as the panel class
        frame.add(panel);
        frame.setSize(800, 600); // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
