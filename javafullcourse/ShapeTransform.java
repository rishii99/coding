import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShapeTransform extends JPanel implements ActionListener {
    private int x = 100, y = 100; // Initial position of the shape
    private int width = 100, height = 100; // Dimensions of the shape
    private double angle = 0; // Rotation angle
    private double scale = 1; // Scaling factor

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Shape Transformation");
        ShapeTransform panel = new ShapeTransform();

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(100, panel);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Apply transformations
        g2d.translate(x, y);
        g2d.rotate(angle);
        g2d.scale(scale, scale);

        // Draw a rectangle (you can replace this with any 2D shape)
        g2d.setColor(Color.BLUE);
        g2d.fillRect(-width / 2, -height / 2, width, height);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Example transformations
        angle += Math.toRadians(5); // Rotate by 5 degrees
        scale += 0.01; // Gradually increase the scale
        if (scale > 2) scale = 1; // Reset scale after it doubles

        repaint(); // Repaint the panel to reflect transformations
    }
}