import javax.swing.*;
import java.awt.*;

public class BoatDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        this.setBackground(Color.CYAN);

        // Draw the water waves
        g.setColor(Color.BLUE);
        for (int i = 0; i < 400; i += 40) {
            g.fillArc(i, 250, 40, 20, 0, 180);
        }

        // Set color for the boat hull
        g.setColor(Color.ORANGE);
        g.fillArc(120, 200, 160, 80, 0, -180);

        // Draw the boat mast (pole)
        g.setColor(Color.BLACK);
        g.fillRect(195, 120, 10, 80);

        // Draw the sail
        g.setColor(Color.WHITE);
        int[] xPoints = {200, 200, 260}; // X-coordinates
        int[] yPoints = {120, 200, 160}; // Y-coordinates
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw the sun
        g.setColor(Color.YELLOW);
        g.fillOval(300, 50, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boat Drawing");
        BoatDrawing boat = new BoatDrawing();

        frame.add(boat);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
