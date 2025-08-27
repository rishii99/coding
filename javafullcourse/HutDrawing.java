import javax.swing.*;
import java.awt.*;

public class HutDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the roof (Triangle)
        int[] xPoints = {100, 250, 400};
        int[] yPoints = {100, 20, 100};
        g.setColor(new Color(139, 69, 19)); // Brown color for roof
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 3);

        // Draw the walls (Rectangle)
        g.setColor(new Color(210, 180, 140)); // Tan color for walls
        g.fillRect(120, 100, 260, 200);
        g.setColor(Color.BLACK);
        g.drawRect(120, 100, 260, 200);

        // Draw the door (Rectangle)
        g.setColor(new Color(160, 82, 45)); // SaddleBrown color for door
        g.fillRect(220, 200, 60, 100);
        g.setColor(Color.BLACK);
        g.drawRect(220, 200, 60, 100);

        // Draw windows (Two small rectangles)
        g.setColor(new Color(173, 216, 230)); // Light blue for glass
        g.fillRect(140, 140, 60, 50); // Left window
        g.fillRect(300, 140, 60, 50); // Right window
        g.setColor(Color.BLACK);
        g.drawRect(140, 140, 60, 50);
        g.drawRect(300, 140, 60, 50);

        // Adding window divisions
        g.drawLine(140, 165, 200, 165); // Left window horizontal division
        g.drawLine(170, 140, 170, 190); // Left window vertical division
        g.drawLine(300, 165, 360, 165); // Right window horizontal division
        g.drawLine(330, 140, 330, 190); // Right window vertical division
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hut Drawing");
        HutDrawing hut = new HutDrawing();

        frame.add(hut);
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
