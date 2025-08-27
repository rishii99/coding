import javax.swing.*;
import java.awt.*;

public class SpectaclesDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color for the spectacles
        g.setColor(Color.BLACK);

        // Draw left lens (circle)
        g.drawOval(100, 100, 100, 100);

        // Draw right lens (circle)
        g.drawOval(250, 100, 100, 100);

        // Draw the bridge (line connecting both lenses)
        g.drawLine(200, 150, 250, 150);

        // Draw the left temple (side frame)
        g.drawLine(100, 130, 60, 110);

        // Draw the right temple (side frame)
        g.drawLine(350, 130, 390, 110);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spectacles Drawing");
        SpectaclesDrawing specs = new SpectaclesDrawing();

        frame.add(specs);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
